/** create by system gera-java version 1.0.0 13/12/2018 19:38 : 26*/
package com.nouhoun.springboot.jwt.integration.domain.site;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */

@Entity
@Table(name = "PLANOBYEMPRESA")
public class PlanoByEmpresa 
{

    /** The econtabil id for the PlanoByEmpresa. */
    @Id
    @Column(name = "PLANOBYEMPRESA_ID")
    private Integer id;

    /** The econtabil numContrato for the PlanoByEmpresa. */
    @Column(name = "NUMCONTRATO")
    private Integer numContrato;

    /** The econtabil dataInicio for the PlanoByEmpresa. */
    @Column(name = "DATAINICIO")
    private Long dataInicio;

    /** The econtabil dataFim for the PlanoByEmpresa. */
    @Column(name = "DATAFIM")
    private Long dataFim;

    /** The econtabil valor for the PlanoByEmpresa. */
    @Column(name = "VALOR")
    private Double valor;

    /** The econtabil planoId for the PlanoByEmpresa. */
    @Column(name = "PLANOID")
    private Integer planoId;



    /**
     * Default constructor.
     */
    public PlanoByEmpresa()
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
     * Gets the numContrato.
     *
     * @return the numContrato
     */
    public Integer getNumContrato()
    {
        return numContrato;
    }

    /**
     * Sets the numcontrato.
     *
* @param id the numcontrato to set
 */
    public void setNumContrato(Integer numcontrato)
    {
        this.numContrato = numcontrato;
    }

    /**
    /**
     * Gets the dataInicio.
     *
     * @return the dataInicio
     */
    public Long getDataInicio()
    {
        return dataInicio;
    }

    /**
     * Sets the datainicio.
     *
* @param id the datainicio to set
 */
    public void setDataInicio(Long datainicio)
    {
        this.dataInicio = datainicio;
    }

    /**
    /**
     * Gets the dataFim.
     *
     * @return the dataFim
     */
    public Long getDataFim()
    {
        return dataFim;
    }

    /**
     * Sets the datafim.
     *
* @param id the datafim to set
 */
    public void setDataFim(Long datafim)
    {
        this.dataFim = datafim;
    }

    /**
    /**
     * Gets the valor.
     *
     * @return the valor
     */
    public Double getValor()
    {
        return valor;
    }

    /**
     * Sets the valor.
     *
* @param id the valor to set
 */
    public void setValor(Double valor)
    {
        this.valor = valor;
    }

    /**
    /**
     * Gets the planoId.
     *
     * @return the planoId
     */
    public Integer getPlanoId()
    {
        return planoId;
    }

    /**
     * Sets the planoid.
     *
* @param id the planoid to set
 */
    public void setPlanoId(Integer planoid)
    {
        this.planoId = planoid;
    }

 }
