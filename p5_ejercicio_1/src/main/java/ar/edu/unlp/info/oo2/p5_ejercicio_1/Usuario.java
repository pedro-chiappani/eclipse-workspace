package ar.edu.unlp.info.oo2.p5_ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String username;
	private List<Tema> myMusic;
	
	public Usuario (String name) {
		this.username = name;
		this.myMusic = new ArrayList<Tema>();
	}
	
	public void guardarTema (Tema t) {
		this.myMusic.add(t);
	}
	
	public void eliminarTema(Tema t) {
		this.myMusic.remove(t);
	}
}
