/** create by system gera-java version 1.0.0 17/12/2018 20:10 : 33*/
package com.nouhoun.springboot.jwt.integration.domain.entidade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.nouhoun.springboot.jwt.integration.domain.ModelJPA;
import com.nouhoun.springboot.jwt.integration.domain.DTO.entidade.EmpresaDTO;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.).
 * This represents an account for a transfer setting.
 */

@Entity
@Table(name = "ENTIDADE")
public class Entidade  extends ModelJPA {

	/** The econtabil id for the Entidade. */
	@Id
	@Column(name = "ENTIDADE_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "entidade_seq")
	@SequenceGenerator(name = "entidade_seq", sequenceName = "entidade_seq", allocationSize = 1)
	private Integer id;

	/** The econtabil nome for the Entidade. */
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "RAZAO")
	private String razao;

	@Column(name = "NUMFUNC")
	private Integer numFunc;
	
	@Column(name = "DTABERTURA")
	private Long dtAbertura;

	@Column(name = "REGIME_ID")
	private Integer regimeId;

	@Column(name = "ENTIDADEENUM")
	private Integer entidadeEnum;
	
	@Column(name = "PRIMEIROACESSO")
	private Integer primeiroAcesso;

	@Column(name = "CONFIGURACAO_ID")
	private Integer configuracaoId;
	
	@Column(name = "TIPO")
	private String tipo;
	
	@Column(name = "CPF_CNPJ")
	private String cpfCnpj;
	
	@Column(name = "TIPOPESSOA")
	private Integer tipoPessoa;

	/** The econtabil descricao for the Entidade. */
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "ENTIDADEENUMVALUE")
	private Integer entidadeEnumValue;

	/** The econtabil qntFilial for the Entidade. */
	@Column(name = "QNTFILIAL")
	private Integer qntFilial;

	/** The econtabil qntDeposito for the Entidade. */
	@Column(name = "QNTDEPOSITO")
	private Integer qntDeposito;

	/** The econtabil parceiroId for the Entidade. */
	@Column(name = "PARCEIROID")
	private Integer parceiroId;

	/** The econtabil contabilidadeId for the Entidade. */
	@Column(name = "CONTABILIDADEID")
	private Integer contabilidadeId;

	/** The econtabil permissaoTypeEnum for the Entidade. */
	@Column(name = "PERMISSAOTYPEENUM")
	private String permissaoTypeEnum;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "regime_id", insertable = false, unique = false, nullable = false, updatable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Regime regime;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "configuracao_id", insertable = false, unique = false, nullable = true, updatable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Configuracao configuracao;

	/** The econtabil precoList for the Plano. */
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "entidade_id", referencedColumnName = "entidade_id", nullable = true, insertable = false, updatable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private List<Endereco> enderecos;

