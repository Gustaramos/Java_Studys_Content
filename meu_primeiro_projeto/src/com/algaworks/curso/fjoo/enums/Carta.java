package com.algaworks.curso.fjoo.enums;

public class Carta {

	private int numero;
	private Naipe naipe;
	
	public Carta(int numero, Naipe naipe) {
		this.numero = numero;
		this.naipe = naipe;
	}
	public void imprimirCarta() {
		System.out.println("Sou " + this.numero + " de " + this.naipe + ". E a minha cor é " + naipe.getCor());
	}
}
