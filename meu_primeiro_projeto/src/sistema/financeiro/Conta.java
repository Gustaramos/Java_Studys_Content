package sistema.financeiro;

public abstract class Conta {
	protected String descricao;
	protected Double valor;
	protected String dataVencimento;
	protected SituacaoConta situacaoConta;
	
	public Conta(){
		this.situacaoConta = SituacaoConta.PENDENTE;
	}
	
	public abstract void exibirDetalhes();
	
	public void cancelar() throws OperacaoContaException {
		if(SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Essa despesa já foi paga: " + this.getDescricao() + ". ");
		}else if(SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Essa despesa já foi cancelada: " + this.getDescricao());
		} else {
			System.out.println("Pronto, sua despesa foi cencelada: " + this.getDescricao() + ". ");
			
			this.situacaoConta = SituacaoConta.CANCELADA;
		}
	}
	
	public SituacaoConta getSituacaoConta() {
		return this.situacaoConta;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
}
