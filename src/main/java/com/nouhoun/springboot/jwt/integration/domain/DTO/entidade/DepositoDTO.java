package com.nouhoun.springboot.jwt.integration.domain.DTO.entidade;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */
@SuppressWarnings("serial")
public class DepositoDTO extends ModelDTO
{

	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ConfiguracaoDTO [getId()=" + getId() + ", toString()=" + super.toString() + "]";
	}

}