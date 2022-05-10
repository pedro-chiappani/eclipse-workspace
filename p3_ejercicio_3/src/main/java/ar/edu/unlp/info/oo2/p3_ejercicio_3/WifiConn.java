package ar.edu.unlp.info.oo2.p3_ejercicio_3;

public class WifiConn implements Connection {
	
	private String pict;
	
	public WifiConn() {
		this.pict = "Esto es un pict de Wifi";
	}
	
	public String sendData(String data, long crc) {
		return data + crc;
	}
	
	public String pict() {
		return this.pict;
	}
}
