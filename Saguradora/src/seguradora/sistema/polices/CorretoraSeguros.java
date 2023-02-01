package seguradora.sistema.polices;

public class CorretoraSeguros {

	public void fazerPropostaSeguro(Seguravel objetoSeguravel) {
		System.out.println("------------------------------");
		System.out.println("Corretora de Seguros - Proposta!");
		System.out.println("------------------------------");
		System.out.println(objetoSeguravel.obterDescricao());
		System.out.println("Valor da apolice: " + objetoSeguravel.calcularValorApolice());
	}

}
