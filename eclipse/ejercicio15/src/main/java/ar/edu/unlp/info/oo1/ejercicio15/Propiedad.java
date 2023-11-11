package ar.edu.unlp.info.oo1.ejercicio15;
import java.util.*;

public class Propiedad {
	private String nombre;
	private String direccion;
	private String descripcion;
	private double precio;
	private Usuario propietario;
	private List<Reserva> listaDeReservas;
	
	public Propiedad(String nombre, String direccion, String descripcion, double precio, Usuario propietario) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.descripcion = descripcion;
		this.precio = precio;
		this.propietario = propietario;
		this.listaDeReservas = new ArrayList<Reserva>();
	}
	public boolean disponible(DateLapse periodo) {
		return listaDeReservas.stream().anyMatch(reservas -> !reservas.getPeriodo().overlaps(periodo));	
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Usuario getPropietario() {
		return propietario;
	}

	public void setPropietario(Usuario propietario) {
		this.propietario = propietario;
	}

	public List<Reserva> getListaDeReservas() {
		return listaDeReservas;
	}

	public void setListaDeReservas(List<Reserva> listaDeReservas) {
		this.listaDeReservas = listaDeReservas;
	}
	
	
	
}
