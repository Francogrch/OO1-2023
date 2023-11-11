package ar.edu.unlp.info.oo1.ejercicio9;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CuentaCorrienteTest {
	private CuentaCorriente cuenta1;
	private CuentaCorriente cuenta2;
	
	@BeforeEach
	public void setUp(){
		cuenta1 = new CuentaCorriente();
		cuenta2 = new CuentaCorriente();
		cuenta1.depositar(2000);
	}
	
	@Test
	public void extraerTest() {
		cuenta1.extraer(200);
		assertEquals(1800,cuenta1.getSaldo());
		cuenta2.setDescubrimiento(200);
		assertTrue(cuenta2.extraer(199));
		assertFalse(cuenta2.extraer(201));
	}
}
