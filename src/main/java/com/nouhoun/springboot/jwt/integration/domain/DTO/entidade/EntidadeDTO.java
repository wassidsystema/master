package com.nouhoun.springboot.jwt.integration.domain.DTO.entidade;

import java.util.List;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */
@SuppressWarnings("serial")
public class EntidadeDTO extends ModelDTO
{

	private Integer id;

	private Integer numFunc;

	/** The type of an account. */
	private String nome;
	
	private String razao;
	
	private long dtAbertura;

	private RegimeDTO regime;
	
	private String permissaoTypeEnum;
	
	private Integer primeiroAcesso;
	
	private Integer regimeId;
	
	private Integer configuracaoId;
	
	private String descricao;
	
	private Integer parceiroId;
	
	private Integer contabilidadeId;
	
	private String tipo;
	
	private Integer tipoPessoa;

	private Integer entidadeId;

	private Integer entidadeEnumValue;

	private ConfiguracaoDTO configuracao;

	private List<EnderecoDTO> enderecos;

	private List<DocumentoDTO> documentos;

	private List<EmailDTO> emails;

	private List<TelefoneDTO> telefones;

	private List<CnaeDTO> cnaes;

	private List<UsuarioDTO> usuarios;

	private List<SocioDTO> socios;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumFunc() {
		return numFunc;
	}

	public void setNumFunc(Integer numFunc) {
		this.numFunc = numFunc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public RegimeDTO getRegime() {
		return regime;
	}

	public void setRegime(RegimeDTO regime) {
		this.regime = regime;
	}

	public Integer getEntidadeId() {
		return entidadeId;
	}

	public void setEntidadeId(Integer entidadeId) {
		this.entidadeId = entidadeId;
	}

	public long getDtAbertura() {
		return dtAbertura;
	}

	public void setDtAbertura(long dtAbertura) {
		this.dtAbertura = dtAbertura;
	}

	public String getPermissaoTypeEnum() {
		return permissaoTypeEnum;
	}

	public void setPermissaoTypeEnum(String permissaoTypeEnum) {
		this.permissaoTypeEnum = permissaoTypeEnum;
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

	public ConfiguracaoDTO getConfiguracao() {
		return configuracao;
	}

	public void setConfiguracao(ConfiguracaoDTO configuracao) {
		this.configuracao = configuracao;
	}

	public List<EnderecoDTO> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<EnderecoDTO> enderecos) {
		this.enderecos = enderecos;
	}

	public List<DocumentoDTO> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<DocumentoDTO> documentos) {
		this.documentos = documentos;
	}

	public List<EmailDTO> getEmails() {
		return emails;
	}

	public void setEmails(List<EmailDTO> emails) {
		this.emails = emails;
	}

	public List<TelefoneDTO> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<TelefoneDTO> telefones) {
		this.telefones = telefones;
	}

	public List<CnaeDTO> getCnaes() {
		return cnaes;
	}

	public void setCnaes(List<CnaeDTO> cnaes) {
		this.cnaes = cnaes;
	}

	public List<UsuarioDTO> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<UsuarioDTO> usuarios) {
		this.usuarios = usuarios;
	}

	public List<SocioDTO> getSocios() {
		return socios;
	}

	public void setSocios(List<SocioDTO> socios) {
		this.socios = socios;
	}

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}

	public Integer getRegimeId() {
		return regimeId;
	}

	public void setRegimeId(Integer regimeId) {
		this.regimeId = regimeId;
	}

	public Integer getConfiguracaoId() {
		return configuracaoId;
	}

	public void setConfiguracaoId(Integer configuracaoId) {
		this.configuracaoId = configuracaoId;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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

	@Override
	public String toString() {
		return "EntidadeDTO [getId()=" + getId() + ", getNumFunc()=" + getNumFunc() + ", getNome()=" + getNome()
				+ ", getRegime()=" + getRegime() + ", getEntidadeId()=" + getEntidadeId() + ", getDtAbertura()="
				+ getDtAbertura() + ", getPermissaoTypeEnum()=" + getPermissaoTypeEnum() + ", getPrimeiroAcesso()="
				+ getPrimeiroAcesso() + ", getTipo()=" + getTipo() + ", getTipoPessoa()=" + getTipoPessoa()
				+ ", getEntidadeEnumValue()=" + getEntidadeEnumValue() + ", getConfiguracao()=" + getConfiguracao()
				+ ", getEnderecos()=" + getEnderecos() + ", getDocumentos()=" + getDocumentos() + ", getEmails()="
				+ getEmails() + ", getTelefones()=" + getTelefones() + ", getCnaes()=" + getCnaes() + ", getUsuarios()="
				+ getUsuarios() + ", getSocios()=" + getSocios() + ", getRazao()=" + getRazao() + ", getRegimeId()="
				+ getRegimeId() + ", getConfiguracaoId()=" + getConfiguracaoId() + ", getDescricao()=" + getDescricao()
				+ ", getParceiroId()=" + getParceiroId() + ", getContabilidadeId()=" + getContabilidadeId()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}