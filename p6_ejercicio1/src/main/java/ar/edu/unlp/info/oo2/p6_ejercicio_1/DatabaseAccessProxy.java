package ar.edu.unlp.info.oo2.p6_ejercicio_1;

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
			Logger.getLogger("").log(Level.SEVERE, "Acceso denegado a base de datos");
			throw new RuntimeException("Acceso denegado");
		}
		Logger.getLogger("").log(Level.WARNING, "Acceso valido para insertar filas");;
		return realDatabase.insertNewRow(rowData);
	}
	
	public Collection<String> getSearchResults(String queryString){
		if (!checkAccess()) {
			Logger.getLogger("").log(Level.SEVERE, "Acceso denegado a base de datos");
			throw new RuntimeException("Acceso denegado");
		}
		Logger.getLogger("").log(Level.INFO,"Acceso valido para busqueda");
		return realDatabase.getSearchResults(queryString);
	}
}
