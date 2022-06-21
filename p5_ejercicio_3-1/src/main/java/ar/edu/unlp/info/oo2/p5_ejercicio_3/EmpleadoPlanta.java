package ar.edu.unlp.info.oo2.p5_ejercicio_3;

public class EmpleadoPlanta extends Empleado {
    public int cantidadHijos = 0;
    // ......
    
    public double extra() {
    	return (this.cantidadHijos * 2000);
    }
}
