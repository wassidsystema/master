/** create by system gera-java version 1.0.0 13/12/2018 19:38 : 26*/
package com.nouhoun.springboot.jwt.integration.domain.site;


import java.util.Date;
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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */

@Entity
@Table(name = "PLANO")
public class Plano 
{

    /** The econtabil id for the Plano. */
    @Id
    @Column(name = "PLANO_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "plano_seq")
    @SequenceGenerator(name = "plano_seq", sequenceName = "plano_seq", allocationSize = 1)
    private Integer id;

    /** The econtabil dataInicio for the Plano. */
    @Column(name = "DATAINICIO")
    private Date dataInicio;

    /** The econtabil dataFinal for the Plano. */
    @Column(name = "DATAFINAL")
    private Date dataFinal;

    /** The econtabil numeroContrato for the Plano. */
    @Column(name = "NUMEROCONTRATO")
    private Integer numeroContrato;

    /** The econtabil descricao for the Plano. */
    @Column(name = "DESCRICAO")
    private String descricao;

    /** The econtabil titulo for the Plano. */
    @Column(name = "TITULO")
    private String titulo;

    /** The econtabil cor for the Plano. */
    @Column(name = "COR")
    private String cor;
    
    /** The econtabil cor for the Plano. */
    @Column(name = "SERVICO_ID")
    private Integer servicoId;
    
    @Column(name = "PRECO_ID")
    private Integer precoId;
    
    @Column(name = "ENTIDADE_ID")
    private Integer entidadeId;
//
    /** The econtabil precoList for the Plano. */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="preco_id", referencedColumnName="preco_id", nullable = false, insertable = false, updatable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private List<Preco> precoList;
//
    /** The econtabil servicoList for the Plano. */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="servico_id", referencedColumnName="servico_id", nullable = false, insertable = false, updatable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private List<Servico> servicoList;



    /**
     * Default constructor.
     */
    public Plano()
    {
        super();
    }


    /**
    /**
     * Gets the id.
     *
     * @return the id
     */
    public Integer getId()
    {
        return id;
    }

    public List<Preco> getPrecoList() {
		return precoList;
	}


	public void setPrecoList(List<Preco> precoList) {
		this.precoList = precoList;
	}


	/**
     * Sets the id.
     *
* @param id the id to set
 */
    public void setId(Integer id)
    {
        this.id = id;
    }

   

    public Date getDataInicio() {
		return dataInicio;
	}


	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}


	public Date getDataFinal() {
		return dataFinal;
	}


	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}


	public Integer getServicoId() {
		return servicoId;
	}


	public void setServicoId(Integer servicoId) {
		this.servicoId = servicoId;
	}


	public Integer getPrecoId() {
		return precoId;
	}


	public void setPrecoId(Integer precoId) {
		this.precoId = precoId;
	}


	/**
    /**
     * Gets the numeroContrato.
     *
     * @return the numeroContrato
     */
    public Integer getNumeroContrato()
    {
        return numeroContrato;
    }

    /**
     * Sets the numerocontrato.
     *
* @param id the numerocontrato to set
 */
    public void setNumeroContrato(Integer numerocontrato)
    {
        this.numeroContrato = numerocontrato;
    }

    /**
    /**
     * Gets the descricao.
     *
     * @return the descricao
     */
    public String getDescricao()
    {
        return descricao;
    }

    /**
     * Sets the descricao.
     *
* @param id the descricao to set
 */
    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    /**
    /**
     * Gets the titulo.
     *
     * @return the titulo
     */
    public String getTitulo()
    {
        return titulo;
    }

    /**
     * Sets the titulo.
     *
* @param id the titulo to set
 */
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    /**
    /**
     * Gets the cor.
     *
     * @return the cor
     */
    public String getCor()
    {
        return cor;
    }

    /**
     * Sets the cor.
     *
* @param id the cor to set
 */
    public void setCor(String cor)
    {
        this.cor = cor;
    }



 }
