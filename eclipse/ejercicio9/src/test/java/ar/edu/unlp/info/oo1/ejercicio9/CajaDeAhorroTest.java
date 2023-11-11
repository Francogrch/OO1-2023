package ar.edu.unlp.info.oo1.ejercicio9;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaDeAhorroTest {
	private CajaDeAhorro caja1,caja2;
	
	@BeforeEach
	public void setUp() {
		this.caja1 = new CajaDeAhorro();
		this.caja2 = new CajaDeAhorro();
		
		caja2.depositar(2000);
	}
	
	@Test
	public void testSaldo() {
		assertEquals(0,caja1.getSaldo());
		assertEquals(1960,caja2.getSaldo());
	}
	@Test
	public void testExtraer() {
		caja1.extraer(300);
		assertEquals(0,caja1.getSaldo());
		caja2.extraer(200);
		assertEquals(1756,caja2.getSaldo());
	}
	
	@Test
	public void testTrasnferir() {
		assertFalse(caja1.transferirACuenta(200, caja2));
		caja2.transferirACuenta(200, caja1);
		assertEquals(1764,caja2.getSaldo());
	}
	
}
