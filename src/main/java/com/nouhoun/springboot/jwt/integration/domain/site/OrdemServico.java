/** create by system gera-java version 1.0.0 13/12/2018 19:38 : 26*/
package com.nouhoun.springboot.jwt.integration.domain.site;


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
@Table(name = "ORDEMSERVICO")
public class OrdemServico 
{

    /** The econtabil id for the OrdemServico. */
    @Id
    @Column(name = "ORDEMSERVICO_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ordemservico_seq")
    @SequenceGenerator(name = "ordemservico_seq", sequenceName = "ordemservico_seq", allocationSize = 1)
    private Integer id;

    /** The econtabil userId for the OrdemServico. */
    @Column(name = "USERID")
    private String userId;

    /** The econtabil nome for the OrdemServico. */
    @Column(name = "NOME")
    private String nome;

    /** The econtabil data for the OrdemServico. */
    @Column(name = "DATA")
    private Long data;

    /** The econtabil assunto for the OrdemServico. */
    @Column(name = "ASSUNTO")
    private String assunto;

    /** The econtabil statusValue for the OrdemServico. */
    @Column(name = "STATUSVALUE")
    private Integer statusValue;

    /** The econtabil ordemServicoItensList for the OrdemServico. */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="ordemServico_id", referencedColumnName="ordemServico_id", nullable = false, insertable = false, updatable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private List<OrdemServicoItens> ordemServicoItensList;



    /**
     * Default constructor.
     */
    public OrdemServico()
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

    /**
     * Sets the id.
     *
* @param id the id to set
 */
    public void setId(Integer id)
    {
        this.id = id;
    }

    /**
    /**
     * Gets the userId.
     *
     * @return the userId
     */
    public String getUserId()
    {
        return userId;
    }

    /**
     * Sets the userid.
     *
* @param id the userid to set
 */
    public void setUserId(String userid)
    {
        this.userId = userid;
    }

    /**
    /**
     * Gets the nome.
     *
     * @return the nome
     */
    public String getNome()
    {
        return nome;
    }

    /**
     * Sets the nome.
     *
* @param id the nome to set
 */
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    /**
    /**
     * Gets the data.
     *
     * @return the data
     */
    public Long getData()
    {
        return data;
    }

    /**
     * Sets the data.
     *
* @param id the data to set
 */
    public void setData(Long data)
    {
        this.data = data;
    }

    /**
    /**
     * Gets the assunto.
     *
     * @return the assunto
     */
    public String getAssunto()
    {
        return assunto;
    }

    /**
     * Sets the assunto.
     *
* @param id the assunto to set
 */
    public void setAssunto(String assunto)
    {
        this.assunto = assunto;
    }

    /**
    /**
     * Gets the statusValue.
     *
     * @return the statusValue
     */
    public Integer getStatusValue()
    {
        return statusValue;
    }

    /**
     * Sets the statusvalue.
     *
* @param id the statusvalue to set
 */
    public void setStatusValue(Integer statusvalue)
    {
        this.statusValue = statusvalue;
    }

    /**
    /**
     * Gets the ordemservicoitenslist.
     *
     * @return the ordemservicoitenslist
     */
    public List<OrdemServicoItens> getOrdemServicoItensList()
    {
        return ordemServicoItensList;
    }

    /**
     * Sets the ordemservicoitenslist.
     *
* @param id the ordemservicoitenslist to set
 */
public void setOrdemServicoItensList(List<OrdemServicoItens> ordemservicoitenslist)
{
        this.ordemServicoItensList = ordemservicoitenslist;
    }

 }
