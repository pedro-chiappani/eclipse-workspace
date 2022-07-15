package ar.edu.unlp.info.oo2.p6_ejercicio_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

public class DatabaseAccessProxyTest {
	private DatabaseAccess database;
	private DatabaseAccessProxy proxy;
	
	@BeforeEach
	public void setUp() throws Exception{
		this.database = new DatabaseRealAccess();
		this.proxy = new DatabaseAccessProxy(this.database, "5555");
	}
	
	@Test
	public void getSearchResultsLogeadoTest() {
		proxy.login("5555");
		assertEquals(Arrays.asList("Spiderman", "Marvel"), this.proxy.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.proxy.getSearchResults("select * from comics where id=10"));
	}
	
	@Test
	public void insertNewRowLogeadoTest() {
		proxy.login("5555");
		assertEquals(3, this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.proxy.getSearchResults("select * from comics where id=3"));
	}
	
	@Test
	public void getSearchResultsNoLogeadoTest() {
		proxy.login("1234");
		assertEquals(null, this.proxy.getSearchResults("select * from comics where id=1"));
        assertEquals(null, this.proxy.getSearchResults("select * from comics where id=10"));
	}
	
	@Test
	public void insertNewRowNoLogeadoTest() {
		proxy.login("1234");
		assertEquals(-1, this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(null, this.proxy.getSearchResults("select * from comics where id=3"));
	}
}
