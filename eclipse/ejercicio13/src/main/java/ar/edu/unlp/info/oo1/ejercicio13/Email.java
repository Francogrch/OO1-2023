package ar.edu.unlp.info.oo1.ejercicio13;
import java.util.*;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		adjuntos = new ArrayList<Archivo>();
	}
	
	public String getTitulo() {
		return titulo;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	
	public void agregarArchivo(Archivo archivo) {
		adjuntos.add(archivo);
	}
	public double tamanioOcupado() {
		return adjuntos.stream().mapToDouble(archivo -> archivo.tamanio()).sum() + getTitulo().length() + getCuerpo().length();
	}
	public boolean contieneTexto(String texto) {
		return (getTitulo().toLowerCase().contains(texto)) || (getCuerpo().toLowerCase().contains(texto));
	}
}
