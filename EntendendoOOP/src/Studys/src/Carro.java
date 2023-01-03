package Studys.src;

public class Carro {

		String fabricante;
		String modelo;
		String cor;
		int anoDeFabricacao;
		
		CarroProprietario dono;
		
		void ligar() {
			if (modelo != null) {
				System.out.println("Ligando o seu caddo: " + modelo); 
			} else {
				System.out.println("Não conseguimos encontraro modelo do seu carro no momento!");
			}
			
	
		}
		
	}

