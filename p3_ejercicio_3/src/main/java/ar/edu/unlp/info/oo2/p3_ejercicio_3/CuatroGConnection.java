package ar.edu.unlp.info.oo2.p3_ejercicio_3;

public class CuatroGConnection{
	private String symb;
	
	public CuatroGConnection() {
		this.symb = "Esto es un symb de 4G";
	}
	
	public String transmit(String data, long crc) {
		return data + " " + crc;
	}
	
	public String symb() {
		return this.symb;
	}
		
}
