package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional extends Llamada {
	
	public LlamadaInternacional(Persoona emisor, Persoona remitente, int dur) {
		super(emisor, remitente, dur);
	}

	public double getCostoLlamada() {
		return this.getDur()*200 + this.getDur() *200*0.21;
	}
}
