package ar.edu.unlp.info.oo1.ejercicio14;
import java.time.*;
import java.time.temporal.ChronoUnit;
public class DateLapse implements DateLapseInterface{
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from=from;
		this.to=to;
	}
	@Override
	public LocalDate getFrom() {
		return from;
	}
	@Override
	public LocalDate getTo() {
		return to;
	}
	@Override
	public int sizeInDays() {
		return (int) ChronoUnit.DAYS.between(from,to);
	}
	@Override
	public boolean includesDate(LocalDate other) {
		return from.isBefore(other) && to.isAfter(other);
	}
	public boolean overlaps (DateLapse anotherDateLapse) {
		if (this.includesDate(anotherDateLapse.getFrom())) {
			return false;
		}
		if (this.includesDate(anotherDateLapse.getTo())) {
			return false;
		}
		if (anotherDateLapse.includesDate(from)) {
			return false;
		}
		if (anotherDateLapse.includesDate(to)) {
			return false;
		}
		return true;
		
	}
}
