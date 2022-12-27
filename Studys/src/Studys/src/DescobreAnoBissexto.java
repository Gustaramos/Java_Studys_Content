package Studys.src;
import java.util.Scanner;

public class DescobreAnoBissexto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ano: ");
		int ano = input.nextInt();
		
		if(ano % 400 == 0) {
			System.out.println(ano + " é um ano bissexto!");
		} else if(ano % 4 == 0) {
			 	if(ano % 100 != 0) {
			 		System.out.println(ano + " é um ano bissexto!");
				} else {
					System.out.println(ano + " não é um ano bissexto!");
				}
		} else {
			System.out.println(ano + " não é um ano bissexto!");
		}
	}
	}


