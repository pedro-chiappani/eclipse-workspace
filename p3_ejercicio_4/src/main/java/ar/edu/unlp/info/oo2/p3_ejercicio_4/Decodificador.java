package ar.edu.unlp.info.oo2.p3_ejercicio_4;

import java.util.List;
import java.util.ArrayList;

public class Decodificador {
	
	private List<Pelicula> peliculas, vistas;
	private Sugerencia sugerencia;
	
	public List<Pelicula> getPeliculas(){
		return this.peliculas;
	}
	
	public List<Pelicula> getVistas(){
		return this.vistas;
	}
	
	public List<Pelicula> sugerir(){
		return sugerencia.sugerir(this);
	}
	
	
}
