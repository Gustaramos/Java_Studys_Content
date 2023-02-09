package mega.sena;
import java.util.Scanner;

public class JogarMegaSenaPrincipal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos jogos?");
		int quantidadeJogos = entrada.nextInt();

		System.out.println("----------------------------");
		
		for (int i = 1; i <= quantidadeJogos; i++) {
			GerarNumeros mega = new GerarNumeros();
			mega.sortear();
			mega.exibirNumeros();
			System.out.println("----------------------------");
		}
		
		System.out.println("*** Boa sorte! ***");
	}

	}
