package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Persoonal {
	private List<Persoona> personas = new ArrayList<Persoona>();
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private GuiaTelefonica guiaTelefonica = new GuiaTelefonica();
	
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
	
	public Llamada registrarLlamada(Llamada llamada) {
		llamadas.add(llamada);
		return llamada;
		
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
