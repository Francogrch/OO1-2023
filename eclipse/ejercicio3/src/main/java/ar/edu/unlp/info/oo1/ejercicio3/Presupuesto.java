package ar.edu.unlp.info.oo1.ejercicio3;
import java.time.LocalDate;
public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private Item[] items;
	private int cantItem;
	
	public Presupuesto(String cliente) {
		this.cliente = cliente;
		fecha = LocalDate.now();
		items = new Item[10];
		cantItem = 0;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public void agregarItem(Item i) {
		items[cantItem] = i;
		cantItem++;
	}
	public double calcularTotal() {
		double sum = 0;
		for (int i = 0; i < cantItem;i++){
			sum += items[i].costo();
		}
		return sum;
	}
}
