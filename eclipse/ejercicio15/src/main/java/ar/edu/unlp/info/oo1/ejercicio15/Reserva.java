package ar.edu.unlp.info.oo1.ejercicio15;

public class Reserva {
	private DateLapse periodo;
	private Propiedad propiedad;
	
	public Reserva(DateLapse periodo, Propiedad propiedad) {
		this.periodo = periodo;
		this.propiedad = propiedad;
	}

	public double calcularPrecio() {
		return (propiedad.getPrecio() * periodo.sizeInDays());
	}
	
	public DateLapse getPeriodo() {
		return periodo;
	}
	public void setPeriodo(DateLapse periodo) {
		this.periodo = periodo;
	}
	public Propiedad getPropiedad() {
		return propiedad;
	}
	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}
	
}
