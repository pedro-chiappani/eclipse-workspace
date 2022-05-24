/**
 * 
 */
package ar.edu.unlp.info.oo2.p3_ejercicio_4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecodificadorTest {
	
	private Decodificador deco;
	private Pelicula thor,cap,iron,dunk,rocky,rambo;
	
	@BeforeEach
	public void setUp() {
		thor = new Pelicula("Thor", 2007, 7.9);
		cap = new Pelicula("Capitan America", 2016, 7.8);
		iron =  new Pelicula("Iron Man", 2010, 7.9);
		dunk = new Pelicula("Dunkirk", 2017, 7.9);
		rocky = new Pelicula("Rocky", 1976, 8.1);
		rambo = new Pelicula("Rambo", 1979, 7.8);
		List<Pelicula> peliculas = new ArrayList<Pelicula>();
		peliculas.add(rambo);peliculas.add(rocky);peliculas.add(iron);peliculas.add(cap);peliculas.add(dunk);peliculas.add(thor);
		List<Pelicula> similaresThor = new ArrayList<Pelicula>();
		similaresThor.add(cap); similaresThor.add(iron);thor.setSimilares(similaresThor);
		List<Pelicula> similaresCap = new ArrayList<Pelicula>();
		similaresCap.add(iron); similaresCap.add(thor); cap.setSimilares(similaresCap);
		List<Pelicula> similaresIron = new ArrayList<Pelicula>();
		similaresIron.add(thor); similaresIron.add(cap); iron.setSimilares(similaresIron);
		List<Pelicula> similaresRocky = new ArrayList<Pelicula>();
		similaresRocky.add(rambo); rocky.setSimilares(similaresRocky);
		List<Pelicula> similaresRambo = new ArrayList<Pelicula>();
		similaresRambo.add(rocky); rambo.setSimilares(similaresRambo);
		this.deco = new Decodificador(peliculas);
		deco.verPelicula(thor);deco.verPelicula(rocky);
	}
	
	@Test
	public void cambiarASimilaridad() {
		this.deco.cambiarMetodoSimilaridad();
		List<Pelicula> expected = new ArrayList<Pelicula>();
		expected.add(cap); expected.add(rambo); expected.add(iron);
		assertEquals(this.deco.sugerir().containsAll(expected), true);
	}
	
	@Test
	public void cambiarAPuntaje() {
		this.deco.cambiarMetodoPuntaje();
		List<Pelicula> expected = new ArrayList<Pelicula>();
		expected.add(dunk);expected.add(iron);expected.add(cap);
		assertEquals(this.deco.sugerir().containsAll(expected), true);
	}
}
