package Studys.src;

public class Pessoa {
	String nome;
	int idade;
	
	Pessoa(String nome){
		this.nome = nome;
	}
	Pessoa(String nome, int idade){
		this(nome);
		this.idade = idade;
	}
	
	
}
