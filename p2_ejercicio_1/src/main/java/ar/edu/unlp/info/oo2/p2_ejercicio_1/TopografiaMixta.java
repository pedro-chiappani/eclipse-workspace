package ar.edu.unlp.info.oo2.p2_ejercicio_1;

import java.util.List;

public class TopografiaMixta implements Topografia{
	
	private List<Topografia> componentes;
	
	public TopografiaMixta (List<Topografia> lista) {
		this.componentes = lista;
	}
	
	public List<Topografia> getComponentes(){
		return this.componentes;
	}
	
	public int size() {
		return componentes.size();
	}
	
	public double calcularProporcionAgua() {
		
		return (componentes.stream().mapToDouble(comp -> comp.calcularProporcionAgua()).sum())/componentes.size();
	}
	
	public double calcularProporcionTierra() {
		return (componentes.stream().mapToDouble(comp -> comp.calcularProporcionTierra()).sum())/componentes.size();
	}
	
	public Boolean equals (TopografiaMixta topo) {
		int n = topo.size();
		int i = 0;
		while (n-- != 0) {
			if (this.componentes.get(i).calcularProporcionAgua() != topo.getComponentes().get(i).calcularProporcionAgua()) 
				return false;
		}
		return true;
	}
	
	public Boolean compararTopografia(Topografia topo) {
		if (this.calcularProporcionAgua() == topo.calcularProporcionAgua()){
			TopografiaMixta aux = (TopografiaMixta) topo;
			return this.equals(aux);
		}
		return false;
	}
}
