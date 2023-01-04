package Studys.src;

public class Boxing {
	public static void main(String[] args) {
		//Fazendo boxing de variaveis de tipos primitivos
		Integer i = 10;
		
		//Unboxing etapa de remover o wrapp da variavel
		Integer g = new Integer(15);
		
		int b = g;
		
		System.out.println(i + g);
	
		//Metodos de comparacao entre objetos wrappers
		Integer i1 = 127;
		Integer i2 = 127;
		
		Integer i3 = 128;
		Integer i4 = 128;
		
		System.out.println(i1.equals(i2));
		System.out.println(i3.equals(i4));
	
	}
}
