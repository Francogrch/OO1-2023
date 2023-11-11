package ar.edu.unlp.info.oo1.ejercicio13;
import java.util.*;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		emails = new ArrayList<Email>();
	}
	
	public void agregarEmail(Email email) {
		emails.add(email);
	}
	public boolean eliminarEmail(Email email){
		return emails.remove(email);
	}
	public String getNombre() {
		return nombre;
	}
	
	public double tamanioOcupado() {
		return emails.stream().mapToDouble(email -> email.tamanioOcupado()).sum();
	}
	
	public boolean buscarEmail(Email emailBuscado) {
		return emails.stream().anyMatch(email -> email.equals(emailBuscado));
	}
	
	public Email contieneTexto(String texto) {
		return emails.stream().filter(email -> email.contieneTexto(texto)).findFirst().orElse(null);
	}
}
