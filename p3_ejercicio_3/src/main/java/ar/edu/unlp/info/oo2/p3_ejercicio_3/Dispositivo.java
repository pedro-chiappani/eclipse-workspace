package ar.edu.unlp.info.oo2.p3_ejercicio_3;

public class Dispositivo {
	
	private CRC_Strategy crcCalculator;
	private Ringer ringer;
	private Connection connection;
	private Display display;
	
	public Dispositivo() {
		this.crcCalculator = new CRC16_Calculator();
		this.connection = new WifiConn();
		this.ringer = new Ringer();
		this.display = new Display();
	}
	
	public String send(String data) {
		long crc = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, crc);
	}
	
	public String cambiarConexionWifi() {
		this.connection = new WifiConn();
		ringer.ring();
		return display.showBanner(this.connection.pict());
	}
	
	public String cambiarConexion4G() {
		this.connection = new CuatroGAdapter();
		ringer.ring();
		return display.showBanner(this.connection.pict());
	}
	
	public void cambiarCalculator16() {
		this.crcCalculator = new CRC16_Calculator();
	}
	public void cambiarCalculator32() {
		this.crcCalculator = new CRC32_Calculator();
	}
}
