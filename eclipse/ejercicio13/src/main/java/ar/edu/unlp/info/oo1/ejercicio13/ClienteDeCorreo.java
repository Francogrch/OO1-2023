package ar.edu.unlp.info.oo1.ejercicio13;
import java.util.*;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		inbox = new Carpeta("inbox");
		carpetas = new ArrayList<Carpeta>();
	}
	public void agregarCarpeta(Carpeta carpeta) {
		carpetas.add(carpeta);
	}
	public void recibir(Email email) {
		inbox.agregarEmail(email);
	}
	public Carpeta getInbox() {
		return inbox;
	}
	public boolean mover(Email email,Carpeta origen, Carpeta destino) {
		if (origen.eliminarEmail(email)) {
			destino.agregarEmail(email);
			return true;
		}else {
			return false;
		}
	}
	
	public Email buscar(String texto) {
		if (inbox.contieneTexto(texto) != null) {
			return inbox.contieneTexto(texto);
		}else {
			Carpeta posCarp = carpetas.stream().filter(carpeta -> carpeta.contieneTexto(texto) != null).findFirst().orElse(null);
			if (posCarp != null) {
				return posCarp.contieneTexto(texto);
			}
			return null;
		}
	}
	
	public double espacioOcupado() {
		return (inbox.tamanioOcupado() + carpetas.stream().mapToDouble(carpeta -> carpeta.tamanioOcupado()).sum());
	}
	
}
