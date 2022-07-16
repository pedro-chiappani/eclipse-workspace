package ar.edu.unlp.info.oo2.p6_ejercicio_1C;

import java.util.logging.*;
import org.json.simple.*;

public class JSONFormatter extends Formatter{
	@SuppressWarnings("unchecked")
	@Override
	public String format(LogRecord record) {
		JSONObject data = new JSONObject();
		data.put("message", record.getMessage());
		data.put("level", record.getLevel());
		return data.toJSONString();
	}
}
