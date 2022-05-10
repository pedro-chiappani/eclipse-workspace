package ar.edu.unlp.info.oo2.p3_ejercicio_4;

import java.util.List;
import java.util.ArrayList;

public class Pelicula {
	
	private String titulo;
	private int anio;
	private double puntaje;
	private List<Pelicula> similares;
	
	public Pelicula (String titulo, int anio, double puntaje, List<Pelicula> similares) {
		this.titulo = titulo;
		this.anio = anio;
		this.puntaje = puntaje;
		this.similares = similares;
	}
	
	public int getAnio() {
		return this.anio;
	}
}
