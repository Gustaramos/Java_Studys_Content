package com.algaworks.curso.fjoo.treinador;

import com.algaworks.curso.fjoo.animal.*;

public class Treinador {
	
	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Zoe");
		System.out.println(cachorro.getNome());

		DonoCachorro dono = new DonoCachorro();
		dono.ensinarCachorroSentar(cachorro);
	}
	
	
}
