package ar.edu.unlp.info.oo2.p4_ejercicio_2;

public class DecoratorExtension extends FileDecorator{
	
	public DecoratorExtension(FileOO2 c) {
		super(c);
	}
	
	public String print() {
		return this.component.getExtension();
	}
}	
