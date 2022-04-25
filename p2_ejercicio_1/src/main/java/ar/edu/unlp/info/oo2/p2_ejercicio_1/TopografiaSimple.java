package ar.edu.unlp.info.oo2.p2_ejercicio_1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TopografiaSimple implements Topografia{

	private double propAgua;
	
	public TopografiaSimple (double agua) {
		this.propAgua = agua;
	}
	
	public double calcularProporcionAgua() {
		return this.propAgua;
	}
	
	public int size() {
		return this.size();
	}
	
	public double calcularProporcionTierra() {
		BigDecimal total = new BigDecimal("0");
		total = total.add(new BigDecimal("1"));
		total = total.subtract(new BigDecimal(propAgua));
		total = total.setScale(3, RoundingMode.HALF_UP);
		return total.doubleValue();
	}
	
	public Boolean compararTopografia(Topografia topo) {
		return this.propAgua == topo.calcularProporcionAgua();
	}
}
