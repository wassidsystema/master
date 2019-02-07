/** create by system gera-java version 1.0.0 17/12/2018 20:24 : 13*/
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
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */

@Entity
@Table(name = "TELEFONE")
public class Telefone extends ModelJPA
{

    /** The econtabil id for the Telefone. */
    @Id
    @Column(name = "TELEFONE_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "telefone_seq")
    @SequenceGenerator(name = "telefone_seq", sequenceName = "telefone_seq", allocationSize = 1)
    private Integer id;

    /** The econtabil typeValue for the Telefone. */
    @Column(name = "TYPEVALUE")
    private Integer typeValue;
    
    @Column(name = "ENTIDADE_ID")
    private Integer entidadeId;

    /** The econtabil ddd for the Telefone. */
    @Column(name = "DDD")
    private String ddd;

    /** The econtabil numero for the Telefone. */
    @Column(name = "NUMERO")
    private String numero;

    /** The econtabil telefoneTypeEnumValue for the Telefone. */
    @Column(name = "TELEFONETYPEENUMVALUE")
    private Integer telefoneTypeEnumValue;



    /**
     * Default constructor.
     */
    public Telefone()
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
     * Gets the typeValue.
     *
     * @return the typeValue
     */
    public Integer getTypeValue()
    {
        return typeValue;
    }

    /**
     * Sets the typevalue.
     *
* @param id the typevalue to set
 */
    public void setTypeValue(Integer typevalue)
    {
        this.typeValue = typevalue;
    }

    /**
    /**
     * Gets the ddd.
     *
     * @return the ddd
     */
    public String getDdd()
    {
        return ddd;
    }

    /**
     * Sets the ddd.
     *
* @param id the ddd to set
 */
    public void setDdd(String ddd)
    {
        this.ddd = ddd;
    }

    /**
    /**
     * Gets the numero.
     *
     * @return the numero
     */
    public String getNumero()
    {
        return numero;
    }

    /**
     * Sets the numero.
     *
* @param id the numero to set
 */
    public void setNumero(String numero)
    {
        this.numero = numero;
    }

    /**
    /**
     * Gets the telefoneTypeEnumValue.
     *
     * @return the telefoneTypeEnumValue
     */
    public Integer getTelefoneTypeEnumValue()
    {
        return telefoneTypeEnumValue;
    }

    /**
     * Sets the telefonetypeenumvalue.
     *
* @param id the telefonetypeenumvalue to set
 */
    public void setTelefoneTypeEnumValue(Integer telefonetypeenumvalue)
    {
        this.telefoneTypeEnumValue = telefonetypeenumvalue;
    }


	public Integer getEntidadeId() {
		return entidadeId;
	}


	public void setEntidadeId(Integer entidadeId) {
		this.entidadeId = entidadeId;
	}


	@Override
	public String toString() {
		return "Telefone [getId()=" + getId() + ", getTypeValue()=" + getTypeValue() + ", getDdd()=" + getDdd()
				+ ", getNumero()=" + getNumero() + ", getTelefoneTypeEnumValue()=" + getTelefoneTypeEnumValue()
				+ ", getEntidadeId()=" + getEntidadeId() + ", toString()=" + super.toString() + "]";
	}

 }
