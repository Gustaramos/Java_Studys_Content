package my_library;
import java.util.Scanner;

public class EstruturaWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o número inicial: ");
		int numeroInicial = input.nextInt();
		
		System.out.print("Digite o número final: ");
		int numeroFinal = input.nextInt();
		
		int numeroAtual = numeroInicial;
		
		while(numeroAtual <= numeroFinal) {
			System.out.println(numeroAtual);
			numeroAtual++;
		}
		
	}

}
