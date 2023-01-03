package Caminhada;

public class Caminhada {
	public void andar (Pessoa pessoa) {
		System.out.println("Eu \"" +  pessoa.nome + "\""
				+ " estou andando com a \"" + pessoa.cachorro.nome + "\"");
	}
}
