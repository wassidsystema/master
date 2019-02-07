package com.nouhoun.springboot.jwt.integration.domain.DTO.entidade;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.).
 * This represents an account for a transfer setting.
 */
@SuppressWarnings("serial")
public class DocumentoDTO extends ModelDTO {

	private Integer id;
	
	private String documentoType;

	private Integer documentoTypeEnumValue;

	private Integer entidadeId;

	private String numero;

	private Long data;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDocumentoTypeEnumValue() {
		return documentoTypeEnumValue;
	}

	public void setDocumentoTypeEnumValue(Integer documentoTypeEnumValue) {
		this.documentoTypeEnumValue = documentoTypeEnumValue;
	}

	public Integer getEntidadeId() {
		return entidadeId;
	}

	public void setEntidadeId(Integer entidadeId) {
		this.entidadeId = entidadeId;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Long getData() {
		return data;
	}

	public void setData(Long data) {
		this.data = data;
	}

	public String getDocumentoType() {
		return documentoType;
	}

	public void setDocumentoType(String documentoType) {
		this.documentoType = documentoType;
	}

	@Override
	public String toString() {
		return "DocumentoDTO [getId()=" + getId() + ", getDocumentoTypeEnumValue()=" + getDocumentoTypeEnumValue()
				+ ", getEntidadeId()=" + getEntidadeId() + ", getNumero()=" + getNumero() + ", getData()=" + getData()
				+ ", getDocumentoType()=" + getDocumentoType() 
				+ ", toString()=" + super.toString() + "]";
	}

}