/** create by system gera-java version 1.0.0 13/12/2018 19:38 : 26*/
package com.nouhoun.springboot.jwt.integration.domain.site;


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
@Table(name = "ORDEMSERVICOITENS")
public class OrdemServicoItens 
{

    /** The econtabil id for the OrdemServicoItens. */
    @Id
    @Column(name = "ORDEMSERVICOITENS_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ordemservicoitens_seq")
    @SequenceGenerator(name = "ordemservicoitens_seq", sequenceName = "ordemservicoitens_seq", allocationSize = 1)
    private Integer id;

    /** The econtabil data for the OrdemServicoItens. */
    @Column(name = "DATA")
    private Long data;

    /** The econtabil texto for the OrdemServicoItens. */
    @Column(name = "TEXTO")
    private String texto;



    /**
     * Default constructor.
     */
    public OrdemServicoItens()
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
