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
	
	public abstract int calcularBasico();
	public abstract int calcularAdicional();
	
	public boolean getEstaCasado() {
		return this.estaCasado;
	}
	
	public int getHijos() {
		return this.hijos;
	}
	
	public double calcularDescuento() {
		return calcularBasico()*0.13 + calcularAdicional()*0.05;
	}
	
	public double sueldo() {
		return calcularBasico() + calcularAdicional() - calcularDescuento();
	}
}
