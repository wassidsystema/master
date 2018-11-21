/** create by system gera-java version 1.0.0 20/11/2018 21:33 : 59*/
package com.nouhoun.springboot.jwt.integration.domain.dicionario;


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
@Table(name = "ENTIDADE")
public class Entidade 
{

    /** The econtabil id for the Entidade. */
    @Id
    @Column(name = "ENTIDADE_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "entidade_seq")
    @SequenceGenerator(name = "entidade_seq", sequenceName = "entidade_seq", allocationSize = 1)
    private Integer id;

    /** The econtabil nome for the Entidade. */
    @Column(name = "NOME")
    private String nome;

    /** The econtabil descricao for the Entidade. */
    @Column(name = "DESCRICAO")
    private String descricao;

    /** The econtabil fields for the Entidade. */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="entidade_id", referencedColumnName="entidade_id", nullable = false, insertable = false, updatable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private List<Field> fields;



    /**
     * Default constructor.
     */
    public Entidade()
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
     * Gets the fields.
     *
     * @return the fields
     */
    public List<Field> getFields()
    {
        return fields;
    }

    /**
     * Sets the fields.
     *
* @param id the fields to set
 */
public void setFields(List<Field> fields)
{
        this.fields = fields;
    }

 }
