package ar.edu.unlp.info.oo1.ejercicio6;
import java.util.*;

public class Farola {
	private boolean on;
	private List<Farola> neighbors;
	/*
	* Crear una farola. Debe inicializarla como apagada
	*/
	public Farola () {
		on = false;
		neighbors = new ArrayList<Farola>();
	};
	/*
	* Crea la relación de vecinos entre las farolas. La relación de vecinos
	entre las farolas es recíproca, es decir el receptor del mensaje será vecino
	de otraFarola, al igual que otraFarola también se convertirá en vecina del
	receptor del mensaje
	*/
	public void pairWithNeighbor( Farola otraFarola ) {
		neighbors.add(otraFarola);
		otraFarola.getNeighbors().add(this);
	}
	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors (){
		return neighbors;
	}
	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn() {
		if (!isOn()) {
			on = true;
			neighbors.forEach(farola -> farola.turnOn());
		}
	
	}
	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if (isOn()) {
			on = false;
			neighbors.forEach(farola -> farola.turnOff());
		}
	}
	
	public boolean isOn() {
		return on;
	}
}

