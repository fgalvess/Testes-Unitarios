package entidades;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class BancoTest {

	Banco bancoTeste = new Banco();
	
	@Test
	public void nomeBancoGetSetTest() {
		bancoTeste.setNome("Banco do Brasil");
		assertEquals("Banco do Brasil", bancoTeste.getNome());
	}
	
	@Test
	public void usuariosGetSetTest() {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		Usuario usuario1 = new Usuario("João");
		Usuario usuario2 = new Usuario("Maria");
		Usuario usuario3 = new Usuario("Pedro");
		Usuario usuario4 = new Usuario("Viviane");
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		usuarios.add(usuario4);
		
		bancoTeste.setUsuarios(usuarios);
		
		List<Usuario> UsuariosRetornados = bancoTeste.getUsuarios();
		assertEquals(usuarios, UsuariosRetornados);
	}
	
}
