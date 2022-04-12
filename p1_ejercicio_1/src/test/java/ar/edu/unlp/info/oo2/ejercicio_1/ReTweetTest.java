package ar.edu.unlp.info.oo2.ejercicio_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReTweetTest {
	ReTweet rt;
	Tweet tw;
	
	@BeforeEach
	public void setUp() {
		tw = new Tweet("Hola esto es un tweet");
	}
	
	@Test
	public void reTweetTest() {
		rt = tw.reTweet();
		assertEquals(rt.getTweetOriginal(), tw);
		assertEquals(tw.getCuerpo(), rt.getCuerpo());
	}
	
}
