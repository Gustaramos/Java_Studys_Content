package seguradora.sistema.polices;

public class Imovel implements Seguravel{
	
	private double valorMercado;
	private int areaConstruida;
	
	
	public Imovel(double valorMercado, int anoConstruida) {
		this.valorMercado = valorMercado;
		this.areaConstruida = anoConstruida;
	}
	
	public String obterDescricao() {
		return "Imovel com o a área construida de: " + this.areaConstruida + "\nValor de mercado: " + this.valorMercado;
	}
	
	public double calcularValorApolice() {
		double valorApolice = valorMercado * 0.003;
		valorApolice += (areaConstruida * 0.5);
		
		return valorApolice;
	}

	

}
