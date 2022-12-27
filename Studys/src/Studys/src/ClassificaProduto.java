package Studys.src;
import java.util.Scanner;

public class ClassificaProduto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int codigoProduto = 0;
		do {
				System.out.print("Digite o código do produto: ");
				codigoProduto = input.nextInt();
				
				if (codigoProduto != 0) {
						String corredor = (codigoProduto % 2 == 0) ? "\"Direita\"" : "\"Esquerda\"";	
		
						for (int i = 20; i >= 1; i--) {
							  if(codigoProduto % i == 0) {
								  System.out.println("O produto de codigo: " + codigoProduto +
												" ficara no corredor da " + corredor + " e na gaveta " + i);
								  break;
							   }
						}	
				}
		}while (codigoProduto != 0);
	}
}


