package ar.edu.unlp.info.oo1.ejercicio3;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	private Producto[] productos;
	public Balanza() {
		cantidadDeProductos = 0;
		precioTotal = 0;
		pesoTotal = 0;
		productos = new Producto[20];
	}
	public void ponerEnCero(){
		productos = new Producto[20];
		cantidadDeProductos = 0;
		precioTotal = 0;
		pesoTotal = 0;	
	}
	public void agregarProducto(Producto producto) {
		// No es necesario guardar los totales porque se puede calcular
		// PERO, si tenemos muchos productos es mejor tener los totales guardados
		cantidadDeProductos++;
		pesoTotal = pesoTotal + producto.getPeso();
		precioTotal = precioTotal + producto.getPrecio();
		productos[productos.length] = producto;
	}
	public Ticket emitirTicket() {
		return new Ticket(cantidadDeProductos,pesoTotal,precioTotal,productos);
	}
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	public double getPesoTotal() {
		return pesoTotal;
	}
	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	public Producto[] getProductos() {
		return productos;
	}
}
