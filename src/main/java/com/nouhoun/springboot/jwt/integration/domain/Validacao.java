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
@Table(name = "VALIDACAO")
public class Validacao 
{

    /** The econtabil id for the Validacao. */
    @Id
    @Column(name = "VALIDACAO_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "validacao_seq")
    @SequenceGenerator(name = "validacao_seq", sequenceName = "validacao_seq", allocationSize = 1)
    private Integer id;

    /** The econtabil error for the Validacao. */
    @Column(name = "ERROR")
    private String error;

    /** The econtabil validacaoJS for the Validacao. */
    @Column(name = "VALIDACAOJS")
    private String validacaoJS;

    /** The econtabil tipo for the Validacao. */
    @Column(name = "TIPO")
    private Integer tipo;



    /**
     * Default constructor.
     */
    public Validacao()
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
     * Gets the error.
     *
     * @return the error
     */
    public String getError()
    {
        return error;
    }

    /**
     * Sets the error.
     *
* @param id the error to set
 */
    public void setError(String error)
    {
        this.error = error;
    }

    /**
    /**
     * Gets the validacaoJS.
     *
     * @return the validacaoJS
     */
    public String getValidacaoJS()
    {
        return validacaoJS;
    }

    /**
     * Sets the validacaojs.
     *
* @param id the validacaojs to set
 */
    public void setValidacaoJS(String validacaojs)
    {
        this.validacaoJS = validacaojs;
    }

    /**
    /**
     * Gets the tipo.
     *
     * @return the tipo
     */
    public Integer getTipo()
    {
        return tipo;
    }

    /**
     * Sets the tipo.
     *
* @param id the tipo to set
 */
    public void setTipo(Integer tipo)
    {
        this.tipo = tipo;
    }

 }
