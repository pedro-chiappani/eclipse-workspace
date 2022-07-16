package ar.edu.unlp.info.oo2.p6_ejercicio_1C;

import java.util.Collection;
import java.util.List;
import java.util.logging.*;

public class DatabaseAccessProxy implements DatabaseAccess {
	private DatabaseAccess realDatabase;
	private boolean access;
	private String pass;
	
	public DatabaseAccessProxy(DatabaseAccess anAccess, String pass) {
		this.realDatabase = anAccess;
		this.access = false;
		this.pass = pass;
	}
	
	public boolean login (String pass) {
		if (pass == this.pass)
			access = true;
		else
			access = false;
		return access;
	}
	
	private boolean checkAccess() {
		return this.access;
	}
	
	public int insertNewRow(List<String> rowData) {
		if (!checkAccess()) {
			Logger.getLogger("app.main").severe("Acceso denegado a base de datos");
			return -1;
		}
		Logger.getLogger("app.main").warning("Acceso valido para insertar filas");;
		return realDatabase.insertNewRow(rowData);
	}
	
	public Collection<String> getSearchResults(String queryString){
		if (!checkAccess()) {
			Logger.getLogger("app.main").severe("Acceso denegado a base de datos");
			return null;
		}
		Logger.getLogger("app.main").info("Acceso valido para busqueda");
		return realDatabase.getSearchResults(queryString);
	}
}
