import java.util.Scanner;

	public class ConversorDeCambio {
		public static void main(String[] args) {
			try (Scanner input = new Scanner(System.in)) {
				
				//Variable referring the amount to convert
				System.out.println("Por favor, informe a quantia que você deseja converter!");
				System.out.print("Inserir apenas o valor desejado, sem vírgulas ou pontos: R$");
				int amountReal = input.nextInt();
				
				//Variable referring the Dollar quote to the Real.
				float quoteDollar = 5.20f;
				float taxes = amountReal * 1.10f / 100;
				
				//Variable returning the total of conversion with taxes on the final price
				float conversion = amountReal / quoteDollar - taxes;
				System.out.printf("US$" + "%.2f" , conversion);
				System.out.println();
				
				//Informing the user how much he`s paying in tax on the final transaction
				System.out.print("Você está pagando um total de R$");
				System.out.printf("%.0f" , taxes);
				System.out.print(" em taxas nesta conversão!");
				
				
				
			}
						
		}
		
}
