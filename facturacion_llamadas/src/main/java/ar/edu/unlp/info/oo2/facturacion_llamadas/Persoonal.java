package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Persoonal {
	private List<Persoona> personas = new ArrayList<Persoona>();
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private GuiaTelefonica guiaTelefonica = new GuiaTelefonica();
	private static double descuentoJur = 0.15;
	private static double descuentoFis = 0;
	
	public boolean agregarTelefono(String str) {
		if (!guiaTelefonica.contiene(str)) {
			guiaTelefonica.agregar(str);
			return true;
		}
		else
			return false;
	}
	
	public Persoona registrarUsuario(Persoona persona) {
		String tel = guiaTelefonica.obtenerUltimo();
		guiaTelefonica.eliminar(tel);
		persona.setTelefono(tel);
		personas.add(persona);
		return persona;	
	}
	
	public boolean eliminarUsuario(Persoona p) {
		if (existeUsuario(p)){
			this.agregarTelefono(p.getTelefono());
			personas.remove(p);
			return true;
		}
		return false;
	}
	
	public Llamada registrarLlamada(Persoona q, Persoona q2, String t, int d) {
		Llamada x = new Llamada();
		x.tipoDeLlamada = t;
		x.setEmisor(q.tel);
		x.setRemitente(q2.getTel());
		x.dur= d;
		llamadas.add(x);
		q.lista1.add(x);
		return x;
		
	}
	
	public double calcularMontoTotalLlamadas(Persoona p) {
		return p.calcularMontoTotalLlamadas();
	}

	public int cantidadDeUsuarios() {
		return personas.size();
	}

	public boolean existeUsuario(Persoona persona) {
		return personas.contains(persona);
	}
	
}
