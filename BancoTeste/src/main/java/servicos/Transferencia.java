package servicos;

import entidades.Conta;

public class Transferencia {
	public int transferenciaMesmoBanco(Conta contaEnvia, Conta contaRecebe, Double valor) {
		if(contaEnvia.getSaldo() < valor) {
			System.out.println("Valor insuficiente");
			return 1;
		}
		
		contaEnvia.setSaldo(contaEnvia.getSaldo() - valor);
		contaRecebe.setSaldo(contaRecebe.getSaldo() + valor);
		return 0;	
	} 
}
