package ar.edu.unlp.info.oo2.p3_ejercicio_3;

import java.util.zip.CRC32;

public class CRC32_Calculator implements CRC_Strategy{
	
	public long crcFor(String data) {
		CRC32 crc = new CRC32();
		String datos = data;
		crc.update(datos.getBytes());
		long result = crc.getValue();
		return result;
	}
}
