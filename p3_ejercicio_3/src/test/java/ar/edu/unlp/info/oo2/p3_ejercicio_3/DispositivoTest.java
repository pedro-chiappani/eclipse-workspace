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
		assertEquals(dispositivo.send("Esto es un test"), "Esto es un test1831");
	}
	
	@Test
	public void conectarConTest() {
		CuatroGAdapter cuatroGconn = new CuatroGAdapter();
		assertEquals(dispositivo.cambiarConexion(cuatroGconn), "Esto es un symb de 4G");
	}
	
	@Test
	public void configurarCRCTest() {
		CRC32_Calculator crc = new CRC32_Calculator();
		this.dispositivo.cambiarCalculator(crc);
		assertEquals(dispositivo.send("Esto es un test"), "Esto es un test2910091251");
	}
}
