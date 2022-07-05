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
		Persoona var;
		if (t.equals("fisica")) {
			String tel = guiaTelefonica.obtenerUltimo();
			guiaTelefonica.eliminar(tel);
			var = new PersonaFisica(nombre, tel, data);
		}
		else {
			String tel = guiaTelefonica.guia.last();
			guiaTelefonica.guia.remove(tel);
			var = new PersonaJuridica(nombre,tel,data);
		}
		personas.add(var);
		return var;
		
	}
	
	public boolean eliminarUsuario(Persoona p) {
		List<Persoona> l = personas.stream().filter(persona -> persona != p).collect(Collectors.toList());
		boolean borre = false;
		if (l.size() < personas.size()) {
			this.personas = l;
			this.guiaTelefonica.guia.add(p.getTel());
			borre = true;
		}
		return borre;
		
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
		double c = 0;
		Persoona aux = null;
		for (Persoona pp : personas) {
			if (pp.tel == p.getTel()) {
				aux = pp;
				break;
			}
		} if (aux == null) return c;
		if (aux != null) {
			for (Llamada l : aux.lista1) {
				double auxc = 0;
				if (l.tipoDeLlamada == "nacional") {
					auxc += l.dur *3 + (l.dur*3*0.21);
				} else if (l.tipoDeLlamada == "internacional") {
					auxc += l.dur *200 + (l.dur*200*0.21);
				}
				
				if (aux.t == "fisica") {
					auxc -= auxc*descuentoFis;
				} else if(aux.t == "juridica") {
					auxc -= auxc*descuentoJur;
				}
				c += auxc;
			}
		}
		return c;
	}

	public int cantidadDeUsuarios() {
		return personas.size();
	}

	public boolean existeUsuario(Persoona persona) {
		return personas.contains(persona);
	}
	
}
