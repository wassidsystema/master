package com.nouhoun.springboot.jwt.integration.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Endereco;

@Entity
@Table(name = "empresa")
public class Empresa{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "empresa_id")
	private int id;
	@Column(name = "nome")
	@NotEmpty(message = "*Please provide an email")
	@Length(min = 5, message = "*Your password must have at least 5 characters")
	private String nome;
	@Column(name = "nomeResponsavel")
	@Length(min = 5, message = "*Your password must have at least 5 characters")
	@NotEmpty(message = "*Please provide your password")
	private String nomeResponsavel;
	@Column(name = "email")
	@Email(message = "*Please provide a valid Email")
	private String email;
	@Column(name = "telefone")
	@NotEmpty(message = "*Please provide your last name")
	private String telefone;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="empresa_id", referencedColumnName="empresa_id", nullable = false, insertable = false, updatable = false)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private List<Avaliacao> avaliacao;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="empresa_id", referencedColumnName="empresa_id", nullable = false, insertable = false, updatable = false)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private List<AvaliacaoOptions> avaliacaoOptions;

	@OneToOne(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
    @JoinColumn(name = "endereco_id", unique = false, nullable = false, updatable = false)
    private Endereco endereco;

    @Column(name = "endereco_id", insertable = false, updatable = false, nullable = false)
    private Integer enderecoId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Integer getEnderecoId() {
		return enderecoId;
	}

	public void setEnderecoId(Integer enderecoId) {
		this.enderecoId = enderecoId;
	}


	public Empresa(int id, String nome, String nomeResponsavel, String email, String telefone, Endereco endereco,
			Integer enderecoId, List<Notificacoes> notificacoes) {
		super();
		this.id = id;
		this.nome = nome;
		this.nomeResponsavel = nomeResponsavel;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.enderecoId = enderecoId;
	}

	public Empresa() {
		super();
	}

	public List<Avaliacao> getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(List<Avaliacao> avaliacao) {
		this.avaliacao = avaliacao;
	}

	public List<AvaliacaoOptions> getAvaliacaoOptions() {
		return avaliacaoOptions;
	}

	public void setAvaliacaoOptions(List<AvaliacaoOptions> avaliacaoOptions) {
		this.avaliacaoOptions = avaliacaoOptions;
	}

}
