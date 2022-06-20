package ar.edu.unlp.info.oo2.p5_ejercicio_3;

public class EmpleadoTemporario extends Empleado {
    public double horasTrabajadas = 0;
    public int cantidadHijos = 0;
    // ......
    
    @Override
	public double extra() {
    	return (this.horasTrabajadas * 500) + (this.cantidadHijos * 1000);
    }
}
