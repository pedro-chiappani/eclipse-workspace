package ar.edu.unlp.info.oo2.p6_ejercicio_1A;

import java.util.Collection;
import java.util.List;

public interface DatabaseAccess {
	int insertNewRow( List<String> rowData);
	Collection<String> getSearchResults(String queryString);
}
