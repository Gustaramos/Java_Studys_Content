package Studys.src;

public class FolhaDePagamentoPrincipal {

	public static void main(String[] args) {
		FolhaDePagamento folha= new FolhaDePagamento();
		double salario = folha.calcularSalario(200, 5, 15, 3);
		
		System.out.println("O salario é: " + salario);
	}

}
