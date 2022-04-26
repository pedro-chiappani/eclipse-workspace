package ar.edu.unlp.info.oo2.p2_ejercicio_4;

public class Temporario extends Empleado {

	private int horas;
	
	public Temporario() {
		super();
		this.horas = 0;
	}
	
	public Temporario(int hs, int hijos, boolean casado) {
		super(hijos, casado);
		this.horas = hs;
	}
	
	public int calcularBasico() {
		return 20000 + this.horas * 300;
	}
	
	public int calcularAdicional() {
		int tot = 0;
		if (super.getEstaCasado())
			tot += 5000;
		tot += super.getHijos() * 2000;
		return tot;
		}
}
