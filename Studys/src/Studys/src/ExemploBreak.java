package my_library;
import java.util.Scanner;

public class ExemploBreak {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int divisor = input.nextInt();
		
		for(int i = 100; i <= 200; i++) {
			if(i % divisor == 0) {
				break;
			}
			System.out.println(i);
		}
	System.out.print("Fim do programa!");
	}

}
