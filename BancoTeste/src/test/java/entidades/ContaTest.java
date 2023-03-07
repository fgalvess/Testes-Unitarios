package entidades;

import static org.junit.Assert.*;
import java.sql.Date;
import org.junit.Before;
import org.junit.Test;

public class ContaTest {

	Conta contaTeste;
	Usuario Fabio_Guerra;

	@Before
	public void setUp() throws Exception {
		contaTeste = new Conta();
	}

	@Test
	public void usuarioGetSetTest() {
		Fabio_Guerra = new Usuario("Fabio Guerra");
		contaTeste.setUsuario(Fabio_Guerra);
		assertEquals(Fabio_Guerra, contaTeste.getUsuario());
	}
	
	@Test
	public void agenciaGetSetTest() {
		contaTeste.setAgencia("12345");
		assertEquals("12345", contaTeste.getAgencia());
	}

	@Test
	public void contaGetSetTest() {
		contaTeste.setConta("09876");
		assertEquals("09876", contaTeste.getConta());
	}

	@Test
	public void saldoGetSetTest() {
		contaTeste.setSaldo(250.50);
		assertEquals(250.50, contaTeste.getSaldo(), 0.01);
	}

	@Test
	public void dataDeAberturaGetSetTest() {
		@SuppressWarnings("deprecation")
		Date dataAbertura = new Date(2023, 3, 01);
		contaTeste.setDataAbertura(dataAbertura);
		assertEquals(dataAbertura, contaTeste.getDataAbertura());
	}

	@Test
	public void dataEncerramentoGetSetTest() {
		@SuppressWarnings("deprecation")
		Date dataEncerramento = new Date(2023, 4, 01);
		contaTeste.setDataEncerramento(dataEncerramento);
		assertEquals(dataEncerramento, contaTeste.getDataEncerramento());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void construtorContaTest() {
		Usuario fabio = new Usuario();
		contaTeste = new Conta(fabio, "1234", "0987", 150.70, new Date(2023, 3, 01));
		assertEquals(fabio, contaTeste.getUsuario());
		assertEquals("1234", contaTeste.getAgencia());
		assertEquals("0987", contaTeste.getConta());
		assertEquals(150.70, contaTeste.getSaldo(), 0.01);
		assertEquals(new Date(2023, 3, 01), contaTeste.getDataAbertura());
	}

}
