package ar.edu.unlp.info.oo2.biblioteca;

import java.io.IOException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public class JacksonAdapter extends VoorheesExporter{
	
	ObjectMapper mapper = new ObjectMapper();
    String jsonString = "{\"nombre\":\"\", \"email\":, \"legajo\":}";

	
	public String exportar(List<Socio> socios) {
		if (socios.isEmpty())
			return "[]";
		try{
	         jsonString = mapper.writeValueAsString(socios);
	      }
	      catch (JsonParseException e) { e.printStackTrace();}
	      catch (JsonMappingException e) { e.printStackTrace(); }
	      catch (IOException e) { e.printStackTrace(); }
		return jsonString;
	}
}