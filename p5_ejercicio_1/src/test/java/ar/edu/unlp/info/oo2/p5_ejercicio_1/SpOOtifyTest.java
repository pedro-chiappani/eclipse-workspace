package ar.edu.unlp.info.oo2.p5_ejercicio_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

public class SpOOtifyTest {
	
	private SpOOtify spotify = new SpOOtify();
	private Autor megadeth = new Autor("Megadeth");
	private Autor soad = new Autor("System Of A Down");
	private Autor invencible = new Autor("Mi Amigo Invencible"); 
	
	@BeforeEach
	public void setUp() {
		// Megadeth
		
		Tema t1 = new Tema("Lucretia");
		Tema t2 = new Tema("Hangar 18");
		Tema t3 = new Tema("Take No Prisioners");
		Album al1 = new Album ("Rust In Peace");
		al1.agregarTema(t1);al1.agregarTema(t2);al1.agregarTema(t3);
		
		Tema t6 = new Tema("Symphony Of Destruction");
		Tema t7 = new Tema("Countdown To Extinction");
		Album al2 = new Album("Countdown To Extinction");
		al2.agregarTema(t7);al2.agregarTema(t6);
		
		megadeth.agregarAlbum(al1);megadeth.agregarAlbum(al2);
		
		Tema s1 = new Tema("Toxicity");
		Tema s2 = new Tema("Shimmy");
		Tema s3 = new Tema("Deer Dance");
		Album al3 = new Album ("Toxicity");
		al3.agregarTema(s1);al3.agregarTema(s2);al3.agregarTema(s3);
		
		Tema s6 = new Tema("Mr Jack");
		Tema s7 = new Tema("Ego Brain");
		Album al4 = new Album("Steal This Album");
		al4.agregarTema(s7);al4.agregarTema(s6);
		
		soad.agregarAlbum(al3);soad.agregarAlbum(al4);
		
		Tema i1 = new Tema("Gato Negro Pasa");
		Tema i2 = new Tema("Leningrado");
		Tema i3 = new Tema("Gato Blanco Atrincherado");
		Album ali1 = new Album ("La Danza De Los Principiantes");
		ali1.agregarTema(i1);ali1.agregarTema(i2);ali1.agregarTema(i3);
		
		Tema ti6 = new Tema("Alas Baten El Cielo");
		Tema ti7 = new Tema("Los Pajaros");
		Album ali2 = new Album("La Nostalgia Soundsystem");
		ali2.agregarTema(ti7);ali2.agregarTema(ti6);
		
		invencible.agregarAlbum(ali1);invencible.agregarAlbum(ali2);
		
		spotify.agregarAutor(megadeth);spotify.agregarAutor(soad);spotify.agregarAutor(invencible);
		
		Usuario usu1 = new Usuario("Usuario 1");
		spotify.agregarUsuario(usu1);
		usu1.guardarTema(t3);usu1.guardarTema(t6);usu1.guardarTema(t2);
	}
	
	@Test
	public void buscarPorTituloTest() {
		assertEquals(2, spotify.buscarPorTitulo("Gato").size());
	}
	
	@Test
	public void buscarPorAutorTest() {
		assertEquals(5, spotify.buscarPorAutor("Amigo").size());
	}
	
	@Test
	public void buscarPorAlbumTest() {
		assertEquals(3, spotify.buscarPorAlbum("Toxi").size());
	}
}
