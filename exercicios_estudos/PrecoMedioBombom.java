public class PrecoMedioBombom{
	
	public static void main(String[] args){
		//Valor das ultimas 3 vendas realizadas
		int preco1 = 5;
		int preco2 = 8;
		int preco3 = 12;
		
		int totalPrecos = preco1 + preco2 + preco3;
	
		int mediaPrecos = totalPrecos / 3;
		
		System.out.println("\"Sistema de calculo de Média\"" + mediaPrecos);
		System.out.println("Preço 1: " + preco1);
		System.out.println("Preço 2: " + preco2);
		System.out.println("Preço 3: " + preco3);
		System.out.println("Media dos preços: " + mediaPrecos);
	}
	
}