package ar.edu.unlp.info.oo2.ejercicio_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SistemaTest {
	
	Sistema twitter;
	
	@BeforeEach
	public void setUp() {
		twitter = new Sistema();
	}
	
	@Test
	public void crearUsuarioTest() {
		twitter.crearUsuario("Mariano");
		twitter.crearUsuario("Deth");
		twitter.crearUsuario("Deth");
		assertEquals(twitter.usuariosSize(),2);
	}
	
}
