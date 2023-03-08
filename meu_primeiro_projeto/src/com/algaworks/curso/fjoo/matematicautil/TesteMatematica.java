package com.algaworks.curso.fjoo.matematicautil;

public class TesteMatematica {

	public static void main(String[] args) {
		int numeroFibornacci = MatematicaUtil.calcularFibonacci(8);
		System.out.println("número de Fibornacci da posição 8: " + numeroFibornacci);

		double areaCirculo = MatematicaUtil.calcularAreaCirculo(104.8);
		System.out.println("A area do circulo é: " + areaCirculo);
	}

}
