package ar.edu.unlp.info.oo1.ejercicio14;
import java.time.*;

public interface DateLapseInterface {
	
	LocalDate getFrom();
	LocalDate getTo();
	int sizeInDays();
	boolean includesDate(LocalDate other);
}
