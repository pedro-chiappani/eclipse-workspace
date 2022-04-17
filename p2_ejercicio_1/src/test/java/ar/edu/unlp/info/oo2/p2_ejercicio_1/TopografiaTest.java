package ar.edu.unlp.info.oo2.p2_ejercicio_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

public class TopografiaTest {
	
	private Topografia topoAgua, topoTierra, topoPantano, topoMixta1, topoMixta2;
	
	@BeforeEach
	public void setUp() {
		topoAgua = new TopografiaSimple(1);
		topoTierra = new TopografiaSimple(0);
		topoPantano = new TopografiaSimple(0.7);
		List<Topografia> lista = new ArrayList<Topografia>();
		List<Topografia> lista2 = new ArrayList<Topografia>();
		lista2.add(new TopografiaSimple(1));lista2.add(new TopografiaSimple(0));lista2.add(new TopografiaSimple(0));lista2.add(new TopografiaSimple(1));
		topoMixta2 = new TopografiaMixta(lista2);
		lista.add(new TopografiaSimple(1));lista.add(new TopografiaSimple(0));lista.add(new TopografiaSimple(0));lista.add(topoMixta2);
		topoMixta1 = new TopografiaMixta(lista);
	}
	
	@Test
	public void calcularPropTest() {
		assertEquals(1, topoAgua.calcularProporcionAgua());
		assertEquals(0, topoAgua.calcularProporcionTierra());
		assertEquals(0.7, topoPantano.calcularProporcionAgua());
		assertEquals(0.3, topoPantano.calcularProporcionTierra());
		assertEquals(0, topoTierra.calcularProporcionAgua());
		assertEquals(1, topoTierra.calcularProporcionTierra());
		assertEquals(0.375, topoMixta1.calcularProporcionAgua());
		assertEquals(0.625, topoMixta1.calcularProporcionTierra());
	}
	
	@Test
	public void compararTopografiaTest() {
		Topografia topocomp = new TopografiaSimple(1);
		List<Topografia> list = new ArrayList<Topografia>();
		List<Topografia> list2 = new ArrayList<Topografia>();
		list2.add(new TopografiaSimple(1));list2.add(new TopografiaSimple(0));list2.add(new TopografiaSimple(0));list2.add(new TopografiaSimple(1));
		Topografia topoComp2 = new TopografiaMixta(list2);
		list.add(new TopografiaSimple(1));list.add(new TopografiaSimple(0));list.add(new TopografiaSimple(0));list.add(topoComp2);
		Topografia topoComp1 = new TopografiaMixta(list);
		assertEquals(true, topoAgua.compararTopografia(topocomp));
		assertEquals(false, topoTierra.compararTopografia(topocomp));
		assertEquals(true, topoMixta1.compararTopografia(topoComp1));
		list.removeAll(list);
		list2.removeAll(list2);
		list2.add(new TopografiaSimple(1));list2.add(new TopografiaSimple(0));list2.add(new TopografiaSimple(0));list2.add(new TopografiaSimple(1));
		Topografia topDistintaAux = new TopografiaMixta(list2);
		list.add(topDistintaAux);list.add(new TopografiaSimple(1));list.add(new TopografiaSimple(0));list.add(new TopografiaSimple(0));
		Topografia topoDistinta = new TopografiaMixta(list);
		assertEquals(false, topoMixta1.compararTopografia(topoDistinta));
	}
}
