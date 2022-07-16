package ar.edu.unlp.info.oo2.p6_ejercicio_1C;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo2.p6_ejercicio_1C.DatabaseAccess;
import ar.edu.unlp.info.oo2.p6_ejercicio_1C.DatabaseAccessProxy;
import ar.edu.unlp.info.oo2.p6_ejercicio_1C.DatabaseRealAccess;
import ar.edu.unlp.info.oo2.p6_ejercicio_1C.JSONFormatter;
import ar.edu.unlp.info.oo2.p6_ejercicio_1C.ShoutingSimpleFormatter;

import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.*;

public class DatabaseAccessProxyTest {
	private DatabaseAccess database;
	private DatabaseAccessProxy proxy;
	
	@BeforeAll
	public static void configLogger() {
		LogManager.getLogManager().reset();
		Handler consoleHandler = new ConsoleHandler();
		consoleHandler.setFormatter(new ShoutingSimpleFormatter());
		Logger.getLogger("app.main").addHandler(consoleHandler);
		
		try {
			Handler fileHandler = new FileHandler("output_data/logs.json");
			fileHandler.setFormatter(new JSONFormatter());
			Logger.getLogger("app.main").addHandler(fileHandler);
			}
		catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Handler mailHandler = new MailHandler("example@logger.com", "destination@mail.com");
		Logger.getLogger("app.main").addHandler(mailHandler);
		
		FilterHandler filterHandler = new FilterHandler(mailHandler);
		filterHandler.setFormatter(new ShoutingSimpleFormatter());
		filterHandler.agregarPalabras("acceso");
		Logger.getLogger("app.main").addHandler(filterHandler);
	}
	
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
