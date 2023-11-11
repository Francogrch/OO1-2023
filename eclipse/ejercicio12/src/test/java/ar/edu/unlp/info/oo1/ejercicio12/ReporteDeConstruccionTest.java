package ar.edu.unlp.info.oo1.ejercicio12;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReporteDeConstruccionTest {
	private ReporteDeConstruccion reporte;
	
	@BeforeEach
	public void setUp() {
		reporte = new ReporteDeConstruccion();
		Cilindro cilin = new Cilindro(30,20,"Hierro","Blanco");
		Esfera esfe = new Esfera(30,"Cobre","Rojo");
		PrismaRectangular prisma = new PrismaRectangular(30,30,50,"Hierro","Verde");
		reporte.agregarPieza(cilin);
		reporte.agregarPieza(esfe);
		reporte.agregarPieza(prisma);
		reporte.agregarPieza(cilin);
	}
	@Test
	public void volumenDeMaterialTest() {
		assertEquals(158097,reporte.getVolumenDeMaterial("Hierro"));
	}
	@Test
	public void superficieDeColorTest() {
		assertEquals(339292,reporte.getSuperficieDeColor("Rojo"));
	}
	;
}
