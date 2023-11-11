package ar.edu.unlp.info.oo1.ejercicio11;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
public class InversorTest {
	private Inversor inversor1,inversor2;
	private PlazoFijo plazo;
	private InversionEnAccion accion;
	
	@BeforeEach
	public void setUp() {
		inversor1 = new Inversor("Carlos");
		inversor2 = new Inversor("Maria");
		accion = new InversionEnAccion("Forex",10,300); // 3000
		plazo = new PlazoFijo(LocalDate.of(2020, 5, 2),2000,0.02); //52360
		inversor1.agregarInversion(accion);
		inversor2.agregarInversion(accion);
		inversor2.agregarInversion(plazo);
	}
	
	@Test
	public void valorActual() {
		assertEquals(3000,inversor1.valorActual());
		assertEquals(55360,inversor2.valorActual());
	}
}
