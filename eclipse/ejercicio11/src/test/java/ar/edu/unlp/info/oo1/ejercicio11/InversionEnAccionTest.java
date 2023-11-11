package ar.edu.unlp.info.oo1.ejercicio11;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversionEnAccionTest {
	protected InversionEnAccion accion1,accion2;
	
	@BeforeEach
	public void setUp() {
		accion1 = new InversionEnAccion("Forex",10,300);
		accion2 = new InversionEnAccion("DivisaYen",4,200);
	}
	
	@Test
	public void valorActual() {
		assertEquals(3000,accion1.valorActual());
		assertEquals(800,accion2.valorActual());
	}
}
