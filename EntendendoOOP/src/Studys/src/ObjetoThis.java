package Studys.src;

public class ObjetoThis {

	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.modelo = "Palio";
		
		System.out.println("Modelo antes da alteção: " + carro.modelo);
		
		carro.mudarModelo("Civic");
		System.out.println("Modelo após a alteração: " + carro.modelo);

	}

}
