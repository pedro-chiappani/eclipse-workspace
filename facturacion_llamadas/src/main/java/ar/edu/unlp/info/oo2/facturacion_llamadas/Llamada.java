package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {
	private Persoona emisor;
	private Persoona remitente;
	private int dur;
	
	public Llamada(Persoona emisor, Persoona remitente, int dur) {
		this.emisor= emisor;
		this.remitente= remitente;
		this.dur = dur;
		emisor.agregarLlamada(this);
	}
	
	public void setEmisor(Persoona q) {
		emisor = q;
	}
	public Persoona getRemitente() {
		return remitente;
	}
	public void setRemitente(Persoona remitente) {
		this.remitente = remitente;
	}
	
	public abstract double getCostoLlamada();
	
	public int getDur() {
		return dur;
	}
	
	
	
}
