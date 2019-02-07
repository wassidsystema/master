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
@Table(name = "CONFIGVENDAS")
public class ConfigVendas 
{

    /** The econtabil id for the ConfigVendas. */
    @Id
    @Column(name = "CONFIGVENDAS_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "configVendas_seq")
    @SequenceGenerator(name = "configVendas_seq", sequenceName = "configVendas_seq", allocationSize = 1)
    private Integer id;
    
    @Column(name = "CONFIGURACAO_ID")
    private Integer confId;

    /** The econtabil descontoMaxVenda for the ConfigVendas. */
    @Column(name = "DESCONTOMAXVENDA")
    private Double descontoMaxVenda;

    /** The econtabil observacao for the ConfigVendas. */
    @Column(name = "OBSERVACAO")
    private String observacao;

    /** The econtabil imprSegVia for the ConfigVendas. */
    @Column(name = "IMPRSEGVIA")
    private Integer imprSegVia;

    /** The econtabil imprAssinatura for the ConfigVendas. */
    @Column(name = "IMPRASSINATURA")
    private Integer imprAssinatura;

    /** The econtabil imprResumoFinanc for the ConfigVendas. */
    @Column(name = "IMPRRESUMOFINANC")
    private Integer imprResumoFinanc;

    /** The econtabil atuaPrecoClonar for the ConfigVendas. */
    @Column(name = "ATUAPRECOCLONAR")
    private Integer atuaPrecoClonar;

    /** The econtabil imprColUnidade for the ConfigVendas. */
    @Column(name = "IMPRCOLUNIDADE")
    private Integer imprColUnidade;

    /** The econtabil bloquearvendProdSemEstoq for the ConfigVendas. */
    @Column(name = "BLOQUEARVENDPRODSEMESTOQ")
    private Integer bloquearvendProdSemEstoq;

    /** The econtabil addDespCalcImposto for the ConfigVendas. */
    @Column(name = "ADDDESPCALCIMPOSTO")
    private Integer addDespCalcImposto;

    /** The econtabil retSubstTribICMS for the ConfigVendas. */
    @Column(name = "RETSUBSTTRIBICMS")
    private Integer retSubstTribICMS;



    /**
     * Default constructor.
     */
    public ConfigVendas()
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
     * Gets the descontoMaxVenda.
     *
     * @return the descontoMaxVenda
     */
    public Double getDescontoMaxVenda()
    {
        return descontoMaxVenda;
    }

    /**
     * Sets the descontomaxvenda.
     *
* @param id the descontomaxvenda to set
 */
    public void setDescontoMaxVenda(Double descontomaxvenda)
    {
        this.descontoMaxVenda = descontomaxvenda;
    }

    /**
    /**
     * Gets the observacao.
     *
     * @return the observacao
     */
    public String getObservacao()
    {
        return observacao;
    }

    /**
     * Sets the observacao.
     *
* @param id the observacao to set
 */
    public void setObservacao(String observacao)
    {
        this.observacao = observacao;
    }

    /**
    /**
     * Gets the imprSegVia.
     *
     * @return the imprSegVia
     */
    public Integer getImprSegVia()
    {
        return imprSegVia;
    }

    /**
     * Sets the imprsegvia.
     *
* @param id the imprsegvia to set
 */
    public void setImprSegVia(Integer imprsegvia)
    {
        this.imprSegVia = imprsegvia;
    }

    /**
    /**
     * Gets the imprAssinatura.
     *
     * @return the imprAssinatura
     */
    public Integer getImprAssinatura()
    {
        return imprAssinatura;
    }

    /**
     * Sets the imprassinatura.
     *
* @param id the imprassinatura to set
 */
    public void setImprAssinatura(Integer imprassinatura)
    {
        this.imprAssinatura = imprassinatura;
    }

    /**
    /**
     * Gets the imprResumoFinanc.
     *
     * @return the imprResumoFinanc
     */
    public Integer getImprResumoFinanc()
    {
        return imprResumoFinanc;
    }

    /**
     * Sets the imprresumofinanc.
     *
* @param id the imprresumofinanc to set
 */
    public void setImprResumoFinanc(Integer imprresumofinanc)
    {
        this.imprResumoFinanc = imprresumofinanc;
    }

    /**
    /**
     * Gets the atuaPrecoClonar.
     *
     * @return the atuaPrecoClonar
     */
    public Integer getAtuaPrecoClonar()
    {
        return atuaPrecoClonar;
    }

    /**
     * Sets the atuaprecoclonar.
     *
* @param id the atuaprecoclonar to set
 */
    public void setAtuaPrecoClonar(Integer atuaprecoclonar)
    {
        this.atuaPrecoClonar = atuaprecoclonar;
    }

    /**
    /**
     * Gets the imprColUnidade.
     *
     * @return the imprColUnidade
     */
    public Integer getImprColUnidade()
    {
        return imprColUnidade;
    }

    /**
     * Sets the imprcolunidade.
     *
* @param id the imprcolunidade to set
 */
    public void setImprColUnidade(Integer imprcolunidade)
    {
        this.imprColUnidade = imprcolunidade;
    }

    /**
    /**
     * Gets the bloquearvendProdSemEstoq.
     *
     * @return the bloquearvendProdSemEstoq
     */
    public Integer getBloquearvendProdSemEstoq()
    {
        return bloquearvendProdSemEstoq;
    }

    /**
     * Sets the bloquearvendprodsemestoq.
     *
* @param id the bloquearvendprodsemestoq to set
 */
    public void setBloquearvendProdSemEstoq(Integer bloquearvendprodsemestoq)
    {
        this.bloquearvendProdSemEstoq = bloquearvendprodsemestoq;
    }

    /**
    /**
     * Gets the addDespCalcImposto.
     *
     * @return the addDespCalcImposto
     */
    public Integer getAddDespCalcImposto()
    {
        return addDespCalcImposto;
    }

    /**
     * Sets the adddespcalcimposto.
     *
* @param id the adddespcalcimposto to set
 */
    public void setAddDespCalcImposto(Integer adddespcalcimposto)
    {
        this.addDespCalcImposto = adddespcalcimposto;
    }

    /**
    /**
     * Gets the retSubstTribICMS.
     *
     * @return the retSubstTribICMS
     */
    public Integer getRetSubstTribICMS()
    {
        return retSubstTribICMS;
    }

    /**
     * Sets the retsubsttribicms.
     *
* @param id the retsubsttribicms to set
 */
    public void setRetSubstTribICMS(Integer retsubsttribicms)
    {
        this.retSubstTribICMS = retsubsttribicms;
    }

 }
