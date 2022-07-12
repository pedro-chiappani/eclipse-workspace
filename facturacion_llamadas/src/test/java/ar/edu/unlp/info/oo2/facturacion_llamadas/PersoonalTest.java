package ar.edu.unlp.info.oo2.facturacion_llamadas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersoonalTest {
	
	Persoonal sistema;
	Persoona emisorPersonaFisca, remitentePersonaFisica, emisorPersonaJuridica, remitentePersonaJuridica;
	
	@BeforeEach
	public void setUp() {
		this.sistema = new Persoonal();
		this.sistema.agregarTelefono("2214444554");
		this.sistema.agregarTelefono("2214444555");
		this.sistema.agregarTelefono("2214444556");
		this.sistema.agregarTelefono("2214444557");
		
		this.emisorPersonaFisca = sistema.registrarUsuario(new PersonaFisica("Marcelo Tinelli", "11555666"));
		this.remitentePersonaFisica = sistema.registrarUsuario(new PersonaFisica("Mirtha Legrand", "00000001"));
		this.emisorPersonaJuridica = sistema.registrarUsuario(new PersonaJuridica("Felfort", "17555222"));
		this.remitentePersonaJuridica = sistema.registrarUsuario(new PersonaJuridica("Moovistar", "25765432"));
		
		this.sistema.registrarLlamada(new LlamadaNacional(emisorPersonaJuridica, remitentePersonaFisica,10));
		this.sistema.registrarLlamada(new LlamadaInternacional(emisorPersonaJuridica, remitentePersonaFisica, 8));
		this.sistema.registrarLlamada(new LlamadaNacional(emisorPersonaJuridica, remitentePersonaJuridica, 5));
		this.sistema.registrarLlamada(new LlamadaInternacional(emisorPersonaJuridica, remitentePersonaJuridica, 7));
		this.sistema.registrarLlamada(new LlamadaNacional(emisorPersonaFisca, remitentePersonaFisica, 15));
		this.sistema.registrarLlamada(new LlamadaInternacional(emisorPersonaFisca, remitentePersonaFisica, 45));
		this.sistema.registrarLlamada(new LlamadaNacional(emisorPersonaFisca, remitentePersonaJuridica, 13));
		this.sistema.registrarLlamada(new LlamadaInternacional(emisorPersonaFisca, remitentePersonaJuridica, 17));
		
	}

	@Test
	void testcalcularMontoTotalLlamadas() {
		assertEquals(this.sistema.calcularMontoTotalLlamadas(emisorPersonaFisca), 15105.640000000001, 0.01);
		assertEquals(this.sistema.calcularMontoTotalLlamadas(emisorPersonaJuridica), 3131.7825000000003);
		assertEquals(this.sistema.calcularMontoTotalLlamadas(remitentePersonaFisica), 0);
		assertEquals(this.sistema.calcularMontoTotalLlamadas(remitentePersonaJuridica), 0);
	}
	
	@Test
	void testAgregarUsuario() {
		assertEquals(this.sistema.cantidadDeUsuarios(), 4);
		this.sistema.agregarTelefono("2214444558"); 
		Persoona nuevaPersona = this.sistema.registrarUsuario(new PersonaFisica("Chiche Gelblung", "2444555"));
		
		assertEquals(this.sistema.cantidadDeUsuarios(), 5);
		assertTrue(this.sistema.existeUsuario(nuevaPersona));
		
	}
	
	@Test
	void testEliminarUsuario() {
		assertEquals(this.sistema.cantidadDeUsuarios(), 4);
		assertTrue(this.sistema.existeUsuario(emisorPersonaFisca));
		this.sistema.eliminarUsuario(emisorPersonaFisca);
		assertEquals(this.sistema.cantidadDeUsuarios(), 3);
		assertFalse(this.sistema.existeUsuario(emisorPersonaFisca));
	}

}
