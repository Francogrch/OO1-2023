package ar.edu.unlp.info.oo1.ejercicio14;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.*;
import static org.junit.jupiter.api.Assertions.*;

public class DateLapseTest {
	private LocalDate fecha1,fecha2,fecha3,fecha4;
	private DateLapse2 dateLapse;
	
	@BeforeEach
	public void setUp() {
		fecha1 = LocalDate.of(2020, 1, 24);
		fecha2 = LocalDate.of(2021, 6, 20);
		fecha3 = LocalDate.of(2023, 9, 3);
		fecha4 = LocalDate.of(2024, 2, 4);
		dateLapse = new DateLapse2(fecha1,fecha3);
	}
	@Test
	public void sizeInDaysTesst() {
		assertEquals(1318,dateLapse.sizeInDays());
	}
	@Test
	public void inclesDate() {
		assertTrue(dateLapse.includesDate(fecha2));
		assertFalse(dateLapse.includesDate(fecha4));
	}
}
