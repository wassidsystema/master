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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.nouhoun.springboot.jwt.integration.domain.site.Preco;

@Entity
@Table(name = "SERVICO")
public class Servico {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "servico_seq")
    @SequenceGenerator(name = "servico_seq", sequenceName = "servico_seq", allocationSize = 1)
    private Long id;

    @Column(name = "NOME", length = 50, unique = true)
    @NotNull
    @Size(min = 4, max = 50)
    private String nome;

    @Column(name = "DESCRICAO", length = 100)
    @Size(min = 0, max = 100)
    private String descricao;
    
    @Column(name = "PRECO_ID")
	private Integer precoId;

    /** The econtabil precoList for the Plano. */
	@OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name = "preco_id", referencedColumnName = "preco_id", nullable = false, insertable = false, updatable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private List<Preco> precosLista;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getPrecoId() {
		return precoId;
	}

	public void setPrecoId(Integer precoId) {
		this.precoId = precoId;
	}

	public List<Preco> getPrecosLista() {
		return precosLista;
	}

	public void setPrecosLista(List<Preco> precosLista) {
		this.precosLista = precosLista;
	}

}