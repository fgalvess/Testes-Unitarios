package utils;

import entidades.Banco;
import entidades.Conta;

public interface DatabaseConnection {
	
	public void insertSaque(Conta conta);
		
	public void insertConta(Conta conta);
	
	public void insertBanco(Banco banco);
	
	

}
