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
@Table(name = "CONFIGOS")
public class ConfigOS 
{

    /** The econtabil id for the ConfigOS. */
    @Id
    @Column(name = "CONFIGOS_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "configOS_seq")
    @SequenceGenerator(name = "configOS_seq", sequenceName = "configOS_seq", allocationSize = 1)
    private Integer id;
    
    @Column(name = "CONFIGURACAO_ID")
    private Integer confId;

    /** The econtabil impr2Via for the ConfigOS. */
    @Column(name = "IMPR2VIA")
    private Integer impr2Via;

    /** The econtabil imprAss for the ConfigOS. */
    @Column(name = "IMPRASS")
    private Integer imprAss;

    /** The econtabil imprResumo for the ConfigOS. */
    @Column(name = "IMPRRESUMO")
    private Integer imprResumo;

    /** The econtabil imprDetHorz for the ConfigOS. */
    @Column(name = "IMPRDETHORZ")
    private Integer imprDetHorz;

    /** The econtabil diasGarantia for the ConfigOS. */
    @Column(name = "DIASGARANTIA")
    private Integer diasGarantia;

    /** The econtabil observ for the ConfigOS. */
    @Column(name = "OBSERV")
    private String observ;



    /**
     * Default constructor.
     */
    public ConfigOS()
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
     * Gets the impr2Via.
     *
     * @return the impr2Via
     */
    public Integer getImpr2Via()
    {
        return impr2Via;
    }

    /**
     * Sets the impr2via.
     *
* @param id the impr2via to set
 */
    public void setImpr2Via(Integer impr2via)
    {
        this.impr2Via = impr2via;
    }

    /**
    /**
     * Gets the imprAss.
     *
     * @return the imprAss
     */
    public Integer getImprAss()
    {
        return imprAss;
    }

    /**
     * Sets the imprass.
     *
* @param id the imprass to set
 */
    public void setImprAss(Integer imprass)
    {
        this.imprAss = imprass;
    }

    /**
    /**
     * Gets the imprResumo.
     *
     * @return the imprResumo
     */
    public Integer getImprResumo()
    {
        return imprResumo;
    }

    /**
     * Sets the imprresumo.
     *
* @param id the imprresumo to set
 */
    public void setImprResumo(Integer imprresumo)
    {
        this.imprResumo = imprresumo;
    }

    /**
    /**
     * Gets the imprDetHorz.
     *
     * @return the imprDetHorz
     */
    public Integer getImprDetHorz()
    {
        return imprDetHorz;
    }

    /**
     * Sets the imprdethorz.
     *
* @param id the imprdethorz to set
 */
    public void setImprDetHorz(Integer imprdethorz)
    {
        this.imprDetHorz = imprdethorz;
    }

    /**
    /**
     * Gets the diasGarantia.
     *
     * @return the diasGarantia
     */
    public Integer getDiasGarantia()
    {
        return diasGarantia;
    }

    /**
     * Sets the diasgarantia.
     *
* @param id the diasgarantia to set
 */
    public void setDiasGarantia(Integer diasgarantia)
    {
        this.diasGarantia = diasgarantia;
    }

    /**
    /**
     * Gets the observ.
     *
     * @return the observ
     */
    public String getObserv()
    {
        return observ;
    }

    /**
     * Sets the observ.
     *
* @param id the observ to set
 */
    public void setObserv(String observ)
    {
        this.observ = observ;
    }

 }
