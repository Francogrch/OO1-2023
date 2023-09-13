package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Circulo extends FiguraGeometrica{
	private double radio;
	public Circulo() {};
	public Circulo (double radio) {
		this.radio = radio;
	}
	public double getDiametro() {
		return radio * 2;
	}
	// Es necesario el diametro guardarlo? Si lo puedo calcular
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getPerimetro() {
		return (Math.PI * this.getDiametro());
	}
	public double getArea() {
		return (Math.PI * Math.pow(radio, 2));
	}
}
