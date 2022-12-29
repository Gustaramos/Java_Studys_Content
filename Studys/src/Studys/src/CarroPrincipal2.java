package Studys.src;

public class CarroPrincipal2 {

	public static void main(String[] args) {			
		Carro meuCarro = new Carro();
		meuCarro.modelo = "RX - 7 SPIRIT R";
		
		Carro seuCarro = new Carro();
		seuCarro.modelo = "Skyline GTR R34";				
	
		meuCarro.ligar();
		seuCarro.ligar();
	}

}
