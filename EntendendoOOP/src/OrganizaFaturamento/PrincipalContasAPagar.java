package OrganizaFaturamento;

public class PrincipalContasAPagar {

	public static void main(String[] args) {
		Fornecedor imobiliara = new Fornecedor();
		imobiliara.setNome("Casa & Cia Negócios Imobiliários");
		
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do Gustavo");
		
		ContaPagar conta1 = new ContaPagar();
		conta1.setDescricao("Aluguel da Matriz");
		conta1.setValor(1230d);
		conta1.setDataVencimento("19/05/2023");
		conta1.setFoenecedor(imobiliara);
		
		ContaPagar conta2 = new ContaPagar(mercado, "compras do mês", 390d, "11/05/2022");
		
		ContaPagar conta3 = new ContaPagar(mercado, "Aluguel da filial", 700d, "11/05/2023");

		conta1.pagar();
		conta2.pagar();
		conta3.pagar();
	}
	
}
