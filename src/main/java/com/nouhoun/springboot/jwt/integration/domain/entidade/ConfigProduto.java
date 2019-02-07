/** create by system gera-java version 1.0.0 17/12/2018 20:24 : 13*/
package com.nouhoun.springboot.jwt.integration.domain.entidade;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */

@Entity
@Table(name = "CONFIGPRODUTO")
public class ConfigProduto 
{

    /** The econtabil id for the ConfigProduto. */
    @Id
    @Column(name = "CONFIGPRODUTO_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "configProduto_seq")
    @SequenceGenerator(name = "configProduto_seq", sequenceName = "configProduto_seq", allocationSize = 1)
    private Integer id;
    
    @Column(name = "CONFIGURACAO_ID")
    private Integer confId;
    
    /** The econtabil regime for the ConfigFiscal. */
	@Column(name = "CFOP_ID")
	private Integer cfopId;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "CFOP_ID", insertable = false, unique = false, nullable = false, updatable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Cfop cfop;

    /** The econtabil icmsSitTrib for the ConfigProduto. */
    @Column(name = "ICMSSITTRIB")
    private Integer icmsSitTrib;

    /** The econtabil icmsOrigem for the ConfigProduto. */
    @Column(name = "ICMSORIGEM")
    private Integer icmsOrigem;

    /** The econtabil icmsModalidadeBC for the ConfigProduto. */
    @Column(name = "ICMSMODALIDADEBC")
    private Integer icmsModalidadeBC;

    /** The econtabil icmsRedBaseCalc for the ConfigProduto. */
    @Column(name = "ICMSREDBASECALC")
    private Double icmsRedBaseCalc;

    /** The econtabil icmsAliq for the ConfigProduto. */
    @Column(name = "ICMSALIQ")
    private Double icmsAliq;

    /** The econtabil icmsMotDesoneracao for the ConfigProduto. */
    @Column(name = "ICMSMOTDESONERACAO")
    private Integer icmsMotDesoneracao;

    /** The econtabil icmsModBCST for the ConfigProduto. */
    @Column(name = "ICMSMODBCST")
    private Integer icmsModBCST;

    /** The econtabil icmsMargValAdic for the ConfigProduto. */
    @Column(name = "ICMSMARGVALADIC")
    private Double icmsMargValAdic;

    /** The econtabil icmsRedBaseCalcST for the ConfigProduto. */
    @Column(name = "ICMSREDBASECALCST")
    private Double icmsRedBaseCalcST;

    /** The econtabil icmsPrecoUnitPautaST for the ConfigProduto. */
    @Column(name = "ICMSPRECOUNITPAUTAST")
    private Double icmsPrecoUnitPautaST;

    /** The econtabil icmsAliqST for the ConfigProduto. */
    @Column(name = "ICMSALIQST")
    private Double icmsAliqST;

    /** The econtabil ipiSitTrib for the ConfigProduto. */
    @Column(name = "IPISITTRIB")
    private Integer ipiSitTrib;

    /** The econtabil ipiClasCigarroBebida for the ConfigProduto. */
    @Column(name = "IPICLASCIGARROBEBIDA")
    private Double ipiClasCigarroBebida;

    /** The econtabil ipiCNPJProd for the ConfigProduto. */
    @Column(name = "IPICNPJPROD")
    private String ipiCNPJProd;

    /** The econtabil ipiCodSeloCont for the ConfigProduto. */
    @Column(name = "IPICODSELOCONT")
    private String ipiCodSeloCont;

    /** The econtabil ipiQtdSelo for the ConfigProduto. */
    @Column(name = "IPIQTDSELO")
    private Double ipiQtdSelo;

    /** The econtabil ipiCodEnquad for the ConfigProduto. */
    @Column(name = "IPICODENQUAD")
    private Integer ipiCodEnquad;

    /** The econtabil ipiTipCalc for the ConfigProduto. */
    @Column(name = "IPITIPCALC")
    private Integer ipiTipCalc;

    /** The econtabil ipiAliq for the ConfigProduto. */
    @Column(name = "IPIALIQ")
    private Double ipiAliq;

    /** The econtabil pisSitTrib for the ConfigProduto. */
    @Column(name = "PISSITTRIB")
    private Integer pisSitTrib;

    /** The econtabil pisAliq for the ConfigProduto. */
    @Column(name = "PISALIQ")
    private Double pisAliq;

    /** The econtabil pisValUnidtrib for the ConfigProduto. */
    @Column(name = "PISVALUNIDTRIB")
    private Double pisValUnidtrib;

    /** The econtabil pistipoCalcSubstTrib for the ConfigProduto. */
    @Column(name = "PISTIPOCALCSUBSTTRIB")
    private Integer pistipoCalcSubstTrib;

    /** The econtabil pisAliqST for the ConfigProduto. */
    @Column(name = "PISALIQST")
    private Double pisAliqST;

    /** The econtabil pisValorAliqST for the ConfigProduto. */
    @Column(name = "PISVALORALIQST")
    private Double pisValorAliqST;

    /** The econtabil cofinsSubstTrib for the ConfigProduto. */
    @Column(name = "COFINSSUBSTTRIB")
    private Integer cofinsSubstTrib;

    /** The econtabil cofinsAliq for the ConfigProduto. */
    @Column(name = "COFINSALIQ")
    private Double cofinsAliq;

    /** The econtabil cofinsValorAliq for the ConfigProduto. */
    @Column(name = "COFINSVALORALIQ")
    private Double cofinsValorAliq;

    /** The econtabil cofinsTipoCalcSubstTrib for the ConfigProduto. */
    @Column(name = "COFINSTIPOCALCSUBSTTRIB")
    private Integer cofinsTipoCalcSubstTrib;

    /** The econtabil cofinsAliqST for the ConfigProduto. */
    @Column(name = "COFINSALIQST")
    private Double cofinsAliqST;

    /** The econtabil cofinsValorAliqST for the ConfigProduto. */
    @Column(name = "COFINSVALORALIQST")
    private Double cofinsValorAliqST;



    /**
     * Default constructor.
     */
    public ConfigProduto()
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
    public Cfop getCfop()
    {
        return cfop;
    }

    /**
     * Sets the cfop.
     *
* @param id the cfop to set
 */
    public void setCfop(Cfop cfop)
    {
        this.cfop = cfop;
    }

    /**
    /**
     * Gets the icmsSitTrib.
     *
     * @return the icmsSitTrib
     */
    public Integer getIcmsSitTrib()
    {
        return icmsSitTrib;
    }

    /**
     * Sets the icmssittrib.
     *
* @param id the icmssittrib to set
 */
    public void setIcmsSitTrib(Integer icmssittrib)
    {
        this.icmsSitTrib = icmssittrib;
    }

    /**
    /**
     * Gets the icmsOrigem.
     *
     * @return the icmsOrigem
     */
    public Integer getIcmsOrigem()
    {
        return icmsOrigem;
    }

    /**
     * Sets the icmsorigem.
     *
* @param id the icmsorigem to set
 */
    public void setIcmsOrigem(Integer icmsorigem)
    {
        this.icmsOrigem = icmsorigem;
    }

    /**
    /**
     * Gets the icmsModalidadeBC.
     *
     * @return the icmsModalidadeBC
     */
    public Integer getIcmsModalidadeBC()
    {
        return icmsModalidadeBC;
    }

    /**
     * Sets the icmsmodalidadebc.
     *
* @param id the icmsmodalidadebc to set
 */
    public void setIcmsModalidadeBC(Integer icmsmodalidadebc)
    {
        this.icmsModalidadeBC = icmsmodalidadebc;
    }

    /**
    /**
     * Gets the icmsRedBaseCalc.
     *
     * @return the icmsRedBaseCalc
     */
    public Double getIcmsRedBaseCalc()
    {
        return icmsRedBaseCalc;
    }

    /**
     * Sets the icmsredbasecalc.
     *
* @param id the icmsredbasecalc to set
 */
    public void setIcmsRedBaseCalc(Double icmsredbasecalc)
    {
        this.icmsRedBaseCalc = icmsredbasecalc;
    }

    /**
    /**
     * Gets the icmsAliq.
     *
     * @return the icmsAliq
     */
    public Double getIcmsAliq()
    {
        return icmsAliq;
    }

    /**
     * Sets the icmsaliq.
     *
* @param id the icmsaliq to set
 */
    public void setIcmsAliq(Double icmsaliq)
    {
        this.icmsAliq = icmsaliq;
    }

    /**
    /**
     * Gets the icmsMotDesoneracao.
     *
     * @return the icmsMotDesoneracao
     */
    public Integer getIcmsMotDesoneracao()
    {
        return icmsMotDesoneracao;
    }

    /**
     * Sets the icmsmotdesoneracao.
     *
* @param id the icmsmotdesoneracao to set
 */
    public void setIcmsMotDesoneracao(Integer icmsmotdesoneracao)
    {
        this.icmsMotDesoneracao = icmsmotdesoneracao;
    }

    /**
    /**
     * Gets the icmsModBCST.
     *
     * @return the icmsModBCST
     */
    public Integer getIcmsModBCST()
    {
        return icmsModBCST;
    }

    /**
     * Sets the icmsmodbcst.
     *
* @param id the icmsmodbcst to set
 */
    public void setIcmsModBCST(Integer icmsmodbcst)
    {
        this.icmsModBCST = icmsmodbcst;
    }

    /**
    /**
     * Gets the icmsMargValAdic.
     *
     * @return the icmsMargValAdic
     */
    public Double getIcmsMargValAdic()
    {
        return icmsMargValAdic;
    }

    /**
     * Sets the icmsmargvaladic.
     *
* @param id the icmsmargvaladic to set
 */
    public void setIcmsMargValAdic(Double icmsmargvaladic)
    {
        this.icmsMargValAdic = icmsmargvaladic;
    }

    /**
    /**
     * Gets the icmsRedBaseCalcST.
     *
     * @return the icmsRedBaseCalcST
     */
    public Double getIcmsRedBaseCalcST()
    {
        return icmsRedBaseCalcST;
    }

    /**
     * Sets the icmsredbasecalcst.
     *
* @param id the icmsredbasecalcst to set
 */
    public void setIcmsRedBaseCalcST(Double icmsredbasecalcst)
    {
        this.icmsRedBaseCalcST = icmsredbasecalcst;
    }

    /**
    /**
     * Gets the icmsPrecoUnitPautaST.
     *
     * @return the icmsPrecoUnitPautaST
     */
    public Double getIcmsPrecoUnitPautaST()
    {
        return icmsPrecoUnitPautaST;
    }

    /**
     * Sets the icmsprecounitpautast.
     *
* @param id the icmsprecounitpautast to set
 */
    public void setIcmsPrecoUnitPautaST(Double icmsprecounitpautast)
    {
        this.icmsPrecoUnitPautaST = icmsprecounitpautast;
    }

    /**
    /**
     * Gets the icmsAliqST.
     *
     * @return the icmsAliqST
     */
    public Double getIcmsAliqST()
    {
        return icmsAliqST;
    }

    /**
     * Sets the icmsaliqst.
     *
* @param id the icmsaliqst to set
 */
    public void setIcmsAliqST(Double icmsaliqst)
    {
        this.icmsAliqST = icmsaliqst;
    }

    /**
    /**
     * Gets the ipiSitTrib.
     *
     * @return the ipiSitTrib
     */
    public Integer getIpiSitTrib()
    {
        return ipiSitTrib;
    }

    /**
     * Sets the ipisittrib.
     *
* @param id the ipisittrib to set
 */
    public void setIpiSitTrib(Integer ipisittrib)
    {
        this.ipiSitTrib = ipisittrib;
    }

    /**
    /**
     * Gets the ipiClasCigarroBebida.
     *
     * @return the ipiClasCigarroBebida
     */
    public Double getIpiClasCigarroBebida()
    {
        return ipiClasCigarroBebida;
    }

    /**
     * Sets the ipiclascigarrobebida.
     *
* @param id the ipiclascigarrobebida to set
 */
    public void setIpiClasCigarroBebida(Double ipiclascigarrobebida)
    {
        this.ipiClasCigarroBebida = ipiclascigarrobebida;
    }

    /**
    /**
     * Gets the ipiCNPJProd.
     *
     * @return the ipiCNPJProd
     */
    public String getIpiCNPJProd()
    {
        return ipiCNPJProd;
    }

    /**
     * Sets the ipicnpjprod.
     *
* @param id the ipicnpjprod to set
 */
    public void setIpiCNPJProd(String ipicnpjprod)
    {
        this.ipiCNPJProd = ipicnpjprod;
    }

    /**
    /**
     * Gets the ipiCodSeloCont.
     *
     * @return the ipiCodSeloCont
     */
    public String getIpiCodSeloCont()
    {
        return ipiCodSeloCont;
    }

    /**
     * Sets the ipicodselocont.
     *
* @param id the ipicodselocont to set
 */
    public void setIpiCodSeloCont(String ipicodselocont)
    {
        this.ipiCodSeloCont = ipicodselocont;
    }

    /**
    /**
     * Gets the ipiQtdSelo.
     *
     * @return the ipiQtdSelo
     */
    public Double getIpiQtdSelo()
    {
        return ipiQtdSelo;
    }

    /**
     * Sets the ipiqtdselo.
     *
* @param id the ipiqtdselo to set
 */
    public void setIpiQtdSelo(Double ipiqtdselo)
    {
        this.ipiQtdSelo = ipiqtdselo;
    }

    /**
    /**
     * Gets the ipiCodEnquad.
     *
     * @return the ipiCodEnquad
     */
    public Integer getIpiCodEnquad()
    {
        return ipiCodEnquad;
    }

    /**
     * Sets the ipicodenquad.
     *
* @param id the ipicodenquad to set
 */
    public void setIpiCodEnquad(Integer ipicodenquad)
    {
        this.ipiCodEnquad = ipicodenquad;
    }

    /**
    /**
     * Gets the ipiTipCalc.
     *
     * @return the ipiTipCalc
     */
    public Integer getIpiTipCalc()
    {
        return ipiTipCalc;
    }

    /**
     * Sets the ipitipcalc.
     *
* @param id the ipitipcalc to set
 */
    public void setIpiTipCalc(Integer ipitipcalc)
    {
        this.ipiTipCalc = ipitipcalc;
    }

    /**
    /**
     * Gets the ipiAliq.
     *
     * @return the ipiAliq
     */
    public Double getIpiAliq()
    {
        return ipiAliq;
    }

    /**
     * Sets the ipialiq.
     *
* @param id the ipialiq to set
 */
    public void setIpiAliq(Double ipialiq)
    {
        this.ipiAliq = ipialiq;
    }

    /**
    /**
     * Gets the pisSitTrib.
     *
     * @return the pisSitTrib
     */
    public Integer getPisSitTrib()
    {
        return pisSitTrib;
    }

    /**
     * Sets the pissittrib.
     *
* @param id the pissittrib to set
 */
    public void setPisSitTrib(Integer pissittrib)
    {
        this.pisSitTrib = pissittrib;
    }

    /**
    /**
     * Gets the pisAliq.
     *
     * @return the pisAliq
     */
    public Double getPisAliq()
    {
        return pisAliq;
    }

    /**
     * Sets the pisaliq.
     *
* @param id the pisaliq to set
 */
    public void setPisAliq(Double pisaliq)
    {
        this.pisAliq = pisaliq;
    }

    /**
    /**
     * Gets the pisValUnidtrib.
     *
     * @return the pisValUnidtrib
     */
    public Double getPisValUnidtrib()
    {
        return pisValUnidtrib;
    }

    /**
     * Sets the pisvalunidtrib.
     *
* @param id the pisvalunidtrib to set
 */
    public void setPisValUnidtrib(Double pisvalunidtrib)
    {
        this.pisValUnidtrib = pisvalunidtrib;
    }

    /**
    /**
     * Gets the pistipoCalcSubstTrib.
     *
     * @return the pistipoCalcSubstTrib
     */
    public Integer getPistipoCalcSubstTrib()
    {
        return pistipoCalcSubstTrib;
    }

    /**
     * Sets the pistipocalcsubsttrib.
     *
* @param id the pistipocalcsubsttrib to set
 */
    public void setPistipoCalcSubstTrib(Integer pistipocalcsubsttrib)
    {
        this.pistipoCalcSubstTrib = pistipocalcsubsttrib;
    }

    /**
    /**
     * Gets the pisAliqST.
     *
     * @return the pisAliqST
     */
    public Double getPisAliqST()
    {
        return pisAliqST;
    }

    /**
     * Sets the pisaliqst.
     *
* @param id the pisaliqst to set
 */
    public void setPisAliqST(Double pisaliqst)
    {
        this.pisAliqST = pisaliqst;
    }

    /**
    /**
     * Gets the pisValorAliqST.
     *
     * @return the pisValorAliqST
     */
    public Double getPisValorAliqST()
    {
        return pisValorAliqST;
    }

    /**
     * Sets the pisvaloraliqst.
     *
* @param id the pisvaloraliqst to set
 */
    public void setPisValorAliqST(Double pisvaloraliqst)
    {
        this.pisValorAliqST = pisvaloraliqst;
    }

    /**
    /**
     * Gets the cofinsSubstTrib.
     *
     * @return the cofinsSubstTrib
     */
    public Integer getCofinsSubstTrib()
    {
        return cofinsSubstTrib;
    }

    /**
     * Sets the cofinssubsttrib.
     *
* @param id the cofinssubsttrib to set
 */
    public void setCofinsSubstTrib(Integer cofinssubsttrib)
    {
        this.cofinsSubstTrib = cofinssubsttrib;
    }

    /**
    /**
     * Gets the cofinsAliq.
     *
     * @return the cofinsAliq
     */
    public Double getCofinsAliq()
    {
        return cofinsAliq;
    }

    /**
     * Sets the cofinsaliq.
     *
* @param id the cofinsaliq to set
 */
    public void setCofinsAliq(Double cofinsaliq)
    {
        this.cofinsAliq = cofinsaliq;
    }

    /**
    /**
     * Gets the cofinsValorAliq.
     *
     * @return the cofinsValorAliq
     */
    public Double getCofinsValorAliq()
    {
        return cofinsValorAliq;
    }

    /**
     * Sets the cofinsvaloraliq.
     *
* @param id the cofinsvaloraliq to set
 */
    public void setCofinsValorAliq(Double cofinsvaloraliq)
    {
        this.cofinsValorAliq = cofinsvaloraliq;
    }

    /**
    /**
     * Gets the cofinsTipoCalcSubstTrib.
     *
     * @return the cofinsTipoCalcSubstTrib
     */
    public Integer getCofinsTipoCalcSubstTrib()
    {
        return cofinsTipoCalcSubstTrib;
    }

    /**
     * Sets the cofinstipocalcsubsttrib.
     *
* @param id the cofinstipocalcsubsttrib to set
 */
    public void setCofinsTipoCalcSubstTrib(Integer cofinstipocalcsubsttrib)
    {
        this.cofinsTipoCalcSubstTrib = cofinstipocalcsubsttrib;
    }

    /**
    /**
     * Gets the cofinsAliqST.
     *
     * @return the cofinsAliqST
     */
    public Double getCofinsAliqST()
    {
        return cofinsAliqST;
    }

    /**
     * Sets the cofinsaliqst.
     *
* @param id the cofinsaliqst to set
 */
    public void setCofinsAliqST(Double cofinsaliqst)
    {
        this.cofinsAliqST = cofinsaliqst;
    }

    /**
    /**
     * Gets the cofinsValorAliqST.
     *
     * @return the cofinsValorAliqST
     */
    public Double getCofinsValorAliqST()
    {
        return cofinsValorAliqST;
    }

    /**
     * Sets the cofinsvaloraliqst.
     *
* @param id the cofinsvaloraliqst to set
 */
    public void setCofinsValorAliqST(Double cofinsvaloraliqst)
    {
        this.cofinsValorAliqST = cofinsvaloraliqst;
    }

 }
