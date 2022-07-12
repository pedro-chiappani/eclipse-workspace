package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersonaFisica extends Persoona{
	
	private String documento;
	
	public PersonaFisica(String nombre, String documento) {
		super(nombre);
		this.documento = documento;
	}
	
	public String getDocumento() {
		return documento;
	}
}
