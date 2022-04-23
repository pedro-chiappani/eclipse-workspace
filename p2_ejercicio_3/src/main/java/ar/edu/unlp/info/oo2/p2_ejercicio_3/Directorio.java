package ar.edu.unlp.info.oo2.p2_ejercicio_3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Directorio implements FileSystem {
	
	private String nombre;
	private LocalDate fecha;
	private int tamano;
	private List<FileSystem> fileSystems;
	
	public Directorio (String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.tamano = 32;
		this.fileSystems = new ArrayList<FileSystem>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getTamano() {
		return this.tamano;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public void agregar (FileSystem fs) {
		this.fileSystems.add(fs);
	}
	
	public int tamanoTotalOcupado () {
		int tot = 0; tot += this.tamano;
		tot += fileSystems.stream().mapToInt(dir -> dir.tamanoTotalOcupado()).sum();
		return tot;
	}
	
	public Archivo archivoMasGrande() {
		if (fileSystems.isEmpty())
			return null;
		List<FileSystem> listArch = fileSystems.stream().map(aux -> aux.archivoMasGrande()).collect(Collectors.toList());
		return (Archivo) listArch.stream().max(Comparator.comparing(FileSystem::getTamano)).get();
	}
	
	public Archivo archivoMasNuevo() {
		if (fileSystems.isEmpty())
			return null;
		List<FileSystem> listArch = fileSystems.stream().map(dir -> dir.archivoMasNuevo()).collect(Collectors.toList());
		return (Archivo) listArch.stream().max(Comparator.comparing(FileSystem::getFecha)).get();
	}
}