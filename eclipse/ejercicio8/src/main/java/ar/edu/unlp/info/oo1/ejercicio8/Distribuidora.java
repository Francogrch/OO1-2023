package ar.edu.unlp.info.oo1.ejercicio8;
import java.util.*;
import java.util.stream.Collectors;

public class Distribuidora {
	private double precioKWh;
	private List<Usuario> usuarios;
	
	public Distribuidora(double precio) {
		usuarios = new ArrayList<Usuario>();
		precioKWh = precio;
	}
	public List<Usuario> getUsuarios(){
		return usuarios;
	}
	public double getPrecioKW() {
		return precioKWh;
	}
	
	public double getPrecioKWh() {
		return precioKWh;
	}
	public void precioKWh(double precioKWh) {
		this.precioKWh = precioKWh;
	}
	
	public void agregarUsuario(Usuario usuario) {
		//Agregar Usuario a la lista
		usuarios.add(usuario);
	}
	public List<Factura> facturar(){
		// Retorna lista con todas las ultimas facturas
		return usuarios.stream().map(usuario -> usuario.getUltimaFactura()).collect(Collectors.toList());
	}
	public double consumoTotalActiva() {
		// retorna suma de ultimoConsumoActiva
		return usuarios.stream().mapToDouble(usuario -> usuario.ultimoConsumoActiva()).sum();
	}
	
}
