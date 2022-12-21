import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Peso: ");
		int peso = entrada.nextInt();
		
		System.out.print("Altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.println("IMC de " + nome + ": " + imc);
		
		if (imc < 18.5) {
			System.out.println("Abaixo do peso ideal");
		} else if(imc < 25) {
			 System.out.print("Peso ideal!");
		} else if(imc < 30){
			System.out.print("Acima do peso!");
		} else if(imc < 40) {
			System.out.print("Cuidade! Obesidade 1 ou 2!");
		} else {
			System.out.print("Obesidade 3!");
		}
	}

}
