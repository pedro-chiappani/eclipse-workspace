package ar.edu.unlp.info.oo2.p4_ejercicio_2;

public class DecoratorTamanio extends FileDecorator{
	
	public DecoratorTamanio(FileOO2 c) {
		super(c);
	}
	
	public String print() {
		return String.valueOf(this.component.getTamanio());
	}
}	