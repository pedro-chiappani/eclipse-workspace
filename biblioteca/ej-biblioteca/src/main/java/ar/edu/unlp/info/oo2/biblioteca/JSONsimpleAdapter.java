package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;
import org.json.simple.*;

public class JSONsimpleAdapter extends VoorheesExporter {
	
	 
	public String exportar(List<Socio> socios) {
		if (socios.isEmpty()) {
			return "[]";
		}
		JSONArray jsonA = new JSONArray();
		socios.forEach(socio -> {
			JSONObject data = new JSONObject();
			data.put("nombre", socio.getNombre());
			data.put("email", socio.getEmail());
			data.put("legajo", socio.getLegajo());
			jsonA.add(data);
		});
		return jsonA.toJSONString();
	}
}
