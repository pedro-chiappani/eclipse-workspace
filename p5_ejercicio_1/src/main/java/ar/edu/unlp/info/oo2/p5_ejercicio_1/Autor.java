package ar.edu.unlp.info.oo2.p5_ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Autor {
	
	private List<Album> albumes;
	private String nombre;
	
	public Autor (String nom) {
		this.nombre = nom;
		albumes = new ArrayList<Album>();
	}
	
	public Autor (String nom, List<Album> albumes) {
		this.nombre = nom;
		this.albumes = albumes;
	}
	
	public void agregarAlbum(Album a) {
		this.albumes.add(a);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public List<Album> getAlbumes(){
		return this.albumes;
	}
	
	public List<String> buscarPorAutor(String autor){
		List<String> list = new ArrayList<String>();
		if (this.nombre.contains(autor)){
			list = this.getAlbumes().stream().flatMap(album -> album.getTemas().stream()).toList();
		}
		return list;
	}
	
	public List<String> buscarPorTitulo(String titulo){
		return this.albumes.stream().flatMap(album -> album.buscarPorTitulo(titulo).stream()).toList();
	}
	
	public List<String> buscarPorAlbum(String album){
		return this.albumes.stream().flatMap(al -> al.buscarPorAlbum(album).stream()).toList();
	}
}
