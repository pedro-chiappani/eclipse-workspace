package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Persoona {
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private String nombre;
	private String telefono;	
	
	public Persoona(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public List<Llamada> getLlamadas() {
		return llamadas;
	}
	public void setLlamadas(List<Llamada> llamadas) {
		this.llamadas = llamadas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String tel) {
		this.telefono = tel;
	}
	
}
