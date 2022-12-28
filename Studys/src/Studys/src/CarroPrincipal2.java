package Studys.src;

public class CarroPrincipal2 {

	public static void main(String[] args) {			
		Carro seuCarro = new Carro();
		seuCarro.modelo = "RX - 7 SPIRIT R";
		seuCarro.fabricante = "Mazda";
		seuCarro.cor = "Branco";
		seuCarro.anoDeFabricacao = 2002;

		seuCarro.dono = new CarroProprietario();
		seuCarro.dono.nome = "Gustavo";
		seuCarro.dono.cpf = "790.712.649-55";
		seuCarro.dono.cidade = "Londrina"; 
		seuCarro.dono.logradouro = "Capitão do Mato";
		seuCarro.dono.bairro = "Conjunto Habitacional Violim";
		seuCarro.dono.idade = 26;

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
		
		
		
	}

}
