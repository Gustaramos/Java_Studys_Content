package sistema.financeiro.fornecedor;
import sistema.financeiro.RelatorioContas;
import sistema.financeiro.Conta;
import sistema.financeiro.ContaPagar;
import sistema.financeiro.ContaReceber;
import sistema.financeiro.OperacaoContaException;

public class Principal {

	public static void main(String[] args) {
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Negócios Imobiliarios");
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do João");
	
		//Instânciando clientes
		Cliente atacadista = new Cliente();
		atacadista.setNome("Triângulo Quadrado Atacadista");
		Cliente telecom = new Cliente();
		telecom.setNome("FoneNet Telecomunicações");
				
		
		//Instânciando contas a pagar
		ContaPagar contaPagar1 = new ContaPagar();
		contaPagar1.setFornecedor(imobiliaria);
		contaPagar1.setDescricao("Aluguel da Matriz");
		contaPagar1.setValor(1230d);
		contaPagar1.setDataVencimento("10/05/2012");
		
		ContaPagar contaPagar2= new ContaPagar(mercado, "Aluguel da Filial" , 700d, "11/05/2012");
		
		//Instânciando contas a receber
		ContaReceber contaReceber1 = new ContaReceber();
		contaReceber1.setCliente(atacadista);
		contaReceber1.setDescricao("Desenvolvimento de projeto java");
		contaReceber1.setDataVencimento("23/05/2012");
		contaReceber1.setValor(895000d);
		
		ContaReceber contaReceber2 = new ContaReceber (telecom, "Manutenção em sistema de conta online", 53200d, "130/05/2012");
		
		RelatorioContas relatorio  = new RelatorioContas();
		Conta[] contas = new Conta[] {contaPagar1, contaPagar2, contaReceber1, contaReceber2};
		relatorio.exibirListagem(contas);
		
		System.out.println("*************************");
		
		//pagamento e cancelamento de contas
		try {
			contaPagar1.pagar();
		} catch(OperacaoContaException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("----------------------");
		
		try {
			contaPagar2.pagar();
		} catch(OperacaoContaException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("----------------------");
		
		try {
			contaPagar2.cancelar();
		} catch(OperacaoContaException e) {
			System.out.println(e.getMessage());
		}	
		System.out.println("----------------------");
		
		
		try {
			contaReceber1.receber();
		} catch(OperacaoContaException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("----------------------");
		
		try{
			contaReceber2.cancelar();
		} catch(OperacaoContaException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("----------------------");
	}

	
}
