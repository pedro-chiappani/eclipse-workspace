package ar.edu.unlp.info.oo2.p4_ejercicio_2;

import java.time.LocalDate;

public class File implements FileOO2{
	
	private String nombre;
	private String extension;
	private double tamanio;
	private LocalDate fecha_creacion;
	private LocalDate fecha_modificacion;
	private String permisos;
	
	public File (String nombre, String extension, double tamanio, LocalDate fechaC, LocalDate fechaM, String permisos) {
		super();
		this.nombre = nombre;
		this.extension = extension;
		this.fecha_creacion = fechaC;
		this.fecha_modificacion = fechaM;
		this.permisos = permisos;
	}
	
	public String prettyPrint() {
		return "";
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getExtension() {
		return this.extension;
	}
	
	public void setExtension(String extension) {
		this.extension = extension;
	}
	
	public double getTamanio() {
		return this.tamanio;
	}
	
	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}
	
	public LocalDate getFechaCreacion() {
		return this.fecha_creacion;
	}
	
	public void setFechaCreacion(LocalDate fechaC) {
		this.fecha_creacion = fechaC;
	}
	
	public LocalDate getFechaModificacion() {
		return this.fecha_modificacion;
	}
	
	public void setFechaModificacion(LocalDate fechaM) {
		this.fecha_modificacion = fechaM;
	}
	
	public String getPermisos() {
		return this.permisos;
	}
	
	public void setPermisos(String permisos) {
		this.permisos = permisos;
	}
}
