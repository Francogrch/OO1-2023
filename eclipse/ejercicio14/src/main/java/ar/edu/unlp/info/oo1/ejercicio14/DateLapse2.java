package ar.edu.unlp.info.oo1.ejercicio14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse2 implements DateLapseInterface {
	private LocalDate from;
	private int sizeInDays;

	public DateLapse2(LocalDate from, LocalDate to) {
		this.from = from;
		sizeInDays = (int) ChronoUnit.DAYS.between(from,to);
	};
	@Override
	public LocalDate getFrom() {
		return from;
	}
	
	@Override
	public LocalDate getTo() {
		return from.plusDays(sizeInDays);
	}
	@Override
	public int sizeInDays() {
		// TODO Auto-generated method stub
		return sizeInDays;
	}

	@Override
	public boolean includesDate(LocalDate other) {
		// TODO Auto-generated method stub
		return from.isBefore(other) && from.plusDays(sizeInDays).isAfter(other);
	}

}
