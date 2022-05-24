package ar.edu.unlp.info.oo2.p3_ejercicio_4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;

public class Similaridad implements Sugerencia {
	
	private List<Pelicula> subtract(List<Pelicula> a, List<Pelicula> b){
		List<Pelicula> result = new ArrayList<>(a);
		result.removeAll(b);
		return result;
	}

	public List<Pelicula> sugerir(Decodificador deco){
		List<Pelicula> similares = deco.getVistas().stream().flatMap(p -> p.getSimilares().stream()).toList();
		similares = this.subtract(similares, deco.getVistas());
		return similares.stream().limit(3).toList();	
	}
}
