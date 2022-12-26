package my_library;
import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ultimo número: ");
		int numeroFinal = input.nextInt();
		
	//	for (indicação/inicialização, 	condição, 			incremento.)
		for(int i = 1; 					i <= numeroFinal; 	i++) {
			System.out.println(i);
		}
		
	}

}
