package ar.edu.unlp.info.oo2.p2_ejercicio_1;

import java.util.List;
import java.util.ArrayList;

public class TopografiaMixta implements Topografia{
	
	private List<Topografia> componentes;
	
	public double calcularProporcionAgua() {
		
		return (componentes.stream().mapToDouble(comp -> comp.calcularProporcionAgua()).sum())/componentes.size();
	}
	
	public double calcularProporcionTierra() {
		return (componentes.stream().mapToDouble(comp -> comp.calcularProporcionTierra()).sum())/componentes.size();
	}
	
	public Boolean compararTopografia(Topografia topo) {
		if (topo.equals(this))
			return true;
		if (topo.getClass().equals(List<Topografia>))
	}
}