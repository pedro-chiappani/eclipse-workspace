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
	
	public Boolean compararTopografia(Topografia topo) {
		if (topo.equals(this))
			return true;
		if (topo instanceof Topografia) {
			TopografiaMixta aux = (TopografiaMixta) topo;
			int n = this.size();
			if (n == aux.size()) {
				int i = 0;
				List<Topografia> v1 = aux.getComponentes();
				List<Topografia> v2 = this.getComponentes();
				while (n-- != 0) {
					if (v1.get(i).calcularProporcionAgua() != v2.get(i).calcularProporcionAgua())
						return false;
					i++;
				}
				return true;
			}
		}
		return false;
	}
}
