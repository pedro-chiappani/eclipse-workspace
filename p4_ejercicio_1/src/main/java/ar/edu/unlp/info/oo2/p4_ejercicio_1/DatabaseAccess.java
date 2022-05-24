package ar.edu.unlp.info.oo2.p4_ejercicio_1;

import java.util.Collection;
import java.util.List;

public interface DatabaseAccess {
	int insertNewRow( List<String> rowData);
	Collection<String> getSearchResults(String queryString);
}
