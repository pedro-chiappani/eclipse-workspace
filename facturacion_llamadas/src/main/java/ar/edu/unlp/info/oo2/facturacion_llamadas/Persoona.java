package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Persoona {
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private String nombre;
	private String telefono;

	public Persoona(String nombre) {
		this.nombre = nombre;	}

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

	public double getDescuento() {
		return 0;
	}

	public double calcularMontoTotalLlamadas() {
		double total = llamadas.stream().mapToDouble(l -> l.getCostoLlamada() - (l.getCostoLlamada() * this.getDescuento())).sum();
		return total;
	}
	
	public void agregarLlamada(Llamada llamada) {
		this.llamadas.add(llamada);
	}
}
