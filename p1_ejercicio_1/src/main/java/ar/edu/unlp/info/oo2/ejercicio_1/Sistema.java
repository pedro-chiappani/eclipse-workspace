package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.*;
import java.util.stream.Collectors;

public class Sistema {

	private List<Usuario> usuarios;
	
	public Sistema() {
		usuarios = new ArrayList<Usuario>();
	}
	
	private Boolean existeUsuario(String name) {
		return !(usuarios.stream().filter(usu -> usu.getScreenName().equals(name))
				.collect(Collectors.toList())).isEmpty();
	}
	
	public Usuario crearUsuario(String username) {
		if (!this.existeUsuario(username)) {
			Usuario usu = new Usuario(username);
			usuarios.add(usu);
			return usu;
		}
		else {
			System.out.println("El nombre ya ha sido utilizado");
			return null;
		}
	}
	
	public int usuariosSize() {
		return this.usuarios.size();
	}
}
