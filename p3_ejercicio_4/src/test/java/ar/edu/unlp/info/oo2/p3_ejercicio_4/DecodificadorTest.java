/**
 * 
 */
package ar.edu.unlp.info.oo2.p3_ejercicio_4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecodificadorTest {
	
	private Decodificador deco;
	
	@BeforeEach
	public void setUp() {
		this.deco = new Decodificador();
	}
	
	@Test
	public void cambiarASimilaridad() {
		this.deco.cambiarMetodoSimilaridad();
		assertEquals(this.deco.sugerir(), );
	}
	
	@Test
	public void cambiarAPuntaje() {
		this.deco.cambiarMetodoPuntaje();
		assertEquals(this.deco.sugerir(),);
	}
}
