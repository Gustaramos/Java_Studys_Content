package Studys.src;
import java.util.Scanner;

public class MultaVeiculo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Variaveis tipo de veiculo.
		System.out.print("Tipo de veiculo (Carro de passeio ou Caminhão): ");
		String tipoVeiculo = input.nextLine();
		
		//Variaveis de velocidade maxima permitida.
		System.out.print("Velocidade máxima da via: ");
		int velocidadeMaximaPermitida= input.nextInt();

		//Variaveis de velocidade atual dos veiculos.
		System.out.print("Velocidade do veículo: ");
		int velocidadeVeiculo = input.nextInt();

		/*
		Regras condições: 
		Se o veículo for um carro de passeio e a velocidade do veículo for 10% maior que a velocidade permitida na via, o veículo deve ser multado.
		Se o veículo for um caminhão e a velocidade do veículo for 5% maior que a velocidade permitida na via, o veículo deve ser multado.
		*/
		if((tipoVeiculo.equals("Carro de passeio") && velocidadeVeiculo > velocidadeMaximaPermitida * 1.1) 
				|| (tipoVeiculo.equals("Caminhão") && velocidadeVeiculo > velocidadeMaximaPermitida * 1.05)) { 
			System.out.println("Você foi multado por excesso de velocidade");
		} else {
			System.out.println("Dentro do limite permitido");
		}
	}

}
