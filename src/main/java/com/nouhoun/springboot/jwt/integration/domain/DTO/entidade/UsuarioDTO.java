package com.nouhoun.springboot.jwt.integration.domain.DTO.entidade;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */
@SuppressWarnings("serial")
public class UsuarioDTO extends ModelDTO
{

	private Integer id;
	private DocumentoDTO cpf;
	private String email;
	private String language;
	private String nome;
	private Integer parentId;
	private String senha;
	
	

	public DocumentoDTO getCpf() {
		return cpf;
	}

	public void setCpf(DocumentoDTO cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "UsuarioDTO [getCpf()=" + getCpf() + ", getEmail()=" + getEmail() + ", getLanguage()=" + getLanguage()
				+ ", getNome()=" + getNome() + ", getParentId()=" + getParentId() + ", getSenha()=" + getSenha()
				+ ", getId()=" + getId() + ", toString()=" + super.toString() + "]";
	}

}