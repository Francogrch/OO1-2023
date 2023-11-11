package ar.edu.unlp.info.oo1.ejercicio13;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteDeCorreoTest {
	private ClienteDeCorreo cliente;
	private Carpeta carpeta1,carpeta2;
	private Email email1,email2,email3;
	private Archivo archivo1,archivo2;
	
	@BeforeEach
	public void setUp() {
		cliente = new ClienteDeCorreo();
		carpeta1 = new Carpeta("spam");
		carpeta2= new Carpeta("favo");
		email1 = new Email("Recordatorio de pago","Querido empleado, en breve recibira el pago ");
		email2 = new Email("Correo de prueba", "Este es un correo de prueba para su bandeja de entrada. No es necesario realizar ninguna acción. Saludos, [Tu Nombre]");
		email3 = new Email("Actualización del proyecto", "Estimado equipo, quiero informarles que hemos realizado una importante actualización en el proyecto. A partir de ahora, estaremos utilizando una nueva herramienta de gestión de tareas que agilizará nuestro trabajo. Por favor, pónganse al tanto de los detalles adjuntos en el archivo 'Actualizacion_proyecto.pdf'. Si tienen alguna pregunta o inquietud, no duden en ponerse en contacto conmigo. Gracias por su colaboración. Saludos, [Tu Nombre]");
		archivo1 = new Archivo("Fotos_primavera");
		archivo2 = new Archivo("words_adjuntos");
		email1.agregarArchivo(archivo1);
		email2.agregarArchivo(archivo2);
		cliente.recibir(email1);
		cliente.recibir(email2);
		cliente.agregarCarpeta(carpeta1);
		cliente.agregarCarpeta(carpeta2);
	}
	@Test
	public void recibirTest() {
		cliente.recibir(email3);		
		assertTrue(cliente.getInbox().buscarEmail(email3));
	}
	
	@Test
	public void moverTest() {
		cliente.mover(email2, cliente.getInbox(), carpeta1);
		assertTrue(carpeta1.buscarEmail(email2));
		assertFalse(cliente.getInbox().buscarEmail(email2));
	}
	
	@Test
	public void buscarTest() {
		assertEquals(cliente.buscar("recordatorio"),email1);
		assertNull(cliente.buscar("xilofon"));
	}
	
	@Test
	public void espacioOcupadoTest() {
		assertEquals(226,cliente.espacioOcupado());
	}
	
	
	
}
