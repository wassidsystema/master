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
@Table(name = "CONFIGALERTAS")
public class ConfigAlertas 
{

    /** The econtabil id for the ConfigAlertas. */
    @Id
    @Column(name = "CONFIGALERTAS_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "configAlertas_seq")
    @SequenceGenerator(name = "configAlertas_seq", sequenceName = "configAlertas_seq", allocationSize = 1)
    private Integer id;
    
    @Column(name = "CONFIGURACAO_ID")
    private Integer confId;

    /** The econtabil estoqMin for the ConfigAlertas. */
    @Column(name = "ESTOQMIN")
    private Integer estoqMin;

    /** The econtabil estoqMax for the ConfigAlertas. */
    @Column(name = "ESTOQMAX")
    private Integer estoqMax;

    /** The econtabil erroNFe for the ConfigAlertas. */
    @Column(name = "ERRONFE")
    private Integer erroNFe;

    /** The econtabil pdCompra for the ConfigAlertas. */
    @Column(name = "PDCOMPRA")
    private Integer pdCompra;

    /** The econtabil nvCliente for the ConfigAlertas. */
    @Column(name = "NVCLIENTE")
    private Integer nvCliente;

    /** The econtabil retCaixa for the ConfigAlertas. */
    @Column(name = "RETCAIXA")
    private Integer retCaixa;



    /**
     * Default constructor.
     */
    public ConfigAlertas()
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
     * Gets the estoqMin.
     *
     * @return the estoqMin
     */
    public Integer getEstoqMin()
    {
        return estoqMin;
    }

    /**
     * Sets the estoqmin.
     *
* @param id the estoqmin to set
 */
    public void setEstoqMin(Integer estoqmin)
    {
        this.estoqMin = estoqmin;
    }

    /**
    /**
     * Gets the estoqMax.
     *
     * @return the estoqMax
     */
    public Integer getEstoqMax()
    {
        return estoqMax;
    }

    /**
     * Sets the estoqmax.
     *
* @param id the estoqmax to set
 */
    public void setEstoqMax(Integer estoqmax)
    {
        this.estoqMax = estoqmax;
    }

    /**
    /**
     * Gets the erroNFe.
     *
     * @return the erroNFe
     */
    public Integer getErroNFe()
    {
        return erroNFe;
    }

    /**
     * Sets the erronfe.
     *
* @param id the erronfe to set
 */
    public void setErroNFe(Integer erronfe)
    {
        this.erroNFe = erronfe;
    }

    /**
    /**
     * Gets the pdCompra.
     *
     * @return the pdCompra
     */
    public Integer getPdCompra()
    {
        return pdCompra;
    }

    /**
     * Sets the pdcompra.
     *
* @param id the pdcompra to set
 */
    public void setPdCompra(Integer pdcompra)
    {
        this.pdCompra = pdcompra;
    }

    /**
    /**
     * Gets the nvCliente.
     *
     * @return the nvCliente
     */
    public Integer getNvCliente()
    {
        return nvCliente;
    }

    /**
     * Sets the nvcliente.
     *
* @param id the nvcliente to set
 */
    public void setNvCliente(Integer nvcliente)
    {
        this.nvCliente = nvcliente;
    }

    /**
    /**
     * Gets the retCaixa.
     *
     * @return the retCaixa
     */
    public Integer getRetCaixa()
    {
        return retCaixa;
    }

    /**
     * Sets the retcaixa.
     *
* @param id the retcaixa to set
 */
    public void setRetCaixa(Integer retcaixa)
    {
        this.retCaixa = retcaixa;
    }

 }
