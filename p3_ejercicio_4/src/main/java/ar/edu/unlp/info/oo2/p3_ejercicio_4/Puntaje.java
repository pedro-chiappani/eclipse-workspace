package ar.edu.unlp.info.oo2.p3_ejercicio_4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;

public class Puntaje implements Sugerencia {
	
	private List<Pelicula> subtract(List<Pelicula> a, List<Pelicula> b){
		List<Pelicula> result = new ArrayList<>(a);
		result.removeAll(b);
		return result;
	}
	
	public List<Pelicula> sugerir(Decodificador deco) {
		List<Pelicula> masPuntaje = deco.getNoVistas().stream().sorted(Comparator.comparingDouble(Pelicula::getPuntaje).reversed()).toList();
		return masPuntaje.stream().limit(3).toList();
	}
}
