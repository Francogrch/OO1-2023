package ar.edu.unlp.info.oo1.ejercicio8;
import java.util.*;
import java.time.*;

public class Usuario {
	private String domicilio;
	private String nombre;
	private List<Factura> facturas;
	private List<Consumo> consumos;
	
	public Usuario(String nombre,String domicilio) {
		this.domicilio = domicilio;
		this.nombre  = nombre;
		facturas = new ArrayList<Factura>();
		consumos = new ArrayList<Consumo>();
	}
	public String getDomicilio() {
		return domicilio;
	}
	public String getNombre() {
		return nombre;
	}
	public void agregarMedicion(Consumo medicion) {
		consumos.add(medicion);
	}
	
	public Consumo ultimoConsumo() {
		if (consumos.size() == 0) {
			return new Consumo(LocalDate.now(),0,0);
		}
		return consumos.get((consumos.size()-1));
	}
	
	public Factura getUltimaFactura() {
		return facturas.get((facturas.size())-1);
	}
	
	public double ultimoConsumoActiva() {
		return ultimoConsumo().getConsumoEnergiaActiva();
	}
	
	public Factura facturarEnBaseA(double precioKWh) {
		Factura factura = new Factura(this, ultimoConsumo(),precioKWh);
		facturas.add(factura);
		return factura;
	}
	
	public List<Factura> facturas(){
		return facturas;
	}
	
}