//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "entidade_id", referencedColumnName = "entidade_id", nullable = true, insertable = false, updatable = false)
//	private List<Documento> documentos;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "entidade_id", referencedColumnName = "entidade_id", nullable = false, insertable = false, updatable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private List<Email> emails;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "entidade_id", referencedColumnName = "entidade_id", nullable = false, insertable = false, updatable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private List<Telefone> telefones;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "entidade_id", referencedColumnName = "entidade_id", nullable = false, insertable = false, updatable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private List<Socio> socios;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "entidade_id", referencedColumnName = "entidade_id", nullable = false, insertable = false, updatable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private List<Usuario> usuarios;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "CNAE_EMPRESA", joinColumns = {
			@JoinColumn(name = "ENTIDADE_ID", referencedColumnName = "ENTIDADE_ID") }, inverseJoinColumns = {
					@JoinColumn(name = "CNAE_ID", referencedColumnName = "CNAE_ID") })
	private List<Cnae> cnaes;

	/**
	 * Default constructor.
	 */
	public Entidade() {
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
	 * /** Gets the qntFilial.
	 *
	 * @return the qntFilial
	 */
	public Integer getQntFilial() {
		return qntFilial;
	}

	/**
	 * Sets the qntfilial.
	 *
	 * @param id the qntfilial to set
	 */
	public void setQntFilial(Integer qntfilial) {
		this.qntFilial = qntfilial;
	}

	/**
	 * /** Gets the qntDeposito.
	 *
	 * @return the qntDeposito
	 */
	public Integer getQntDeposito() {
		return qntDeposito;
	}

	/**
	 * Sets the qntdeposito.
	 *
	 * @param id the qntdeposito to set
	 */
	public void setQntDeposito(Integer qntdeposito) {
		this.qntDeposito = qntdeposito;
	}

	public Integer getNumFunc() {
		return numFunc;
	}

	public void setNumFunc(Integer numFunc) {
		this.numFunc = numFunc;
	}

	public Integer getRegimeId() {
		return regimeId;
	}

	public void setRegimeId(Integer regimeId) {
		this.regimeId = regimeId;
	}

	public Integer getEntidadeEnum() {
		return entidadeEnum;
	}

	public void setEntidadeEnum(Integer entidadeEnum) {
		this.entidadeEnum = entidadeEnum;
	}

	public Integer getConfiguracaoId() {
		return configuracaoId;
	}

	public void setConfiguracaoId(Integer configuracaoId) {
		this.configuracaoId = configuracaoId;
	}

	public Integer getParceiroId() {
		return parceiroId;
	}

	public void setParceiroId(Integer parceiroId) {
		this.parceiroId = parceiroId;
	}

	public Integer getContabilidadeId() {
		return contabilidadeId;
	}

	public void setContabilidadeId(Integer contabilidadeId) {
		this.contabilidadeId = contabilidadeId;
	}

	public String getPermissaoTypeEnum() {
		return permissaoTypeEnum;
	}

	public void setPermissaoTypeEnum(String permissaoTypeEnum) {
		this.permissaoTypeEnum = permissaoTypeEnum;
	}

	public Regime getRegime() {
		return regime;
	}

	public void setRegime(Regime regime) {
		this.regime = regime;
	}

	public Configuracao getConfiguracao() {
		return configuracao;
	}

	public void setConfiguracao(Configuracao configuracao) {
		this.configuracao = configuracao;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public List<Socio> getSocios() {
		return socios;
	}

	public void setSocios(List<Socio> socios) {
		this.socios = socios;
	}

	public List<Cnae> getCnaes() {
		return cnaes;
	}

	public void setCnaes(List<Cnae> cnaes) {
		this.cnaes = cnaes;
	}

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}

	public Long getDtAbertura() {
		return dtAbertura;
	}

	public void setDtAbertura(Long dtAbertura) {
		this.dtAbertura = dtAbertura;
	}

	public Integer getPrimeiroAcesso() {
		return primeiroAcesso;
	}

	public void setPrimeiroAcesso(Integer primeiroAcesso) {
		this.primeiroAcesso = primeiroAcesso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(Integer tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public Integer getEntidadeEnumValue() {
		return entidadeEnumValue;
	}

	public void setEntidadeEnumValue(Integer entidadeEnumValue) {
		this.entidadeEnumValue = entidadeEnumValue;
	}
	
	
	

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Entidade(EmpresaDTO empresa) {
		super();
		this.id = empresa.getId();
		this.nome = empresa.getNome();
		this.razao = empresa.getRazao();
		this.numFunc = empresa.getNumFunc();
		this.dtAbertura = empresa.getDtAbertura();
		this.regimeId = empresa.getRegimeId();
		this.entidadeEnum = empresa.getEntidadeEnumValue();
		this.primeiroAcesso = empresa.getPrimeiroAcesso();
		this.configuracaoId = empresa.getConfiguracaoId();
		this.tipo = empresa.getTipo();
		this.tipoPessoa = empresa.getTipoPessoa();
		this.descricao = empresa.getDescricao();
		this.entidadeEnumValue = empresa.getEntidadeEnumValue();
		this.qntFilial = empresa.getQntFilial();
		this.qntDeposito = empresa.getQntDeposito();
		this.parceiroId = empresa.getParceiroId();
		this.contabilidadeId = empresa.getContabilidadeId();
		this.permissaoTypeEnum = empresa.getPermissaoTypeEnum();		
		setModifyDateUTC(empresa.getModifyDateUTC());
		setModifyUser(empresa.getModifyUser());
		setCreateDateUTC(empresa.getCreateDateUTC());
		setCreateUser(empresa.getCreateUser());
		setParentId(empresa.getParentId());
		setProcessId(empresa.getProcessId());
		setTableEnumValue(empresa.getTableEnumValue());

	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	@Override
	public String toString() {
		return "Entidade [getId()=" + getId() + ", getNome()=" + getNome() + ", getDescricao()=" + getDescricao()
				+ ", getQntFilial()=" + getQntFilial() + ", getQntDeposito()=" + getQntDeposito() + ", getNumFunc()="
				+ getNumFunc() + ", getRegimeId()=" + getRegimeId() + ", getEntidadeEnum()=" + getEntidadeEnum()
				+ ", getConfiguracaoId()=" + getConfiguracaoId() + ", getParceiroId()=" + getParceiroId()
				+ ", getContabilidadeId()=" + getContabilidadeId() + ", getPermissaoTypeEnum()="
				+ getPermissaoTypeEnum() + ", getRegime()=" + getRegime() + ", getConfiguracao()=" + getConfiguracao()
				+ ", getEnderecos()=" + getEnderecos() + ", getCpfCnpj()=" + getCpfCnpj() + ", getEmails()="
				+ getEmails() + ", getTelefones()=" + getTelefones() + ", getSocios()=" + getSocios() + ", getCnaes()="
				+ getCnaes() + ", getRazao()=" + getRazao() + ", getDtAbertura()=" + getDtAbertura()
				+ ", getPrimeiroAcesso()=" + getPrimeiroAcesso() + ", getTipo()=" + getTipo() + ", getTipoPessoa()="
				+ getTipoPessoa() + ", getEntidadeEnumValue()=" + getEntidadeEnumValue() + ", getUsuarios()="
				+ getUsuarios() + ", toString()=" + super.toString() + "]";
	}
}
