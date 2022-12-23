package my_library;
import java.util.Scanner;

public class Escopo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Idade: ");
		int idade = input.nextInt();
	
		boolean podeDirigir = idade >= 18;
		
		String nomePai = ("");
	
		if (!podeDirigir) {
			System.out.print("Nome do seu pai: ");
			nomePai = input.next();
		}
		
		System.out.println("Você pode dirigir?");
		
		if(podeDirigir) {
			System.out.println("Sim, você pode dirigir!");
		} else {
			System.out.println("Você não pode dirigir! Se fizer isso, o seu pai " + nomePai + " será preso. Cuidado!!");
		}
		
	}
	
}
