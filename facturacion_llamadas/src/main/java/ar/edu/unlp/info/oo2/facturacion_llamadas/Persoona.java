package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Persoona {
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
	public double getDescuento() {
		return 0;
	}
	
	public double calcularMontoTotalLlamadas() {	
		double c = 0;
		Persoona aux = null;
		for (Persoona pp : personas) {
			if (pp.tel == p.getTel()) {
				aux = pp;
				break;
			}
		} if (aux == null) return c;
		if (aux != null) {
			for (Llamada l : aux.lista1) {
				double auxc = 0;
				if (l.tipoDeLlamada == "nacional") {
					auxc += l.dur *3 + (l.dur*3*0.21);
				} else if (l.tipoDeLlamada == "internacional") {
					auxc += l.dur *200 + (l.dur*200*0.21);
				}
				
				if (aux.t == "fisica") {
					auxc -= auxc*descuentoFis;
				} else if(aux.t == "juridica") {
					auxc -= auxc*descuentoJur;
				}
				c += auxc;
			}
		}
		return c;
	}
}
