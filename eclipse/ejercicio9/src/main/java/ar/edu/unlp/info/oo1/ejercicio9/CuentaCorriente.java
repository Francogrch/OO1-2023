package ar.edu.unlp.info.oo1.ejercicio9;

public class CuentaCorriente extends Cuenta{
	double descubrimiento;
	
	public CuentaCorriente() {
		super();
		descubrimiento = 0;
	}
	public double getDescubrimiento() {
		return descubrimiento;
	}
	public void setDescubrimiento(double descubrimiento) {
		this.descubrimiento = descubrimiento;
	}
	public boolean extraer(double monto) {
		if (super.extraer(monto)) {
			return true;
		}else{
			if (monto <= (this.saldo + this.descubrimiento)) {
				this.extraerSinControlar(monto);
				return true;
			}
			return false;
		}
	}
	
	
}
