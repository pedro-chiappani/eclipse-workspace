package ar.edu.unlp.info.oo2.p3_ejercicio_3;

public class Dispositivo {
	
	private CRC_Strategy crcCalculator;
	private Ringer ringer;
	private Connection connection;
	private Display display;
	
	public String send(String data) {
		long crc = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, crc);
	}
}
