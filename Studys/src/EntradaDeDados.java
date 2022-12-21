package Studys.src;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Peso: ");
		int peso = entrada.nextInt();
		
		System.out.print("Altura: ");
		double altura = entrada.nextDouble();
		
		
		System.out.print("Sexo (1 para 'M' ou 2 para 'F'): ");
		char sexo = entrada.nextShort() == 1 ? 'M' : 'F';
		
		double imc = peso / (altura * altura);
		
		System.out.println("IMC de " + nome + ": " + imc);
		
		/*REGRAS DE CALCULO DO IMC, BASEADO NO SEXO DA PESSOA:
		/SEXO FEMININO IMC ABAIXO DO PESO: 19.1 || SEXO MASCULINO IMC ABAIXO PESO: 20.7
		/SEXO FEMININO IMC IDEAL DE: 19.1 - 25.8 || SEXO MASCULINO IMC IDEAL DE: 20.8 - 26.4
		/SEXO FEMININO IMC UM POUCO ACIMA DE: 25.9 - 27.3 || SEXO MASCULINO IMC UM POUCO ACIMA DE: 26.5 - 27.8
		/SEXO FEMININO IMC ACIMA DO PESO : 27.4 - 32.3 || SEXO MASCULINO IMC ACIMA DO PESO: 27.9 - 31.1
		/SEXO FEMININO IMC OBESO ACIMA DE: 32.3 || SEXO MASCULINO IMC OBESO ACIMA DE: 31.1
		*/
	
		if ((sexo == 'F' && imc < 19.1) || (sexo == 'M' && imc < 20.7)){
			System.out.println("Abaixo do peso ideal!");
		} else if((sexo == 'F' && imc <= 25.8) ||(sexo == 'M' && imc <= 26.4)){
			 System.out.println("Peso ideal!");
		} else if((sexo == 'F' && imc <= 27.3) || (sexo == 'M' && imc <= 27.8)){
			System.out.println("Você está um pouco acima do peso!");
		} else if((sexo == 'F' && imc <= 32.3) || (sexo == 'M' && imc <= 31.1)){
			System.out.println("Você está acima do seu peso ideal!");
		} else if ((sexo == 'F' && imc <= 32.3)|| (sexo == 'M' && imc <= 31.1))
			System.out.println("Obesidade 3!");
			System.out.println("Muito cuidado com o seu peso!");
		}
	
}
