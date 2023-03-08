package com.algaworks.curso.fjoo.excecoes;

public class ContaCorrente {
	private double saldo;

	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double valorSaque) throws SaldoInsuficienteException{
		double saldoTemporario = saldo - valorSaque;
			if(saldoTemporario < 0) {
				throw new SaldoInsuficienteException("Você não possui saldo suficiente em sua conta para sacar!");
			}
		this.saldo -= valorSaque;
	}
	
	public void depositar(double valorDeposito) {
		if(valorDeposito < 0) {
			throw new IllegalArgumentException("O valor não pode ser menor que Zero!");
		}
		this.saldo += valorDeposito;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
}
