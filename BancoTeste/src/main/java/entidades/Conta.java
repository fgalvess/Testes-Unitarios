package entidades;

import java.util.Date;

public class Conta {
	private Usuario usuario;
	private String agencia;
	private String conta;
	private Double saldo;
	private Date dataAbertura;
	private Date dataEncerramento;
	
	public Conta() {}
	
	public Conta(Usuario usuario, String agencia, String conta, Double saldo, Date dataAbertura) {
		this.usuario = usuario;
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
	}
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public Date getDataEncerramento() {
		return dataEncerramento;
	}
	public void setDataEncerramento(Date dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}
}
