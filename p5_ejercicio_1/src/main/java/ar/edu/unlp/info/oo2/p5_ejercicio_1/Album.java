package ar.edu.unlp.info.oo2.p5_ejercicio_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Album {
	
	private List<Tema> temas;
	private String nombre;
	
	public Album (String nom) {
		this.nombre = nom;
		this.temas = new ArrayList<Tema>();
	}
	
	public Album (String nom, List<Tema> temas) {
		this.nombre = nom;
		this.temas = temas;
	}
	
	public void agregarTema(Tema t) {
		this.temas.add(t);
	}
	
	public List<String> getTemas(){
		return this.temas.stream().map(t -> t.getTitulo()).toList();
	}
	
	public List<String> buscarPorTitulo(String titulo){
		return this.temas.stream().filter(tema -> (!tema.buscarPorTitulo(titulo).isBlank())).map(tema -> tema.getTitulo()).toList();
	}
	
	public List<String> buscarPorAlbum(String album){
		List<String> list = new ArrayList<String>();
		if (this.nombre.contains(album))
			list = this.temas.stream().map(tema -> tema.getTitulo()).toList();
		return list;
	}
}
