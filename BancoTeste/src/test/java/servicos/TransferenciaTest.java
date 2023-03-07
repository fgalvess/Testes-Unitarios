package servicos;

import static org.junit.Assert.*;

import org.junit.Test;

import entidades.Conta;

public class TransferenciaTest {
	
	Transferencia transferencia = new Transferencia();
	Conta conta1 = new Conta();
	Conta conta2 = new Conta();

	@Test
	public void transferenciaMesmoBancotest() {
		conta1.setSaldo(100.00);
		conta2.setSaldo(100.00);
		
		transferencia.transferenciaMesmoBanco(conta1, conta2, 50.00);
		assertEquals(150.00, conta2.getSaldo(), 0.01);		
	}
	
	@Test
	public void transferenciaMesmoBancoSaldoInsuficienteTest() {
		conta1.setSaldo(50.00);
		conta2.setSaldo(50.00);
		
		transferencia.transferenciaMesmoBanco(conta1, conta2, 100.00);
		assertEquals(50.00, conta2.getSaldo(), 0.01);
	}

}
