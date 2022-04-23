package ar.edu.unlp.info.oo2.p2_ejercicio_3;

import java.time.LocalDate;

public interface FileSystem {
	
	public String getNombre();
	public int getTamano();
	public LocalDate getFecha();
	public int tamanoTotalOcupado();
	public Archivo archivoMasGrande();
	public Archivo archivoMasNuevo();
}
