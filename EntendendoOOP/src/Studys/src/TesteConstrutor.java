package Studys.src;

public class TesteConstrutor {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("João");
		p1.nome = "João";
		p1.idade = 25;
		
		Pessoa p2 = new Pessoa("Maria", 25);
		p2.nome = "Maria";				
		p2.idade = 25;
	
		System.out.println("Nome \"" + p1.nome + "\" Idade é: " + p1.idade);
		System.out.println("Nome \"" + p2.nome + "\" Idade é: " + p2.idade);
	
	}
}
