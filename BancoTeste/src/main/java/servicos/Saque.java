package servicos;

import entidades.Conta;
import utils.APIConnection;
import utils.DatabaseConnection;

public class Saque {
	private APIConnection apiConnection;
	private DatabaseConnection bdConnection;

	public void realizaSaque(Conta conta, Double valor) {
		if (possuiSaldo(conta, valor) && (apiConnection.consultaSPC(conta.getUsuario().getNome()))) {
			conta.setSaldo(conta.getSaldo() - valor);
			bdConnection.insertConta(conta);
		}
	}

	private boolean possuiSaldo(Conta conta, Double valor) {
		if (conta.getSaldo() >= valor) {
			return true;
		} else {
			return false;
		}

	}

	public void setAPIConnection(APIConnection apiConnection) {
		this.apiConnection = apiConnection;
	}

	public void setDatabaseConnection(DatabaseConnection bdConnection) {
		this.bdConnection = bdConnection;
	}
}
