/** create by system gera-java version 1.0.0 07/11/2018 0:35 : 51*/
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

@Entity@Table(name = "ESTADO")
public class Estado extends ModelJPA
{

    /** The econtabil id for the Estado. */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estado_seq")
    @SequenceGenerator(name = "estado_seq", sequenceName = "estado_seq", allocationSize = 1)
    private Integer id;

    /** The econtabil nome for the Estado. */
    private String nome;

    /** The econtabil abreviacao for the Estado. */
    private String abreviacao;



    /**
     * Default constructor.
     */
    public Estado()
    {
        super();
    }


    /**
     * Gets the id.
     *
     * @return the id
     */
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
     * Gets the nome.
     *
     * @return the nome
     */
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
     * Gets the abreviacao.
     *
     * @return the abreviacao
     */
    /**
     * Gets the abreviacao.
     *
     * @return the abreviacao
     */
    public String getAbreviacao()
    {
        return abreviacao;
    }

    /**
     * Sets the abreviacao.
     *
* @param id the abreviacao to set
 */
    public void setAbreviacao(String abreviacao)
    {
        this.abreviacao = abreviacao;
    }


	@Override
	public String toString() {
		return "Estado [getId()=" + getId() + ", getNome()=" + getNome() + ", getAbreviacao()=" + getAbreviacao()
				+ ", toString()=" + super.toString() + "]";
	}

 }
