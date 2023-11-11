package ar.edu.unlp.info.oo1.ejercicio8;
import java.time.*;

public class Factura {
	private double montoEnergiaActiva;
	private double descuento;
	private LocalDate fecha;
	private Usuario usuario;
	
	
	public Factura(int montoEnergiaActiva,int descuento,Usuario usuario){
		this.usuario = usuario;
		this.fecha = LocalDate.now();
		this.montoEnergiaActiva = montoEnergiaActiva;
		this.descuento = descuento;
	} 
		
	public Factura(Usuario usuario,Consumo consumo,double precio){
		this.usuario = usuario;
		this.fecha = LocalDate.now();
		// Descuento? dice bonificado
		if (consumo.factorDePotencia() > 0.8) {
			descuento = 10;
		}else {
			descuento = 0;
		}
		montoEnergiaActiva = consumo.costoEnBaseA(precio);
	}
	
	public double montoTotal() {
		return montoEnergiaActiva - (montoEnergiaActiva * (descuento / 100));
	}
	public double getMontoEnergiaActiva() {
		return montoEnergiaActiva;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	public double getDescuento() {
		return descuento;
	}
}
