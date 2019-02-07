package com.nouhoun.springboot.jwt.integration.domain.DTO.entidade;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.).
 * This represents an account for a transfer setting.
 */
@SuppressWarnings("serial")
public class CnaeDTO extends ModelDTO {

	private Integer id;

	private String codigo;

	private String cnae;

	private String descricao;

	private String abreviado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCnae() {
		return cnae;
	}

	public void setCnae(String cnae) {
		this.cnae = cnae;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAbreviado() {
		return abreviado;
	}

	public void setAbreviado(String abreviado) {
		this.abreviado = abreviado;
	}

	@Override
	public String toString() {
		return "CnaeDTO [getId()=" + getId() + ", getCodigo()=" + getCodigo() + ", getCnae()=" + getCnae()
				+ ", getDescricao()=" + getDescricao() + ", getAbreviado()=" + getAbreviado() + ", toString()="
				+ super.toString() + "]";
	}

}