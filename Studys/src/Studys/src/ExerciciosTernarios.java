package my_library;
import java.util.Scanner;

public class ExerciciosTernarios {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Qual a nota do seu primeiro bimestre? ");
		int notaB1 = input.nextInt();
		System.out.print("Qual a nota do seu primeiro bimestre? ");
		int notaB2 = input.nextInt();
		System.out.print("Qual a nota do seu primeiro bimestre? ");
		int notaB3 = input.nextInt();
		System.out.print("Qual a nota do seu primeiro bimestre? ");
		int notaB4= input.nextInt();

		int mediaFinal = (notaB1 + notaB2 + notaB3 + notaB4) / 4;
		
		String resultadoAno = (mediaFinal >= 60) ? "Resultado: APROVADO!" : "Resultado: Reprovado!" ;
		
		System.out.println(resultadoAno);
		/*
		 System.out.println(resultadoAno + "\n" + "Sua média final foi de: " + mediaFinal + "\nA média necessária é de no minimo: " + 60);
		*/
		
			if (resultadoAno == "Resultado: APROVADO") {
				System.out.println("\nSua média final foi de: " + mediaFinal + ". Parabéns, continue assim!");
			}else {
				System.out.println("Sua média final foi de: " + mediaFinal + ". Você ficara retido mais um pedíodo na atual série!");
			}
		
		
		}
		
	}

