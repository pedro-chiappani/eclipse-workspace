package ar.edu.unlp.info.oo2.p2_ejercicio_4;

public class Pasante extends Empleado{
	
	private int examenes;
	
	public Pasante() {
		super();
		this.examenes = 0;
	}
	
	public Pasante(int exams, int hijos, boolean casado) {
		super(hijos, casado);
		this.examenes = exams;
	}
	
	public int calcularBasico() {
		return 20000;
	}
	
	public int calcularAdicional() {
		return 2000 * this.examenes;
	}
}
