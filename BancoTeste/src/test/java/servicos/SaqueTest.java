package servicos;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;
import entidades.Conta;
import entidades.Usuario;
import utils.APIConnection;
import utils.DatabaseConnection;

public class SaqueTest {

	APIConnection consultaSPCMock = Mockito.mock(APIConnection.class);
	DatabaseConnection insertContaMock = Mockito.mock(DatabaseConnection.class);
	Usuario fabio = new Usuario("Fabio");
	Conta contaFabio = new Conta();
	Saque saqueFabio = new Saque();

	@Before
	public void setUp() {
		contaFabio.setUsuario(fabio);
		contaFabio.setAgencia("123456");
		contaFabio.setSaldo(1000.00);
		saqueFabio.setAPIConnection(consultaSPCMock);
		saqueFabio.setDatabaseConnection(insertContaMock);
		Mockito.when(consultaSPCMock.consultaSPC(contaFabio.getUsuario().getNome())).thenReturn(true);
	}

	@Test
	public void realizarSaqueTest() {
		saqueFabio.realizaSaque(contaFabio, 500.00);
		assertEquals(500.00, contaFabio.getSaldo(), 0.01);
	}

	@Test
	public void realizarSaqueComSaldoInsuficienteTest() {
		saqueFabio.realizaSaque(contaFabio, 1200.00);
		assertEquals(1000.00, contaFabio.getSaldo(), 0.01);
	}

}
