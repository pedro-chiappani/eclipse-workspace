package ar.edu.unlp.info.oo2.p4_ejercicio_1;

import java.util.Collection;
import java.util.List;

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
			throw new RuntimeException("Acceso denegado");
		}
		return realDatabase.insertNewRow(rowData);
	}
	
	public Collection<String> getSearchResults(String queryString){
		if (!checkAccess())
			throw new RuntimeException("Acceso denegado");
		return realDatabase.getSearchResults(queryString);
	}
}
