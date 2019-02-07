/** create by system gera-java version 1.0.0 17/12/2018 20:24 : 13*/
package com.nouhoun.springboot.jwt.integration.domain.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.nouhoun.springboot.jwt.integration.domain.ModelJPA;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.).
 * This represents an account for a transfer setting.
 */

@Entity
@Table(name = "DOCUMENTO")
public class Documento extends ModelJPA {

	/** The econtabil id for the Documento. */
	@Id
	@Column(name = "DOCUMENTO_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "documento_seq")
	@SequenceGenerator(name = "documento_seq", sequenceName = "documento_seq", allocationSize = 1)
	private Integer id;

	/** The econtabil documentoTypeEnumValue for the Documento. */
	@Column(name = "DOCUMENTOTYPEENUMVALUE")
	private Integer documentoTypeEnumValue;

	@Column(name = "ENTIDADE_ID")
	private Integer entidadeId;

	/** The econtabil numero for the Documento. */
	@Column(name = "NUMERO")
	private String numero;

	/** The econtabil data for the Documento. */
	@Column(name = "DATA")
	private Long data;

	/**
	 * Default constructor.
	 */
	public Documento() {
		super();
	}

	/**
	 * /** Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * /** Gets the documentoTypeEnumValue.
	 *
	 * @return the documentoTypeEnumValue
	 */
	public Integer getDocumentoTypeEnumValue() {
		return documentoTypeEnumValue;
	}

	/**
	 * Sets the documentotypeenumvalue.
	 *
	 * @param id the documentotypeenumvalue to set
	 */
	public void setDocumentoTypeEnumValue(Integer documentotypeenumvalue) {
		this.documentoTypeEnumValue = documentotypeenumvalue;
	}

	/**
	 * /** Gets the numero.
	 *
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * Sets the numero.
	 *
	 * @param id the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * /** Gets the data.
	 *
	 * @return the data
	 */
	public Long getData() {
		return data;
	}

	/**
	 * Sets the data.
	 *
	 * @param id the data to set
	 */
	public void setData(Long data) {
		this.data = data;
	}

	public Integer getEntidadeId() {
		return entidadeId;
	}

	public void setEntidadeId(Integer entidadeId) {
		this.entidadeId = entidadeId;
	}

	@Override
	public String toString() {
		return "Documento [getId()=" + getId() + ", getDocumentoTypeEnumValue()=" + getDocumentoTypeEnumValue()
				+ ", getNumero()=" + getNumero() + ", getData()=" + getData() + ", getEntidadeId()=" + getEntidadeId()
				+ ", toString()=" + super.toString() + "]";
	}

}
