/** create by system gera-java version 1.0.0 17/12/2018 20:24 : 13*/
package com.nouhoun.springboot.jwt.integration.domain.entidade;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.).
 * This represents an account for a transfer setting.
 */

@Entity
@Table(name = "CONFIGFISCAL")
public class ConfigFiscal {

	/** The econtabil id for the ConfigFiscal. */
	@Id
	@Column(name = "CONFIGFISCAL_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "configFiscal_seq")
	@SequenceGenerator(name = "configFiscal_seq", sequenceName = "configFiscal_seq", allocationSize = 1)
	private Integer id;

	@Column(name = "CONFIGURACAO_ID")
	private Integer confId;

	/** The econtabil princAtividade for the ConfigFiscal. */
	@Column(name = "PRINCATIVIDADE")
	private Integer princAtividade;

	/** The econtabil regime for the ConfigFiscal. */
	@Column(name = "REGIME_ID")
	private Integer regimeId;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "REGIME_ID", insertable = false, unique = false, nullable = false, updatable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Regime regime;

	/** The econtabil aliqSimples for the ConfigFiscal. */
	@Column(name = "ALIQSIMPLES")
	private Double aliqSimples;

	/** The econtabil aliqICMS for the ConfigFiscal. */
	@Column(name = "ALIQICMS")
	private Double aliqICMS;

	/** The econtabil aliqPIS for the ConfigFiscal. */
	@Column(name = "ALIQPIS")
	private Double aliqPIS;

	/** The econtabil aliqCONFINS for the ConfigFiscal. */
	@Column(name = "ALIQCONFINS")
	private Double aliqCONFINS;

	/** The econtabil aliqIRPJ for the ConfigFiscal. */
	@Column(name = "ALIQIRPJ")
	private Double aliqIRPJ;

	/** The econtabil aliqCLSS for the ConfigFiscal. */
	@Column(name = "ALIQCLSS")
	private Double aliqCLSS;

	/**
	 * Default constructor.
	 */
	public ConfigFiscal() {
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
	 * /** Gets the princAtividade.
	 *
	 * @return the princAtividade
	 */
	public Integer getPrincAtividade() {
		return princAtividade;
	}

	/**
	 * Sets the princatividade.
	 *
	 * @param id the princatividade to set
	 */
	public void setPrincAtividade(Integer princatividade) {
		this.princAtividade = princatividade;
	}

	/**
	 * /** Gets the regime.
	 *
	 * @return the regime
	 */
	public Regime getRegime() {
		return regime;
	}

	/**
	 * Sets the regime.
	 *
	 * @param id the regime to set
	 */
	public void setRegime(Regime regime) {
		this.regime = regime;
	}

	/**
	 * /** Gets the aliqSimples.
	 *
	 * @return the aliqSimples
	 */
	public Double getAliqSimples() {
		return aliqSimples;
	}

	/**
	 * Sets the aliqsimples.
	 *
	 * @param id the aliqsimples to set
	 */
	public void setAliqSimples(Double aliqsimples) {
		this.aliqSimples = aliqsimples;
	}

	/**
	 * /** Gets the aliqICMS.
	 *
	 * @return the aliqICMS
	 */
	public Double getAliqICMS() {
		return aliqICMS;
	}

	/**
	 * Sets the aliqicms.
	 *
	 * @param id the aliqicms to set
	 */
	public void setAliqICMS(Double aliqicms) {
		this.aliqICMS = aliqicms;
	}

	/**
	 * /** Gets the aliqPIS.
	 *
	 * @return the aliqPIS
	 */
	public Double getAliqPIS() {
		return aliqPIS;
	}

	/**
	 * Sets the aliqpis.
	 *
	 * @param id the aliqpis to set
	 */
	public void setAliqPIS(Double aliqpis) {
		this.aliqPIS = aliqpis;
	}

	/**
	 * /** Gets the aliqCONFINS.
	 *
	 * @return the aliqCONFINS
	 */
	public Double getAliqCONFINS() {
		return aliqCONFINS;
	}

	/**
	 * Sets the aliqconfins.
	 *
	 * @param id the aliqconfins to set
	 */
	public void setAliqCONFINS(Double aliqconfins) {
		this.aliqCONFINS = aliqconfins;
	}

	/**
	 * /** Gets the aliqIRPJ.
	 *
	 * @return the aliqIRPJ
	 */
	public Double getAliqIRPJ() {
		return aliqIRPJ;
	}

	/**
	 * Sets the aliqirpj.
	 *
	 * @param id the aliqirpj to set
	 */
	public void setAliqIRPJ(Double aliqirpj) {
		this.aliqIRPJ = aliqirpj;
	}

	/**
	 * /** Gets the aliqCLSS.
	 *
	 * @return the aliqCLSS
	 */
	public Double getAliqCLSS() {
		return aliqCLSS;
	}

	/**
	 * Sets the aliqclss.
	 *
	 * @param id the aliqclss to set
	 */
	public void setAliqCLSS(Double aliqclss) {
		this.aliqCLSS = aliqclss;
	}

	public Integer getConfId() {
		return confId;
	}

	public void setConfId(Integer confId) {
		this.confId = confId;
	}

	public Integer getRegimeId() {
		return regimeId;
	}

	public void setRegimeId(Integer regimeId) {
		this.regimeId = regimeId;
	}

}
