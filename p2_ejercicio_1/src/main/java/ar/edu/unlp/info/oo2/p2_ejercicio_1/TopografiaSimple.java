package ar.edu.unlp.info.oo2.p2_ejercicio_1;

public class TopografiaSimple implements Topografia{

	private int propAgua;
	
	public TopografiaSimple (int agua) {
		this.propAgua = agua;
	}
	
	public double calcularProporcionAgua() {
		return this.propAgua;
	}
	
	public double calcularProporcionTierra() {
		return 1-propAgua;
	}
	
	public Boolean compararTopografia(Topografia topo) {
		return this.propAgua == topo.calcularProporcionAgua();
	}
}
