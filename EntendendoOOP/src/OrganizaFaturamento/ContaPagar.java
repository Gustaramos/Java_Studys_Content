package OrganizaFaturamento;

public class ContaPagar {
	private String descricao;
	private Double valor;
	private String dataVencimento;
	private Fornecedor fornecedor;
	
	 ContaPagar(){
		
	}
	
	public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	
	public void pagar() {
		System.out.println("Pagando a conta " + getDescricao() + " no valor de " + getValor() + " com o "
				+ "vencimento " + getDataVencimento() + " do fornecedor " + getFornecedor().getNome());
	}

	
	public void setFoenecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Double getValor() {
		return valor;
	}
	
	
	public void setDataVencimento(String dataVencimento){
		this.dataVencimento = dataVencimento;
	}
	public String getDataVencimento() {
		return dataVencimento;
	}
	
}
