package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BibliotecaTest {

	private Biblioteca biblioteca;
	
	@BeforeEach
	public void setUp() {
		biblioteca = new Biblioteca();
	}
	
	@Test
	public void testExportar() {
		Socio s1 = new Socio("Pedro", "pepe@mail.com", "16195/2");
		Socio s2 = new Socio("Mariano", "mariano@mail.com", "15487/9");
		biblioteca.agregarSocio(s1);
		biblioteca.agregarSocio(s2);
		String json = biblioteca.exportarSocios();
		System.out.print(json);
		assertEquals(true, json.contains("pepe@mail.com"));
		assertEquals(true, json.contains("15487/9"));
	}

}
