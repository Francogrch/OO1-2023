package ar.edu.unlp.info.oo1.ejercicio5;

import java.util.Date;

public class Mamifero {
	private String identificador;
	private String especie;
	private Date fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero() {}
	
	public Mamifero(String identificador) {
		this.setIdentificador(identificador);
	}
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	public Mamifero getAbueloMaterno() {
		if (this.tieneMadre()) return madre.getPadre();
		else return null;
	}
	public Mamifero getAbuelaMaterna() {
		if (this.tieneMadre()) return madre.getMadre();
		else return null;
	}
	public Mamifero getAbueloPaterno() {
		if (this.tienePadre()) return padre.getPadre();
		else return null;
	}
	public Mamifero getAbuelaPaterna() {
		if (this.tienePadre()) return padre.getMadre();
		else return null;
	}
	public boolean tienePadre() {
		return (padre != null);
	}
	public boolean tieneMadre() {
		return (madre != null);
	}
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
//		boolean encontro = false;
//		if (this.tienePadre()) { // && con encontro
//			encontro = (this.getPadre() == unMamifero);
//			if (!encontro) {
//				encontro = padre.tieneComoAncestroA(unMamifero);
//			}
//		}
//		if (this.tieneMadre() && !encontro) {			
//			encontro = (this.getMadre() == unMamifero);
//			if (!encontro) {
//				encontro = madre.tieneComoAncestroA(unMamifero);
//				}
//			}
//		return encontro;
		//return ((this.getMadre() == unMamifero || this.getPadre() == unMamifero) || ((this.getMadre() != null && this.getMadre().tieneComoAncestroA(unMamifero)) || (this.getPadre() != null && this.getPadre().tieneComoAncestroA(unMamifero))));
//		if (this.getMadre() == unMamifero || this.getPadre() == unMamifero) {
//			return true;
//		}else{
//			return ((this.getMadre() != null && this.getMadre().tieneComoAncestroA(unMamifero)) || (this.getPadre() != null && this.getPadre().tieneComoAncestroA(unMamifero)));
//	}
			return esAncestroMaterno(unMamifero) || esAncestroPaterno(unMamifero);
	}
	
	private boolean esAncestroMaterno(Mamifero unMamifero) { 
		return madre == unMamifero || (madre!= null && madre.tieneComoAncestroA(unMamifero));
	}
	private boolean esAncestroPaterno(Mamifero unMamifero) { 
		return padre == unMamifero || (padre!= null && padre.tieneComoAncestroA(unMamifero));
	}
	
}
