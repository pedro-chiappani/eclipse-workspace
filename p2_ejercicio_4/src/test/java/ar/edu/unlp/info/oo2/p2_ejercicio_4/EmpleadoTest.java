package ar.edu.unlp.info.oo2.p2_ejercicio_4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {
	
	private Empleado tempo, pasante, planta;
	
	@BeforeEach
	public void setUp() {
		tempo = new Temporario(8, 2, true);
		pasante = new Pasante(3, 0, false);
		planta = new Planta(5, 3, false);
	}
	
	@Test
	public void sueldoTest() {
		assertEquals(tempo.sueldo(), 28038);
		assertEquals(pasante.sueldo(), 23100);
		assertEquals(planta.sueldo(), 58700);
	}
}
