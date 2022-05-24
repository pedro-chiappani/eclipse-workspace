package ar.edu.unlp.info.oo2.p3_ejercicio_4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;

public class Decodificador {
	
	private List<Pelicula> peliculas, vistas;
	private Sugerencia sugerencia;
	
	public Decodificador(List<Pelicula> pelis) {
		this.peliculas = pelis;
		this.vistas = new ArrayList<Pelicula>();
		this.sugerencia = new Novedad();
	}
	
	public void verPelicula(Pelicula peli) {
		vistas.add(peli);
	}
	
	public List<Pelicula> getPeliculas(){
		return this.peliculas;
	}
	
	public List<Pelicula> getVistas(){
		return this.vistas;
	}
	
	public List<Pelicula> sugerir(){
		return sugerencia.sugerir(this);
	}
	
	private List<Pelicula> subtract(List<Pelicula> a, List<Pelicula> b){
		List<Pelicula> result = new ArrayList<>(a);
		result.removeAll(b);
		return result;
	}
	
	public List<Pelicula> getNoVistas(){
		return (this.subtract(getPeliculas(), getVistas())).stream().sorted(Comparator.comparingInt(Pelicula::getAnio).reversed()).collect(Collectors.toList());
	}
	
	public void cambiarMetodoSimilaridad() {
		sugerencia = new Similaridad();
	}
	
	public void cambiarMetodoPuntaje() {
		sugerencia = new Puntaje();
	}
	
	public void cambiarMetodoNovedad() {
		sugerencia = new Novedad();
	}
}
