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
@Table(name = "CNAE")
public class Cnae extends ModelJPA {

	/** The econtabil id for the Cnae. */
	@Id
	@Column(name = "CNAE_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cnae_seq")
	@SequenceGenerator(name = "cnae_seq", sequenceName = "cnae_seq", allocationSize = 1)
	private Integer id;

	/** The econtabil codigo for the Cnae. */
	@Column(name = "CODIGO")
	private String codigo;

	/** The econtabil cnae for the Cnae. */
	@Column(name = "CNAE")
	private String cnae;

	/** The econtabil descricao for the Cnae. */
	@Column(name = "DESCRICAO")
	private String descricao;

	/** The econtabil abreviado for the Cnae. */
	@Column(name = "ABREVIADO")
	private String abreviado;

	/**
	 * Default constructor.
	 */
	public Cnae() {
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
	 * /** Gets the cnae.
	 *
	 * @return the cnae
	 */
	public String getCnae() {
		return cnae;
	}

	/**
	 * Sets the cnae.
	 *
	 * @param id the cnae to set
	 */
	public void setCnae(String cnae) {
		this.cnae = cnae;
	}

	/**
	 * /** Gets the descricao.
	 *
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Sets the descricao.
	 *
	 * @param id the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * /** Gets the abreviado.
	 *
	 * @return the abreviado
	 */
	public String getAbreviado() {
		return abreviado;
	}

	/**
	 * Sets the abreviado.
	 *
	 * @param id the abreviado to set
	 */
	public void setAbreviado(String abreviado) {
		this.abreviado = abreviado;
	}

	@Override
	public String toString() {
		return "Cnae [getId()=" + getId() + ", getCodigo()=" + getCodigo() + ", getCnae()=" + getCnae()
				+ ", getDescricao()=" + getDescricao() + ", getAbreviado()=" + getAbreviado() + ", toString()="
				+ super.toString() + "]";
	}

}
