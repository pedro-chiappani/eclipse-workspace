package ar.edu.unlp.info.oo2.ejercicio_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
	
	Tweet tw1;
	Tweet tw2;
	Tweet tw3;
	Usuario usu;
	
	@BeforeEach
	public void setUp() {
		usu = new Usuario("Deth");
		tw1 = new Tweet("Hola esto es un tweet permitido");
		tw2 = new Tweet("Hola esto se supone que no es un tweet permitido ya que tiene mas de 140 caracteres per no voy a saber eso a menos que me ponga a contar todos los caracteres asi que voy a escribir hasta que me aburra o me parezca un monton como ahora, chau");
		tw3 = new Tweet("");
	}
	
	@Test
	public void publicarTweetTest() {
		usu.publicarTweet("Hola esto es un tweet permitido");
		usu.publicarTweet("Hola esto se supone que no es un tweet permitido ya que tiene mas de 140 caracteres per no voy a saber eso a menos que me ponga a contar todos los caracteres asi que voy a escribir hasta que me aburra o me parezca un monton como ahora, chau");
		usu.publicarTweet("");
		assertEquals(usu.tweetsSize(), 1);
	}
	
}
