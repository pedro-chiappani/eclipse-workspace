package ar.edu.unlp.info.oo2.p4_ejercicio_2;

public class DecoratorNombre extends FileDecorator{
	
	public DecoratorNombre(FileOO2 c) {
		super(c);
	}
	
	public String print() {
		return this.component.getNombre();
	}
}
