package app;

import java.util.ArrayList;
import java.util.Date;
import entidades.Banco;
import entidades.Conta;
import entidades.Usuario;
import servicos.Transferencia;

public class main {

	public static void main(String[] args) {
		Banco bb = new Banco();
		Usuario fabio = new Usuario("Fabio");
		Usuario	guerra = new Usuario("Guerra");
		Conta contaFabio = new Conta(fabio, "12345", "987654", new Double(500.00), new Date(2021, 00, 10));
		Conta contaGuerra = new Conta(guerra, "12345", "987123", new Double(1000.00), new Date(2021, 10, 05));
	
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(fabio);
		usuarios.add(guerra);
		
		bb.setNome("Banco do Brasil");
		bb.setUsuarios(usuarios);
		
		Transferencia almoco = new Transferencia();
		almoco.transferenciaMesmoBanco(contaFabio, contaGuerra, new Double(30.00));	
		
		Date teste = new Date(2021, 00, 10);
		int result = teste.compareTo(contaFabio.getDataAbertura());
		if(result == 0) {
			System.out.println("Datas Iguais");
		}else {
			System.out.println(result+ " DIAS");
		}
		
	}

}
