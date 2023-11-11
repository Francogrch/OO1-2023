package ar.edu.unlp.info.oo1.ejercicio12;
import java.util.*;

public class ReporteDeConstruccion {
	List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		piezas = new ArrayList<Pieza>();
	}
	
	public void agregarPieza(Pieza pieza) {
		piezas.add(pieza);
	}
	public List<Pieza> getPiezas() {
		return piezas;
	}
	public double getVolumenDeMaterial(String material) {
		if (piezas.size() > 1) {
			return Math.round(piezas.stream().filter(pieza -> pieza.getMaterial().equals(material)).mapToDouble(pieza -> pieza.getVolumen()).sum());
			}
		return 0;
		}
	public double getSuperficieDeColor(String color) {
		if (piezas.size() > 1) {
			return Math.round(piezas.stream().filter(pieza -> pieza.getColor().equals(color)).mapToDouble(pieza -> pieza.getSuperficie()).sum());
			}
		return 0;
		}
	}
