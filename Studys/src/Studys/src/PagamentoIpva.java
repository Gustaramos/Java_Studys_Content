package Studys.src;
import java.util.Scanner;

public class PagamentoIpva {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Solicita o final da placa do veiculo do usuário!
		System.out.print("Digite o final da sua placa: ");
		int finalPlaca = input.nextInt();
		
		// Valida a variavel com final da placa!
		//Sobre o SWITCH = Faz uma validação de informações bruta, para evitar a necessidade de fazer várias condições com if's e else's. É uma estrutura de validação de condição. 
		switch(finalPlaca) { 	
			case 1: 
				System.out.println("A data do vencimento do seu IPVA é no dia 12/01");
				break;
			case 2: 
				System.out.println("A data do vencimento do seu IPVA é no dia 05/01");
				break;
			default:
				System.out.println("Desulpe, ainda não temos informações sobre o vencimento do seu IPVA!");
		}	
	}

}
