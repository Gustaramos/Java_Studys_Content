package com.algaworks.curso.fjoo.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class TesteNumeros {

	public static void main(String[] args) {
		DecimalFormat formatador = new DecimalFormat("R$#,##0.00");
		double valorDoProduto = 13.59;
		
		System.out.println(formatador.format(valorDoProduto));
		System.out.println(valorDoProduto);
		
		String entrada = "R$50,34";
		try {
			double numero = formatador.parse(entrada).doubleValue();
			System.out.println("Número: " + numero);
		} catch (ParseException e) {
			System.out.println("Entrada invalida!");
		}
		
		BigDecimal bg = new BigDecimal(3456483218200D);
		System.out.println(bg);	
		bg = bg.divide(BigDecimal.TEN);
		System.out.println(bg);
	}

}
