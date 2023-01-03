package Caminhada;

public class Passeio {
	public static void main (String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome= "Gustavo";
		
		p1.cachorro = new Cachorro();
		
		p1.cachorro.nome = "Tristana";
		p1.cachorro.raca = "Pastor Belga";
		p1.cachorro.genero = 'F';
		p1.cachorro.idade = 1;
		
		Caminhada c = new Caminhada();
		c.andar(p1);
	}

}
