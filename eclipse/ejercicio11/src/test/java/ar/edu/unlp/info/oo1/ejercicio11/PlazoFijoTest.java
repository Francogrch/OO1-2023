package ar.edu.unlp.info.oo1.ejercicio11;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlazoFijoTest {
	protected PlazoFijo plazo1,plazo2;
	
	@BeforeEach
	public void setUp() {
		plazo1 = new PlazoFijo(LocalDate.of(2020, 5, 2),2000,0.02);
		plazo2 = new PlazoFijo(LocalDate.of(2022, 8, 7),3000,0.02);
	}
	
	@Test
	public void valorActual() {
		assertEquals(52360,plazo1.valorActual());
		assertEquals(28920,plazo2.valorActual());
	}
}