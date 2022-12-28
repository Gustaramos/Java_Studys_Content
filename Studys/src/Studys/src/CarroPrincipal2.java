package Studys.src;

public class CarroPrincipal2 {

	public static void main(String[] args) {			
		CarroProprietario dono1 = new CarroProprietario();
		dono1.nome = "Gustavo Ramos da Silva";
		
		
		Carro seuCarro = new Carro();
		seuCarro.modelo = "RX - 7 SPIRIT R";
		
		Carro meuCarro = new Carro();
		meuCarro.modelo = "Skyline GTR R34";
		
		meuCarro.dono = dono1;
		seuCarro.dono = dono1;
		
		System.out.println("Antes da mudança!");
		System.out.println(meuCarro.dono.nome);
		System.out.println(seuCarro.dono.nome);
		System.out.println(dono1.nome);
	
		seuCarro.dono.nome = "Mateus Ramos da Silva";
		System.out.println();
		System.out.println("Depois da mudança!");
		System.out.println(seuCarro.dono.nome);
		System.out.println(meuCarro.dono.nome);
		System.out.println(dono1.nome);
		
		//seuCarro.fabricante = "Mazda";
		//seuCarro.cor = "Branco";
		//seuCarro.anoDeFabricacao = 2002;
		
		/*
		System.out.println("Informações do veículo!");
		System.out.println("***************************************");
		System.out.println("Modelo: " + seuCarro.modelo);
		System.out.println("Fabricante: " + seuCarro.fabricante);
		System.out.println("Cor: " + seuCarro.cor);
		System.out.println("Ano de fabricação: " + seuCarro.anoDeFabricacao);
		System.out.println("");
		System.out.println("Informações do proprietario!");
		System.out.println("***************************************");
		System.out.println("Nome: " + seuCarro.dono.nome);
		System.out.println("CPF: " + seuCarro.dono.cpf);
		System.out.println("Idade: " + seuCarro.dono.idade);
		System.out.println("Cidade: " + seuCarro.dono.cidade);
		System.out.println("Logradouro: " + seuCarro.dono.logradouro);
		System.out.println("Bairro: " + seuCarro.dono.bairro);
		*/
		
		
	}

}
