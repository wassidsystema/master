/** create by system gera-java version 1.0.0 17/12/2018 20:10 : 33*/
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
@Table(name = "USUARIO")
public class Usuario  extends ModelJPA {

	/** The econtabil id for the Entidade. */
	@Id
	@Column(name = "USUARIO_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_seq")
	@SequenceGenerator(name = "usuario_seq", sequenceName = "usuario_seq", allocationSize = 1)
	private Integer id;

	@Column(name = "CPF")
	private Integer cpf;
	
	@Column(name = "ENTIDADE_ID")
	private Integer entidadeId;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "LANGUAGE")
	private String language;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "SENHA")
	private String senha;

	

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

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
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
	
	

	public Integer getEntidadeId() {
		return entidadeId;
	}

	public void setEntidadeId(Integer entidadeId) {
		this.entidadeId = entidadeId;
	}

	@Override
	public String toString() {
		return "Usuario [getCpf()=" + getCpf() + ", getEmail()=" + getEmail() + ", getLanguage()=" + getLanguage()
				+ ", getNome()=" + getNome()  + ", getSenha()=" + getSenha()
				+ ", getId()=" + getId() + ", getEntidadeId()=" + getEntidadeId() + ", toString()=" + super.toString()
				+ "]";
	}


}
