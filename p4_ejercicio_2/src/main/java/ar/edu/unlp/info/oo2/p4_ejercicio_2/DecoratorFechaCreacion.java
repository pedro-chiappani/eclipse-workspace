package ar.edu.unlp.info.oo2.p4_ejercicio_2;

public class DecoratorFechaCreacion extends FileDecorator{
	
	public DecoratorFechaCreacion(FileOO2 c) {
		super(c);
	}
	
	public String print() {
		return this.component.getFechaCreacion().toString();
	}
}	