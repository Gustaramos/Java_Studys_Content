package Studys.src;

public class TesteEncapsulamento {

	public static void main(String[] args) {
		ArCondicionado ar = new ArCondicionado();
		
		ar.trocarTemperatura(21);
		System.out.println("A temperatura foi alterada para " + ar.obterTemperatura() + "°");
		
		ar.trocarTemperatura(17);
		System.out.println("A temperatura foi alterada para " + ar.obterTemperatura()+ "°");
	}

}
