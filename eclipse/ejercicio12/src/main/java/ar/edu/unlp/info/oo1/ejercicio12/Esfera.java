package ar.edu.unlp.info.oo1.ejercicio12;

public class Esfera extends Pieza{
	private int radio;
	
	public Esfera(int radio, String material,String color) {
		super(material,color);
		this.radio = radio;
	}
	public double getVolumen() {
		return (4/3 * Math.PI * Math.pow(radio,3));
	}
	public double getSuperficie() {
		return (4*Math.PI * Math.pow(radio, 3));
	}
}
