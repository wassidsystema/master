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
@Table(name = "CFOP")
public class Cfop 
{

    /** The econtabil id for the Cfop. */
    @Id
    @Column(name = "CFOP_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cfop_seq")
    @SequenceGenerator(name = "cfop_seq", sequenceName = "cfop_seq", allocationSize = 1)
    private Integer id;

    /** The econtabil cfop for the Cfop. */
    @Column(name = "CFOP")
    private String cfop;

    /** The econtabil natureza for the Cfop. */
    @Column(name = "NATUREZA")
    private String natureza;

    /** The econtabil simplificado for the Cfop. */
    @Column(name = "SIMPLIFICADO")
    private String simplificado;

    /** The econtabil cfopTypeEnum for the Cfop. */
    @Column(name = "CFOPTYPEENUM")
    private Integer cfopTypeEnum;

    /** The econtabil icms for the Cfop. */
    @Column(name = "ICMS")
    private Double icms;

    /** The econtabil icmsReduzido for the Cfop. */
    @Column(name = "ICMSREDUZIDO")
    private Double icmsReduzido;

    /** The econtabil margemAgregadaST for the Cfop. */
    @Column(name = "MARGEMAGREGADAST")
    private Double margemAgregadaST;

    /** The econtabil cstPrincipal for the Cfop. */
    @Column(name = "CSTPRINCIPAL")
    private Double cstPrincipal;

    /** The econtabil classFiscal for the Cfop. */
    @Column(name = "CLASSFISCAL")
    private Double classFiscal;

    /** The econtabil observacao for the Cfop. */
    @Column(name = "OBSERVACAO")
    private String observacao;



    /**
     * Default constructor.
     */
    public Cfop()
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
     * Gets the cfop.
     *
     * @return the cfop
     */
    public String getCfop()
    {
        return cfop;
    }

    /**
     * Sets the cfop.
     *
* @param id the cfop to set
 */
    public void setCfop(String cfop)
    {
        this.cfop = cfop;
    }

    /**
    /**
     * Gets the natureza.
     *
     * @return the natureza
     */
    public String getNatureza()
    {
        return natureza;
    }

    /**
     * Sets the natureza.
     *
* @param id the natureza to set
 */
    public void setNatureza(String natureza)
    {
        this.natureza = natureza;
    }

    /**
    /**
     * Gets the simplificado.
     *
     * @return the simplificado
     */
    public String getSimplificado()
    {
        return simplificado;
    }

    /**
     * Sets the simplificado.
     *
* @param id the simplificado to set
 */
    public void setSimplificado(String simplificado)
    {
        this.simplificado = simplificado;
    }

    /**
    /**
     * Gets the cfopTypeEnum.
     *
     * @return the cfopTypeEnum
     */
    public Integer getCfopTypeEnum()
    {
        return cfopTypeEnum;
    }

    /**
     * Sets the cfoptypeenum.
     *
* @param id the cfoptypeenum to set
 */
    public void setCfopTypeEnum(Integer cfoptypeenum)
    {
        this.cfopTypeEnum = cfoptypeenum;
    }

    /**
    /**
     * Gets the icms.
     *
     * @return the icms
     */
    public Double getIcms()
    {
        return icms;
    }

    /**
     * Sets the icms.
     *
* @param id the icms to set
 */
    public void setIcms(Double icms)
    {
        this.icms = icms;
    }

    /**
    /**
     * Gets the icmsReduzido.
     *
     * @return the icmsReduzido
     */
    public Double getIcmsReduzido()
    {
        return icmsReduzido;
    }

    /**
     * Sets the icmsreduzido.
     *
* @param id the icmsreduzido to set
 */
    public void setIcmsReduzido(Double icmsreduzido)
    {
        this.icmsReduzido = icmsreduzido;
    }

    /**
    /**
     * Gets the margemAgregadaST.
     *
     * @return the margemAgregadaST
     */
    public Double getMargemAgregadaST()
    {
        return margemAgregadaST;
    }

    /**
     * Sets the margemagregadast.
     *
* @param id the margemagregadast to set
 */
    public void setMargemAgregadaST(Double margemagregadast)
    {
        this.margemAgregadaST = margemagregadast;
    }

    /**
    /**
     * Gets the cstPrincipal.
     *
     * @return the cstPrincipal
     */
    public Double getCstPrincipal()
    {
        return cstPrincipal;
    }

    /**
     * Sets the cstprincipal.
     *
* @param id the cstprincipal to set
 */
    public void setCstPrincipal(Double cstprincipal)
    {
        this.cstPrincipal = cstprincipal;
    }

    /**
    /**
     * Gets the classFiscal.
     *
     * @return the classFiscal
     */
    public Double getClassFiscal()
    {
        return classFiscal;
    }

    /**
     * Sets the classfiscal.
     *
* @param id the classfiscal to set
 */
    public void setClassFiscal(Double classfiscal)
    {
        this.classFiscal = classfiscal;
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

 }
