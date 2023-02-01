package seguradora.sistema.polices;

public class SeguroPrincipal {

	public static void main(String[] args) {
		CorretoraSeguros corretora = new CorretoraSeguros();
		
		Carro meuCarro = new Carro(2012,45000d);
		Imovel meuImovel = new Imovel(920000d, 230);
		
		corretora.fazerPropostaSeguro(meuCarro);
		corretora.fazerPropostaSeguro(meuImovel);
	}

}
