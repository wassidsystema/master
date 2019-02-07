/** create by system gera-java version 1.0.0 17/12/2018 20:24 : 13*/
package com.nouhoun.springboot.jwt.integration.domain.entidade;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */

@Entity
@Table(name = "CLASSIFICACAO")
public class Classificacao 
{

    /** The econtabil id for the Classificacao. */
    @Id
    @Column(name = "CLASSIFICACAO_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "classificacao_seq")
    @SequenceGenerator(name = "classificacao_seq", sequenceName = "classificacao_seq", allocationSize = 1)
    private Integer id;

    /** The econtabil descricao for the Classificacao. */
    @Column(name = "DESCRICAO")
    private String descricao;

    /** The econtabil codigo for the Classificacao. */
    @Column(name = "CODIGO")
    private String codigo;



    /**
     * Default constructor.
     */
    public Classificacao()
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
     * Gets the codigo.
     *
     * @return the codigo
     */
    public String getCodigo()
    {
        return codigo;
    }

    /**
     * Sets the codigo.
     *
* @param id the codigo to set
 */
    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }

 }
