package ar.edu.unlp.info.oo2.p4_ejercicio_2;

import java.time.LocalDate;

public abstract class FileDecorator implements FileOO2 {
	
	protected FileOO2 component;
	
	public abstract String print();
	
	public String prettyPrint() {
		if (this.component.prettyPrint() != "") {
			return this.print() + " - " + this.component.prettyPrint();
		}
		return this.print();
	}
	
	public FileDecorator (FileOO2 c) {
		this.component = c;
	}
	
	public String getNombre() {
		return this.component.getNombre();
	}
	
	public String getExtension() {
		return this.component.getExtension();
	}
	
	public double getTamanio() {
		return this.component.getTamanio();
	}
	
	public LocalDate getFechaCreacion() {
		return this.component.getFechaCreacion();
	}
	
	public LocalDate getFechaModificacion() {
		return this.component.getFechaModificacion();
	}
	
	public String getPermisos() {
		return this.component.getPermisos();
	}
}
