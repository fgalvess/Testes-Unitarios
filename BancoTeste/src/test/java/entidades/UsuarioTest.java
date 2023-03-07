package entidades;

import static org.junit.Assert.*;
import org.junit.Test;

public class UsuarioTest {

	@Test
	public void instanciaUsuarioTest() {
		Usuario Fabio = new Usuario();
	}
	
	@Test
	public void instanciaUsuarioStringTest() {
		Usuario Fabio = new Usuario("Fabio");
	}
	
	@Test
	public void usuarioGetSetTest() {
		Usuario Fabio = new Usuario();
		Fabio.setNome("Fabio");
		assertEquals("Fabio", Fabio.getNome());
	}

}
