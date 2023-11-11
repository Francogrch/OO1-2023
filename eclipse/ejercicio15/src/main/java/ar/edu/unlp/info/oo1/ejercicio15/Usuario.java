package ar.edu.unlp.info.oo1.ejercicio15;
import java.util.*;
public class Usuario {
	private String nombre;
	private String direccion;
	private int dni;
	private List<Reserva> listaReservas;
	private List<Propiedad> listaPropiedades;
	
	public Usuario(String nombre, String direccion, int dni) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
		listaReservas = new ArrayList<Reserva>();
		listaPropiedades = new ArrayList<Propiedad>();
	}

	public void agregarReserva(Reserva reserva) {
		listaReservas.add(reserva);
	}
	public void agregarPropiedad(Propiedad propiedad) {
		listaPropiedades.add(propiedad);
	}
	
	public List<Reserva> getListaReservas() {
		return listaReservas;
	}


	public List<Propiedad> getListaPropiedades() {
		return listaPropiedades;
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

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
}
