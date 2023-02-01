package seguradora.sistema.polices;

public class Carro implements Seguravel{

	private int anoFabricacao ;
	private double valorMercado;
	
	
	public Carro(int anoFabricacao, double valorMercado) {
		this.anoFabricacao = anoFabricacao;
		this.valorMercado = valorMercado;
	}
	
	public String obterDescricao() {
		return "Carro ano: " + this.anoFabricacao + "\nValor de mercado: " + this.valorMercado;
	}
	
	public double calcularValorApolice() {
		double valorApolice = valorMercado * 0.04;
		if (anoFabricacao < 2000) {
			valorApolice = valorApolice * 0.90;
		}
		return valorApolice;
	}

}
