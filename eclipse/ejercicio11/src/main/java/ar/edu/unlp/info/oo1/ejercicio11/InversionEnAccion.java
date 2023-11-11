package ar.edu.unlp.info.oo1.ejercicio11;

public class InversionEnAccion implements Inversion {
	private String nombre;
	private int cantidad;
	private double valorUnitario;
	
	public InversionEnAccion(String nombre, int cantidad, double valorUnitario) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.valorUnitario = valorUnitario;
	}
	public String getNombre() {
		return nombre;
	}
	@Override
	public double valorActual() {
		return cantidad*valorUnitario;
	}

}
