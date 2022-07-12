package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaNacional extends Llamada {
	
	public LlamadaNacional(Persoona emisor, Persoona remitente, int dur) {
		super(emisor, remitente, dur);
	}
	
	public double getCostoLlamada() {
		return this.getDur()*3 + (this.getDur()*3*0.21);
	}
}
