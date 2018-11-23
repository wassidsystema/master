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
@Table(name = "HELP")
public class Help 
{

    /** The econtabil id for the Help. */
    @Id
    @Column(name = "HELP_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "help_seq")
    @SequenceGenerator(name = "help_seq", sequenceName = "help_seq", allocationSize = 1)
    private Integer id;

    /** The econtabil titulo for the Help. */
    @Column(name = "TITULO")
    private String titulo;

    /** The econtabil status for the Help. */
    @Column(name = "STATUS")
    private Integer status;

    /** The econtabil texto for the Help. */
    @Column(name = "TEXTO")
    private String texto;



    /**
     * Default constructor.
     */
    public Help()
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
     * Gets the status.
     *
     * @return the status
     */
    public Integer getStatus()
    {
        return status;
    }

    /**
     * Sets the status.
     *
* @param id the status to set
 */
    public void setStatus(Integer status)
    {
        this.status = status;
    }

    /**
    /**
     * Gets the texto.
     *
     * @return the texto
     */
    public String getTexto()
    {
        return texto;
    }

    /**
     * Sets the texto.
     *
* @param id the texto to set
 */
    public void setTexto(String texto)
    {
        this.texto = texto;
    }

 }
