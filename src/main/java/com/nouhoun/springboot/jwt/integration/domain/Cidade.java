/** create by system gera-java version 1.0.0 07/11/2018 0:59 : 7*/
package com.nouhoun.springboot.jwt.integration.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.).
 * This represents an account for a transfer setting.
 */

@Entity
@Table(name = "CIDADE")
public class Cidade extends ModelJPA {

	/** The econtabil id for the Cidade. */
	@Id
	@Column(name = "CIDADE_ID")
	private Integer id;

	/** The econtabil codigo for the Cidade. */
	private String codigo;

	/** The econtabil nome for the Cidade. */
	private String nome;

	/** The econtabil cdIBGE for the Cidade. */
	private String cdIBGE;

	/** The econtabil cep for the Cidade. */
	private String cep;

	/** The econtabil municipio for the Cidade. */
	private String municipio;

	/** The econtabil estado for the Cidade. */
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "estado_id", insertable = true, unique = false, nullable = false, updatable = true)
	private Estado estado;

	/**
	 * Default constructor.
	 */
	public Cidade() {
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
	 * /** Gets the codigo.
	 *
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Sets the codigo.
	 *
	 * @param id the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * /** Gets the nome.
	 *
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Sets the nome.
	 *
	 * @param id the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * /** Gets the cdIBGE.
	 *
	 * @return the cdIBGE
	 */
	public String getCdIBGE() {
		return cdIBGE;
	}

	/**
	 * Sets the cdibge.
	 *
	 * @param id the cdibge to set
	 */
	public void setCdIBGE(String cdibge) {
		this.cdIBGE = cdibge;
	}

	/**
	 * /** Gets the cep.
	 *
	 * @return the cep
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * Sets the cep.
	 *
	 * @param id the cep to set
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

	/**
	 * /** Gets the municipio.
	 *
	 * @return the municipio
	 */
	public String getMunicipio() {
		return municipio;
	}

	/**
	 * Sets the municipio.
	 *
	 * @param id the municipio to set
	 */
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	/**
	 * /** Gets the estado.
	 *
	 * @return the estado
	 */
	public Estado getEstado() {
		return estado;
	}

	/**
	 * Sets the estado.
	 *
	 * @param id the estado to set
	 */
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cidade [getId()=" + getId() + ", getCodigo()=" + getCodigo() + ", getNome()=" + getNome()
				+ ", getCdIBGE()=" + getCdIBGE() + ", getCep()=" + getCep() + ", getMunicipio()=" + getMunicipio()
				+ ", getEstado()=" + getEstado() + ", toString()=" + super.toString() + "]";
	}

}
