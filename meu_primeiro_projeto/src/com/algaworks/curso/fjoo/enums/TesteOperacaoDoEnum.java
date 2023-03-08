package com.algaworks.curso.fjoo.enums;

public class TesteOperacaoDoEnum {

	public static void main(String[] args) {
		OperacaoAritimetica o1 = OperacaoAritimetica.ADICAO;
		
		int resultadoConta1 = o1.operacao(6, 7);
		System.out.println("O resultado da sua some é: " + resultadoConta1);
		
		for(OperacaoAritimetica oa : OperacaoAritimetica.values()) {
			System.out.println(oa + " -> " + oa.operacao(4,2));
	}
	}

}
