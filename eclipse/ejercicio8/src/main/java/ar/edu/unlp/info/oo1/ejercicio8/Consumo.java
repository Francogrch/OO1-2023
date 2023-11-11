package ar.edu.unlp.info.oo1.ejercicio8;
import java.time.*;
public class Consumo {
	private LocalDate fecha;
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;

	public Consumo(LocalDate fecha, int consumoEnergiaActiva, int consumoEnergiaReactiva) {
		this.fecha = fecha;
		this.consumoEnergiaActiva = consumoEnergiaActiva;
		this.consumoEnergiaReactiva = consumoEnergiaReactiva;
	}
	
	public Consumo(LocalDate fecha, double consumoEnergiaActiva, double consumoEnergiaReactiva) {
		this.fecha = fecha;
		this.consumoEnergiaActiva = consumoEnergiaActiva;
		this.consumoEnergiaReactiva = consumoEnergiaReactiva;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	public double getConsumoEnergiaActiva() {
		return consumoEnergiaActiva;
	}
	
	public double costoEnBaseA(double precioKWh) {
		return (consumoEnergiaActiva * precioKWh);
	}
	
	public double factorDePotencia() {
		return (consumoEnergiaActiva / (Math.sqrt((Math.pow(consumoEnergiaActiva,2) + Math.pow(consumoEnergiaReactiva, 2)))));
	}
	
}
