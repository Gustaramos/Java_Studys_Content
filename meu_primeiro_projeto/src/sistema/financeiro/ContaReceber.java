package sistema.financeiro;
import sistema.financeiro.fornecedor.Cliente;

public class ContaReceber extends Conta{
	
	private Cliente cliente;
	
	
	public ContaReceber() {
		
	}
	
	
	public void exibirDetalhes() {
		System.out.println("*************************");
		System.out.println("Detelhes da conta a receber: \n\n" + "FORNECEDOR: " + this.getCliente().getNome() + "\nDESCRIÇÃO: " + getDescricao() + "\nVALOR: " + getValor() + 
				"\nVENCIMENTO: " + getDataVencimento() + "\n");
	}
	
	
	public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
		this.cliente = cliente;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	
	
	public void cancelar() throws OperacaoContaException{
		if(this.getValor() > 50000) {
			throw new OperacaoContaException ("Não foi possível realizar o cancelamento de sua conta: " + getDescricao() + ". ");
		}else {
			super.cancelar();
		}
	}
	
	public void receber() throws OperacaoContaException{
		if(SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			throw new OperacaoContaException ("Não é possível receber uma conta que já foi paga: " + this.getDescricao() + ". ");
		} else if(SituacaoConta.CANCELADA.equals(getSituacaoConta())) {
			throw new OperacaoContaException ("Não é possível recever uma conta que já foi cancelada: " + this.getDescricao() + ". ");
		} else {
			System.out.println("O pagamento da conta foi recebido com sucesso: " + this.getDescricao());
		}
		
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	
}
