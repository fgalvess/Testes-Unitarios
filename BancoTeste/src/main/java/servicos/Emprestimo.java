package servicos;

import entidades.Conta;
import utils.DataUtils;

public class Emprestimo {
	
	public void realizaEmprestimo (Conta conta, Double valor, int parcelas) {
		if(conta == null) {
			System.out.println("Usuário Vazio");
		}
	}
	
	public int aprovaPagamento (DataUtils dataUtils,int parcelas) {
		return dataUtils.prazoPagamento(parcelas);	
	}
	
}
