package ar.edu.unlp.info.oo2.p4_ejercicio_2;

public class DecoratorFechaModificacion extends FileDecorator{
	
	public DecoratorFechaModificacion(FileOO2 c) {
		super(c);
	}
	
	public String print() {
		return this.component.getFechaModificacion().toString();
	}
}	