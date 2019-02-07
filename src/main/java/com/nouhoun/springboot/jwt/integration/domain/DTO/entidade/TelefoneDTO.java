package com.nouhoun.springboot.jwt.integration.domain.DTO.entidade;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */
@SuppressWarnings("serial")
public class TelefoneDTO extends ModelDTO
{

	private Integer id;

    private Integer typeValue;
    
    private Integer emprId;

    private String ddd;

    private String numero;

    private Integer telefoneTypeEnumValue;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	

	public Integer getTypeValue() {
		return typeValue;
	}

	public void setTypeValue(Integer typeValue) {
		this.typeValue = typeValue;
	}

	

	public Integer getEmprId() {
		return emprId;
	}

	public void setEmprId(Integer emprId) {
		this.emprId = emprId;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Integer getTelefoneTypeEnumValue() {
		return telefoneTypeEnumValue;
	}

	public void setTelefoneTypeEnumValue(Integer telefoneTypeEnumValue) {
		this.telefoneTypeEnumValue = telefoneTypeEnumValue;
	}

	@Override
	public String toString() {
		return "TelefoneDTO [getId()=" + getId() + ", getTypeValue()=" + getTypeValue() + ", getEmprId()=" + getEmprId()
				+ ", getDdd()=" + getDdd() + ", getNumero()=" + getNumero() + ", getTelefoneTypeEnumValue()="
				+ getTelefoneTypeEnumValue() + ", toString()=" + super.toString() + "]";
	}

}