package com.algaworks.curso.fjoo.strings;

public class Strings {
	public static void main(String[] args) {
		//String, StringBuilder e StringBuffer
		
		//******MANEIRA NÃO UTILIZAVEL********
		String s = "Olá"; // Criada a String "Olá".		
		s = s + "Pessoal"; // Criada a String "Olá Pessoal!"
		
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder("Olá"); // Existe a StringBuilder 
		sb.append(" Pessoal"); // Reaproveitando a StringBuilder
		
		String resultado = sb.toString();
		System.out.println("Com StringBuilder: " + resultado);
		
	} 
}
