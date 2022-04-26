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
		int tot = 0;
		if (super.getEstaCasado())
			tot += 5000;
		tot += 2000 * super.getHijos();
		tot += 2000 * this.anios;
		return tot;
	}
}
