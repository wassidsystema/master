/** create by system gera-java version 1.0.0 20/11/2018 21:33 : 59*/
package com.nouhoun.springboot.jwt.integration.domain;


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
@Table(name = "DOMINIO")
public class Dominio 
{

    /** The econtabil id for the Dominio. */
    @Id
    @Column(name = "DOMINIO_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dominio_seq")
    @SequenceGenerator(name = "dominio_seq", sequenceName = "dominio_seq", allocationSize = 1)
    private Integer id;

    /** The econtabil nome for the Dominio. */
    @Column(name = "NOME")
    private String nome;

    /** The econtabil valor for the Dominio. */
    @Column(name = "VALOR")
    private String valor;
    
    @Column(name = "FIELD_ID")
    private String field_id;



    /**
     * Default constructor.
     */
    public Dominio()
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
     * Gets the valor.
     *
     * @return the valor
     */
    public String getValor()
    {
        return valor;
    }

    /**
     * Sets the valor.
     *
* @param id the valor to set
 */
    public void setValor(String valor)
    {
        this.valor = valor;
    }

 }
