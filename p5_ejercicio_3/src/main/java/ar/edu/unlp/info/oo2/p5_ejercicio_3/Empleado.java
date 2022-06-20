package ar.edu.unlp.info.oo2.p5_ejercicio_3;

public abstract class Empleado {

	public String nombre;
	public String apellido;
	public double sueldoBasico = 0;

	public Empleado() {
		super();
	}

	public abstract double extra();

	public double sueldo() {
		return this.sueldoBasico + this.extra() - (this.sueldoBasico * 0.13);
	}

}