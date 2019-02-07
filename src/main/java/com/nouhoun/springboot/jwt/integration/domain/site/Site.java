/** create by system gera-java version 1.0.0 13/12/2018 19:38 : 26*/
package com.nouhoun.springboot.jwt.integration.domain.site;

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
import com.nouhoun.springboot.jwt.integration.domain.Empresa;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.).
 * This represents an account for a transfer setting.
 */

@Entity
@Table(name = "SITE")
public class Site {

	/** The econtabil id for the Site. */
	@Id
	@Column(name = "SITE_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "site_seq")
	@SequenceGenerator(name = "site_seq", sequenceName = "site_seq", allocationSize = 1)
	private Integer id;

	/** The econtabil nome for the Site. */
	@Column(name = "NOME")
	private String nome;

	/** The econtabil comoTrabalhamos for the Site. */
	@Column(name = "COMOTRABALHAMOS")
	private String comoTrabalhamos;

	/** The econtabil url for the Site. */
	@Column(name = "URL")
	private String url;

	/** The econtabil quemSomos for the Site. */
	@Column(name = "QUEMSOMOS")
	private String quemSomos;

	/** The econtabil missao for the Site. */
	@Column(name = "MISSAO")
	private String missao;

	/** The econtabil visao for the Site. */
	@Column(name = "VISAO")
	private String visao;

	/** The econtabil titulo for the Site. */
	@Column(name = "TITULO")
	private String titulo;

	/** The econtabil logo for the Site. */
	@Column(name = "LOGO")
	private String logo;

	/** The econtabil atorization for the Site. */
	@Column(name = "ATORIZATION")
	private Boolean atorization;

	/** The econtabil siteTypeEnum for the Site. */
	@Column(name = "SITETYPEENUM")
	private Integer siteTypeEnum;

	/** The econtabil empresa for the Site. */
	@Column(name = "EMPRESA_ID")
	private Integer empresaId;
	
	@Column(name = "PLANO_ID")
	private Integer planoId;
	
	@OneToOne(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
    @JoinColumn(name = "empresa_id",insertable = false, unique = false, nullable = false, updatable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Empresa empresa;

	/** The econtabil precoList for the Plano. */
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "servico_id", referencedColumnName = "servico_id", nullable = false, insertable = true, updatable = true)
//	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
//	private List<Servico> servicoList;

//	/** The econtabil precoList for the Plano. */
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "plano_id", referencedColumnName = "plano_id", nullable = false, insertable = false, updatable = false)
//	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
//	private List<Plano> planoList;

	/**
	 * Default constructor.
	 */
	public Site() {
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
	 * /** Gets the comoTrabalhamos.
	 *
	 * @return the comoTrabalhamos
	 */
	public String getComoTrabalhamos() {
		return comoTrabalhamos;
	}

	/**
	 * Sets the comotrabalhamos.
	 *
	 * @param id the comotrabalhamos to set
	 */
	public void setComoTrabalhamos(String comotrabalhamos) {
		this.comoTrabalhamos = comotrabalhamos;
	}

	/**
	 * /** Gets the url.
	 *
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Sets the url.
	 *
	 * @param id the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * /** Gets the quemSomos.
	 *
	 * @return the quemSomos
	 */
	public String getQuemSomos() {
		return quemSomos;
	}

	/**
	 * Sets the quemsomos.
	 *
	 * @param id the quemsomos to set
	 */
	public void setQuemSomos(String quemsomos) {
		this.quemSomos = quemsomos;
	}

	/**
	 * /** Gets the missao.
	 *
	 * @return the missao
	 */
	public String getMissao() {
		return missao;
	}

	/**
	 * Sets the missao.
	 *
	 * @param id the missao to set
	 */
	public void setMissao(String missao) {
		this.missao = missao;
	}

	/**
	 * /** Gets the visao.
	 *
	 * @return the visao
	 */
	public String getVisao() {
		return visao;
	}

	/**
	 * Sets the visao.
	 *
	 * @param id the visao to set
	 */
	public void setVisao(String visao) {
		this.visao = visao;
	}

	/**
	 * /** Gets the titulo.
	 *
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Sets the titulo.
	 *
	 * @param id the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * /** Gets the logo.
	 *
	 * @return the logo
	 */
	public String getLogo() {
		return logo;
	}

	/**
	 * Sets the logo.
	 *
	 * @param id the logo to set
	 */
	public void setLogo(String logo) {
		this.logo = logo;
	}

	/**
	 * /** Gets the atorization.
	 *
	 * @return the atorization
	 */
	public Boolean getAtorization() {
		return atorization;
	}

	/**
	 * Sets the atorization.
	 *
	 * @param id the atorization to set
	 */
	public void setAtorization(Boolean atorization) {
		this.atorization = atorization;
	}

	/**
	 * /** Gets the siteTypeEnum.
	 *
	 * @return the siteTypeEnum
	 */
	public Integer getSiteTypeEnum() {
		return siteTypeEnum;
	}

	/**
	 * Sets the sitetypeenum.
	 *
	 * @param id the sitetypeenum to set
	 */
	public void setSiteTypeEnum(Integer sitetypeenum) {
		this.siteTypeEnum = sitetypeenum;
	}

	/**
	 * /** Gets the empresa.
	 *
	 * @return the empresa
	 */
	public Empresa getEmpresa() {
		return empresa;
	}

	/**
	 * Sets the empresa.
	 *
	 * @param id the empresa to set
	 */
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Integer getEmpresaId() {
		return empresaId;
	}

	public void setEmpresaId(Integer empresaId) {
		this.empresaId = empresaId;
	}

//	public List<Plano> getPlanoList() {
//		return planoList;
//	}
//
//	public void setPlanoList(List<Plano> planoList) {
//		this.planoList = planoList;
//	}

	public Integer getPlanoId() {
		return planoId;
	}

	public void setPlanoId(Integer planoId) {
		this.planoId = planoId;
	}

}
