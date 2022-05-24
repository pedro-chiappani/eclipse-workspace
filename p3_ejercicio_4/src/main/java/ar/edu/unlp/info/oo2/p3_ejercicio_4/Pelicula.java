package ar.edu.unlp.info.oo2.p3_ejercicio_4;

import java.util.List;
import java.util.ArrayList;

public class Pelicula {
	
	private String titulo;
	private int anio;
	private double puntaje;
	private List<Pelicula> similares;
	
	public Pelicula (String titulo, int anio, double puntaje) {
		this.titulo = titulo;
		this.anio = anio;
		this.puntaje = puntaje;
	}
	
	public int getAnio() {
		return this.anio;
	}
	
	public void setSimilares(List<Pelicula> similares) {
		this.similares = similares;
	}
	
	public List<Pelicula> getSimilares (){
		return similares;
	}
	
	public double getPuntaje() {
		return puntaje;
	}
}
