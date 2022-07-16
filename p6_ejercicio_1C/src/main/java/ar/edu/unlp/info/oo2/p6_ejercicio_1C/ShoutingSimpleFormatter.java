package ar.edu.unlp.info.oo2.p6_ejercicio_1C;

import java.util.logging.*;

public class ShoutingSimpleFormatter extends SimpleFormatter{
	@Override
	public String format(LogRecord record) {
		return super.format(record).toUpperCase();
	}
}
