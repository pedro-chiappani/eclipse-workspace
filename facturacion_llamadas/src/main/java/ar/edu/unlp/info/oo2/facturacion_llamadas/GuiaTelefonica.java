package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.SortedSet;

public class GuiaTelefonica {
	public SortedSet<String> guia = new TreeSet<String>();
	
	public boolean contiene (String telefono) {
		return this.guia.contains(telefono);
	}
	
	public void agregar(String tel) {
		guia.add(tel);
	}
	
	public String obtenerUltimo() {
		return guia.last();
	}
	
	public void eliminar(String tel) {
		guia.remove(tel);
	}
}
