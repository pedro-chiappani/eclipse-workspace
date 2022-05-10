package ar.edu.unlp.info.oo2.p3_ejercicio_4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;

public class Novedad implements Sugerencia{

	private List<Pelicula> subtract(List<Pelicula> a, List<Pelicula> b){
		List<Pelicula> result = new ArrayList<>(a);
		result.removeAll(b);
		return result;
	}
	
	public List<Pelicula> sugerir(Decodificador deco){
		List<Pelicula> noVistas = (this.subtract(deco.getPeliculas(), deco.getVistas())).stream().sorted(Comparator.comparingInt(Pelicula::getAnio).reversed()).collect(Collectors.toList());
		return noVistas.stream().limit(3).collect(Collectors.toList());
	}
}
