package sistema.financeiro;

public class RelatorioContas{
	
	public void exibirListagem(Conta[] contas) {
		System.out.println("-----------------------------------------------");
		System.out.println("Relatório de contas a pagar e contas a receber!");
		for (int i = 0; i < contas.length; i++) {
			contas[i].exibirDetalhes();
		
			}
	}
}

