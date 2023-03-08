package com.calculo.bigdecimal;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoBigDecimal {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	DecimalFormat formatador = new DecimalFormat("#,##0.00");
	
	System.out.println("Valor do produto: ");
	double valor = input.nextDouble();
	
	BigDecimal valorBig = new BigDecimal(valor);
	BigDecimal resultado = valorBig.multiply(BigDecimal.TEN).divide(new BigDecimal(100));
	
	String valorFormatado = formatador.format(resultado);
	System.out.println("10% do valor do produto é: " + valorFormatado);
	}

}
