package com.algaworks.curso.fjoo.collections;

import java.math.BigDecimal;

public class Cargo {
	private String descricao;
	private BigDecimal salario;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}	
}
