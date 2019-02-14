package com.nouhoun.springboot.jwt.integration.controller;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.domain.TreeValor;



public class CrudRequest {

	private List<TreeValor> campos;
	private String tabela;
	
	public List<TreeValor> getCampos() {
		return campos;
	}
	public void setCampos(List<TreeValor> campos) {
		this.campos = campos;
	}
	public String getTabela() {
		return tabela;
	}
	public void setTabela(String tabela) {
		this.tabela = tabela;
	}
	
}
