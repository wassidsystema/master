package com.nouhoun.springboot.jwt.integration.domain;

import java.util.List;

public class Search{


	private List<String> colunas;
	private String valor;
	public List<String> getColunas() {
		return colunas;
	}
	public void setColunas(List<String> colunas) {
		this.colunas = colunas;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}

}
