package ar.edu.unlp.info.oo2.p3_ejercicio_3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class DispositivoTest {
	private Dispositivo dispositivo;
	
	@BeforeEach
	public void setUp() {
		this.dispositivo = new Dispositivo();
	}
	
	@Test
	public void sendTest() {
		assertEquals(dispositivo.send("Esto es un test"), "Esto es un test 1831");
	}
	
	@Test
	public void conectarConTest() {
		assertEquals(dispositivo.cambiarConexion4G(), "Esto es un symb de 4G");
		assertEquals(dispositivo.cambiarConexionWifi(), "Esto es un pict de Wifi");
	}
	
	@Test
	public void configurarCRCTest() {
		this.dispositivo.cambiarCalculator32();
		assertEquals(dispositivo.send("Esto es un test"), "Esto es un test 2910091251");
	}
}
