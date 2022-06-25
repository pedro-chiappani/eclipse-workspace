package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersonaFisica extends Persoona{
	
	private String documento;
	
	public PersonaFisica(String nombre, String tel, String documento) {
		super(nombre, tel);
		this.documento = documento;
	}
	
	public String getDocumento() {
		return documento;
	}
}
