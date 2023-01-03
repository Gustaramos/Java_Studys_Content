package Studys.src;

public class ImcPrincipal {

	public static void main(String[] args) {
		Paciente p = new Paciente();
		p.peso = 100;
		p.altura = 1.65;
		
		Imc imc = p.calcularIndiceMassaCorporal();
		
		System.out.println("O IMC do paciente é: " + imc);
		System.out.println("Abaixo do peso ideal " + imc.abaixoDoPesoIdeal);
		System.out.println("O peso ideal seria " + imc.pesoIdeal);
		System.out.println("Obeso " + imc.obeso);
		System.out.println("Grau de obesidade " + imc.grauObesidade);
	}

}
