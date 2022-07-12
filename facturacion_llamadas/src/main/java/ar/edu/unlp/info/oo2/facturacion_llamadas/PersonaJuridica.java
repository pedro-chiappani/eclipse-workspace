package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersonaJuridica extends Persoona{
	
	private String cuit;
	
	public PersonaJuridica(String nom, String cuit) {
		super(nom);
		this.cuit = cuit;
	}

	public String getCuit() {
		return cuit;
	}
	
	public double getDescuento() {
		return 0.15;
	}
}
