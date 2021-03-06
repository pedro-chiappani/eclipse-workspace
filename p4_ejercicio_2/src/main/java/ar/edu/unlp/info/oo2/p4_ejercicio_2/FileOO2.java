package ar.edu.unlp.info.oo2.p4_ejercicio_2;

import java.time.LocalDate;

public interface FileOO2 {
	
	public String prettyPrint();
	
	public String getNombre();
	public String getExtension();
	public double getTamanio();
	public LocalDate getFechaCreacion();
	public LocalDate getFechaModificacion();
	public String getPermisos();
}
