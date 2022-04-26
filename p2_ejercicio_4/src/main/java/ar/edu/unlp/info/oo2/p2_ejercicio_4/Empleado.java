package ar.edu.unlp.info.oo2.p2_ejercicio_4;

public abstract class Empleado {
	
	private int hijos;
	private boolean estaCasado;
	
	public Empleado() {
		this.hijos = 0;
		this.estaCasado = false;
	}
	
	public Empleado(int hijos, boolean casado) {
		this.hijos = hijos;
		this.estaCasado = casado;
	}
	
	private abstract int calcularBasico();
	
}
