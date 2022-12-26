package my_library;
import java.util.Scanner;

public class ExemploContinue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int divisor = input.nextInt();
		
		for(int i = 100; i <= 200; i++) {
			if(i % divisor == 0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Fim do programa!");
	
	}
}