package ar.edu.unlp.info.oo2.p5_ejercicio_3_3;

import java.time.LocalDate;

public class Post {
	
	private String titulo;
	private LocalDate fecha;
	private Usuario usuario;
	
	public Usuario getUsuario() {
		return this.usuario;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}

}
