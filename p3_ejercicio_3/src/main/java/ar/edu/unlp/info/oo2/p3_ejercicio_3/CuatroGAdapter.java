package ar.edu.unlp.info.oo2.p3_ejercicio_3;

public class CuatroGAdapter implements Connection{
	private CuatroGConnection conexion;
	
	public CuatroGAdapter() {
		this.conexion = new CuatroGConnection();
	}
	
	public String sendData(String data, long crc) {
		return this.conexion.transmit(data, crc);
	}
	
	public String pict() {
		return this.conexion.symb();
	}
}
