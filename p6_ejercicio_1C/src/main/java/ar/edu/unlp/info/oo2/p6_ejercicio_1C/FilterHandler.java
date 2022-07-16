package ar.edu.unlp.info.oo2.p6_ejercicio_1C;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;

public class FilterHandler extends Handler{
	
	private List<String> palabras;
	private Handler handler;
	
	public FilterHandler(Handler h) {
		this.handler = h;
		palabras = new ArrayList<String>();
	}
	
	public FilterHandler(Handler h, List<String> malaspalabras) {
		this.handler = h;
		this.palabras = malaspalabras;
	}

	@Override
	public void close() throws SecurityException {
		this.handler.close();
		
	}

	@Override
	public void flush() {
		this.handler.flush();
		
	}
	
	@Override
	public void setFormatter(Formatter f) {
		this.handler.setFormatter(f);
	}

	@Override
	public void publish(LogRecord record) {
		String msg = record.getMessage();
		for (String palabra: palabras) {
			if (msg.contains(palabra)) {
				msg = msg.replace(palabra.toString(), "*****");
			}
		}
		record.setMessage(msg);
		this.handler.publish(record);
	}
	
	public void agregarPalabras(String pal) {
		this.palabras.add(pal);
	}
}
