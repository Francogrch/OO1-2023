package ar.edu.unlp.info.oo1.ejercicio11;
import java.time.*;
import java.time.temporal.ChronoUnit;
public class PlazoFijo implements Inversion {
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	
	public PlazoFijo(LocalDate fechaDeConstitucion, double montoDepositado, double porcentajeDeInteresDiario) {
		this.fechaDeConstitucion = fechaDeConstitucion;
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}


	@Override
	public double valorActual() {
		int diferenciaDias = (int) ChronoUnit.DAYS.between(fechaDeConstitucion,LocalDate.now());

		return montoDepositado + (montoDepositado * porcentajeDeInteresDiario * diferenciaDias);
	}

}
