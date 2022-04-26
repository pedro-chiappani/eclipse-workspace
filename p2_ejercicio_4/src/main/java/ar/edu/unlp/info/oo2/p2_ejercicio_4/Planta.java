package ar.edu.unlp.info.oo2.p2_ejercicio_4;

public class Planta extends Empleado{
	
	private int anios;

	public Planta () {
		super();
		this.anios = 0;
	}
	
	public Planta (int anios, int hijos, boolean casado) {
		super(hijos, casado);
		this.anios = anios;
	}
	
	public int calcularBasico() {
		return 50000;
	}
	
	public int calcularAdicional() {
		return super.calcularAdicional() + 2000 * this.anios;
	}
}
