package com.algaworks.curso.fjoo.classemath;
import static java.lang.Math.PI;import javax.net.ssl.SSLContextSpi;

import static java.lang.Math.*;


public class TesteClasseMath {
	
	public static void main(String[] args) {
		//Cumprimento de uma circunferencia 2 x r x PI
		int raio = 4;
		double comprimento = 2 * raio * PI;
		System.out.println("Comprimento: " + comprimento + "!");
		
		//Máximo e minimo
		double[] precosProdutoA = {30.20, 24.49};
		double maiorPreco = max(precosProdutoA[0], precosProdutoA[1]);
		double menorPreco = min(precosProdutoA[0], precosProdutoA[1]);
		
		System.out.println("Maior preco: " + maiorPreco);
		System.out.println("Maior preco: " + menorPreco);
		
		//Potência
		System.out.println("2^3: " + pow(2, 3));
		
		
		//Raiz quadrada
		System.out.println("Raiz de 9: " + sqrt(9));

		//Arredondamento ceil, floor e round
		double n = 5.68;
		System.out.println("O menor inteiro: " + floor(n));//póximo menor inteiro
		System.out.println("O mior inteiro: " + ceil(n));//próximo maior inteiro
		System.out.println("Arredondamento: " + round(n));//Arredondamento.
	
		//tigonometria
		System.out.println("Seno: " + sin(40));
		System.out.println("Coseno: " + cos(40));
		
		//numeros aleatorios
		double numeroAleatorio = random() * 100;
		numeroAleatorio = (int) numeroAleatorio;
		System.out.println(numeroAleatorio);
		
	}
	
}
