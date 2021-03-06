package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BibliotecaAdapterTest {
	
	private Biblioteca biblioteca;
	private JSONsimpleAdapter jsonAd;
	private JacksonAdapter jcksonAd;
	private Socio socio1,socio2;
	
	@BeforeEach
	public void setUp() {
		biblioteca = new Biblioteca();
		jsonAd = new JSONsimpleAdapter();
		jcksonAd = new JacksonAdapter();
		socio1 = new Socio("Pedro", "pepe@mail.com", "16195-2");
		socio2 = new Socio("Mariano", "mariano@mail.com", "15487-9");
		biblioteca.agregarSocio(socio1);
		biblioteca.agregarSocio(socio2);
	}

	@Test
	public void testExportarJsonSimple() {
		biblioteca.setExporter(jsonAd);
		String json = biblioteca.exportarSocios();
		assertEquals(true, json.contains("\"nombre\":\"Pedro\""));
		assertEquals(true, json.contains("\"legajo\":\"15487-9\""));
	
	}
	
	@Test
	public void testExportarJackson() {
		biblioteca.setExporter(jcksonAd);
		String json = biblioteca.exportarSocios();
		assertEquals(true, json.contains("\"email\":\"pepe@mail.com\""));
		assertEquals(true, json.contains("\"legajo\":\"15487-9\""));
	
	}
	
}