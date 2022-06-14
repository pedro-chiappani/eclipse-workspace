package ar.edu.unlp.info.oo2.p5_ejercicio_1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class SpOOtify {
	
	private List<Usuario> usuarios;
	private List<Autor> autores;
	
	public SpOOtify() {
		this.usuarios = new ArrayList<Usuario>();
		this.autores = new ArrayList<Autor>();
	}
	
	public void agregarAutor(Autor a) {
		this.autores.add(a);
	}
	
	public void agregarUsuario(Usuario u) {
		this.usuarios.add(u);
	}
	
	public List<String> buscarPorTitulo(String titulo){
		return this.autores.stream().flatMap(a -> a.buscarPorTitulo(titulo).stream()).toList();
	}
	
	public List<String> buscarPorAutor(String autor){
		return this.autores.stream().flatMap(au -> au.buscarPorAutor(autor).stream()).toList();
	}
	
	public List<String> buscarPorAlbum(String album){
		return this.autores.stream().flatMap(au -> au.buscarPorAlbum(album).stream()).toList();
	}
}
