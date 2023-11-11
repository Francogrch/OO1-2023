package ar.edu.unlp.info.oo1.ejercicio11;
import java.util.*;

public class Inversor {
	private String nombre;
	private List<Inversion> inversiones;
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		inversiones = new ArrayList<Inversion>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void agregarInversion(Inversion inversion) {
		inversiones.add(inversion);
	}
	
	public double valorActual() {
		return inversiones.stream().mapToDouble(inversion -> inversion.valorActual()).sum();
	}
}
