package ar.edu.unlp.info.oo1.ejercicio9;

public class CajaDeAhorro extends Cuenta{
	
	
	@Override
	public void depositar(double monto) {
		super.depositar(monto * 0.98);
	}
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		return super.transferirACuenta((monto * 0.98), cuentaDestino);
	}
	public boolean extraer(double monto) {
		return super.extraer(monto * 1.02);
	}
}
