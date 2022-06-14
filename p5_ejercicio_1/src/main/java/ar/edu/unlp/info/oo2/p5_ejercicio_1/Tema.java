package ar.edu.unlp.info.oo2.p5_ejercicio_1;

public class Tema {
	
	private String titulo;
	
	public Tema (String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String buscarPorTitulo(String titulo) {
		if (this.titulo.contains(titulo))
			return this.titulo;
		else
			return "";
	}
}
