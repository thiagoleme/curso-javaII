package br.com.trilha.java.cursoII;

public class ContaCorrente extends Conta {
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}
}
