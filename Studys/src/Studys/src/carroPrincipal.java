package Studys.src;

public class carroPrincipal {

	public static void main(String[] args) {
		//Declaramos a variável
		Carro meuCarro = new Carro();//Instanciamos a variável com um objeto do tipo Carro. 
		meuCarro.fabricante = "Palio".toUpperCase();
		meuCarro.modelo = "Siena".toUpperCase();
		meuCarro.cor = "Prata".toUpperCase();
		meuCarro.anoDeFabricacao = 2015;
		
		Carro seuCarro = new Carro();
		seuCarro.fabricante = "Mazda".toUpperCase();
		seuCarro.modelo = "RX - 7 Spirit R".toUpperCase();
		seuCarro.cor = "Branco".toUpperCase();
		seuCarro.anoDeFabricacao = 2002;
		
		
		System.out.println("Detalhes do veículo 1: ");
		System.out.println("************************************************");
		System.out.println("Fabricante: " + meuCarro.fabricante);
		System.out.println("Modelo: " + meuCarro.modelo);
		System.out.println("Cor: " + meuCarro.cor);
		System.out.println("Ano de fabricação: " + meuCarro.anoDeFabricacao);
		
		System.out.println();
		
		System.out.println("Detalhes do veículo 2: ");
		System.out.println("************************************************");
		System.out.println("Fabricante: " + seuCarro.fabricante);
		System.out.println("Modelo: " + seuCarro.modelo);
		System.out.println("Cor: " + seuCarro.cor);
		System.out.println("Ano de fabricação: " + seuCarro.anoDeFabricacao);
	
	}

}
