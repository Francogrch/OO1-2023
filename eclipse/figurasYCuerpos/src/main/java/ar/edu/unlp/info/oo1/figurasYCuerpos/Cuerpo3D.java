package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Cuerpo3D {
	private double altura;
	private FiguraGeometrica caraBasal;
	public Cuerpo3D() {}
	public Cuerpo3D(double altura, FiguraGeometrica caraBasal) {
		this.altura = altura;
		this.caraBasal = caraBasal;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public FiguraGeometrica getCaraBasal() {
		return caraBasal;
	}

	public void setCaraBasal(FiguraGeometrica caraBasal) {
		this.caraBasal = caraBasal;
	}

	public double getVolumen() {
		return caraBasal.getArea() * getAltura();
	}


	public double getSuperficieExterior() {
		return 2*caraBasal.getArea() + caraBasal.getPerimetro() * getAltura();
	}	
}
