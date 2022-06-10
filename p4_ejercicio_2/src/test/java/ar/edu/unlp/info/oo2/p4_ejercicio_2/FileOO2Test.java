package ar.edu.unlp.info.oo2.p4_ejercicio_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class FileOO2Test {
	
	private FileOO2 archivo;
	
	@BeforeEach
	public void setUp() {
		this.archivo = new File("test", ".txt", 12.00, LocalDate.of(2000,7,2), LocalDate.of(2022, 5, 3), "escritura");
	}
	
	@Test
	public void primerPrint() {
		// nombre - extension
		FileOO2 e = new DecoratorExtension(archivo);
		FileOO2 n = new DecoratorNombre(e);
		assertEquals("test - .txt", n.prettyPrint());
	}
	
	@Test
	public void segundoCaso() {
		// nombre - extension - fechaCreacion
		FileOO2 f = new DecoratorFechaCreacion(archivo);
		FileOO2 e = new DecoratorExtension(f);
		FileOO2 n = new DecoratorNombre(e);
		assertEquals("test - .txt - 2000-07-02", n.prettyPrint());
	}
	
	@Test
	public void tercerCaso() {
		// permisos - nombre - extension - tamanio
		FileOO2 t = new DecoratorTamanio(archivo);
		FileOO2 e = new DecoratorExtension(t);
		FileOO2 n = new DecoratorNombre(e);
		FileOO2 p = new DecoratorPermisos(n);
		assertEquals("escritura - test - .txt - 12.0", p.prettyPrint());
	}
}
