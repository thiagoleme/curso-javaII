package br.com.trilha.java.cursoII;

public class Conta {
	private double saldo;

	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double deposito){
		this.saldo += deposito;
	}
	
	public void saca(double saque){
		this.saldo -= saque;
	}
}
