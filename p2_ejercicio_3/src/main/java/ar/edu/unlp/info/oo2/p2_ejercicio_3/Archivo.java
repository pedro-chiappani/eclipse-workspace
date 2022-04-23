package ar.edu.unlp.info.oo2.p2_ejercicio_3;

import java.time.LocalDate;

public class Archivo implements FileSystem {

	private String nombre;
	private LocalDate fecha;
	private int tamano;
	
	public Archivo (String nombre, LocalDate fecha, int tamano) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.tamano = tamano;
	}
	
	public int getTamano() {
		return this.tamano;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public int tamanoTotalOcupado() {
		return this.tamano;
	}
	
	public Archivo archivoMasGrande() {
		return this;
	}
	
	public Archivo archivoMasNuevo() {
		return this;
	}
}