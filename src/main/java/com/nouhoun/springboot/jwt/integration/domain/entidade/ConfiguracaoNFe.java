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
@Table(name = "CONFIGURACAONFE")
public class ConfiguracaoNFe 
{

    /** The econtabil id for the ConfiguracaoNFe. */
    @Id
    @Column(name = "CONFIGURACAONFE_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "configuracaoNFe_seq")
    @SequenceGenerator(name = "configuracaoNFe_seq", sequenceName = "configuracaoNFe_seq", allocationSize = 1)
    private Integer id;
    
    @Column(name = "CONFIGURACAO_ID")
    private Integer confId;

    /** The econtabil presCompr for the ConfiguracaoNFe. */
    @Column(name = "PRESCOMPR")
    private Integer presCompr;

    /** The econtabil destConsFinal for the ConfiguracaoNFe. */
    @Column(name = "DESTCONSFINAL")
    private Integer destConsFinal;

    /** The econtabil preencherDataHora for the ConfiguracaoNFe. */
    @Column(name = "PREENCHERDATAHORA")
    private Integer preencherDataHora;

    /** The econtabil icmsPadrao for the ConfiguracaoNFe. */
    @Column(name = "ICMSPADRAO")
    private Double icmsPadrao;

    /** The econtabil ipiPadrao for the ConfiguracaoNFe. */
    @Column(name = "IPIPADRAO")
    private Double ipiPadrao;

    /** The econtabil pisPadrao for the ConfiguracaoNFe. */
    @Column(name = "PISPADRAO")
    private Double pisPadrao;

    /** The econtabil cofinsPadrao for the ConfiguracaoNFe. */
    @Column(name = "COFINSPADRAO")
    private Double cofinsPadrao;

    /** The econtabil ambienteEnvio for the ConfiguracaoNFe. */
    @Column(name = "AMBIENTEENVIO")
    private Integer ambienteEnvio;

    /** The econtabil servMsmNota for the ConfiguracaoNFe. */
    @Column(name = "SERVMSMNOTA")
    private Double servMsmNota;

    /** The econtabil serieEnvio for the ConfiguracaoNFe. */
    @Column(name = "SERIEENVIO")
    private String serieEnvio;

    /** The econtabil anexarXmlEmail for the ConfiguracaoNFe. */
    @Column(name = "ANEXARXMLEMAIL")
    private Integer anexarXmlEmail;

    /** The econtabil idCSC for the ConfiguracaoNFe. */
    @Column(name = "IDCSC")
    private String idCSC;

    /** The econtabil cSC for the ConfiguracaoNFe. */
    @Column(name = "CSC")
    private String cSC;

    /** The econtabil informacaoAdd for the ConfiguracaoNFe. */
    @Column(name = "INFORMACAOADD")
    private String informacaoAdd;

    /** The econtabil certificado for the ConfiguracaoNFe. */
    @Column(name = "CERTIFICADO")
    private String certificado;

    /** The econtabil senha for the ConfiguracaoNFe. */
    @Column(name = "SENHA")
    private String senha;

    /** The econtabil salvarSenha for the ConfiguracaoNFe. */
    @Column(name = "SALVARSENHA")
    private Integer salvarSenha;

    /** The econtabil cfopPadrao for the ConfiguracaoNFe. */
    @Column(name = "CFOPPADRAO")
    private Integer cfopPadrao;
    
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "CFOPPADRAO", insertable = false, unique = false, nullable = false, updatable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Cfop cfop;

    /** The econtabil tokenNFCe for the ConfiguracaoNFe. */
    @Column(name = "TOKENNFCE")
    private String tokenNFCe;

    /** The econtabil logoDanfe for the ConfiguracaoNFe. */
    @Column(name = "LOGODANFE")
    private String logoDanfe;

    /** The econtabil modelo for the ConfiguracaoNFe. */
    @Column(name = "MODELO")
    private Integer modelo;

    /** The econtabil tipoImpressao for the ConfiguracaoNFe. */
    @Column(name = "TIPOIMPRESSAO")
    private Integer tipoImpressao;

    /** The econtabil tipoEmissao for the ConfiguracaoNFe. */
    @Column(name = "TIPOEMISSAO")
    private Integer tipoEmissao;



    /**
     * Default constructor.
     */
    public ConfiguracaoNFe()
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
     * Gets the presCompr.
     *
     * @return the presCompr
     */
    public Integer getPresCompr()
    {
        return presCompr;
    }

    /**
     * Sets the prescompr.
     *
* @param id the prescompr to set
 */
    public void setPresCompr(Integer prescompr)
    {
        this.presCompr = prescompr;
    }

    /**
    /**
     * Gets the destConsFinal.
     *
     * @return the destConsFinal
     */
    public Integer getDestConsFinal()
    {
        return destConsFinal;
    }

    /**
     * Sets the destconsfinal.
     *
* @param id the destconsfinal to set
 */
    public void setDestConsFinal(Integer destconsfinal)
    {
        this.destConsFinal = destconsfinal;
    }

    /**
    /**
     * Gets the preencherDataHora.
     *
     * @return the preencherDataHora
     */
    public Integer getPreencherDataHora()
    {
        return preencherDataHora;
    }

    /**
     * Sets the preencherdatahora.
     *
* @param id the preencherdatahora to set
 */
    public void setPreencherDataHora(Integer preencherdatahora)
    {
        this.preencherDataHora = preencherdatahora;
    }

    /**
    /**
     * Gets the icmsPadrao.
     *
     * @return the icmsPadrao
     */
    public Double getIcmsPadrao()
    {
        return icmsPadrao;
    }

    /**
     * Sets the icmspadrao.
     *
* @param id the icmspadrao to set
 */
    public void setIcmsPadrao(Double icmspadrao)
    {
        this.icmsPadrao = icmspadrao;
    }

    /**
    /**
     * Gets the ipiPadrao.
     *
     * @return the ipiPadrao
     */
    public Double getIpiPadrao()
    {
        return ipiPadrao;
    }

    /**
     * Sets the ipipadrao.
     *
* @param id the ipipadrao to set
 */
    public void setIpiPadrao(Double ipipadrao)
    {
        this.ipiPadrao = ipipadrao;
    }

    /**
    /**
     * Gets the pisPadrao.
     *
     * @return the pisPadrao
     */
    public Double getPisPadrao()
    {
        return pisPadrao;
    }

    /**
     * Sets the pispadrao.
     *
* @param id the pispadrao to set
 */
    public void setPisPadrao(Double pispadrao)
    {
        this.pisPadrao = pispadrao;
    }

    /**
    /**
     * Gets the cofinsPadrao.
     *
     * @return the cofinsPadrao
     */
    public Double getCofinsPadrao()
    {
        return cofinsPadrao;
    }

    /**
     * Sets the cofinspadrao.
     *
* @param id the cofinspadrao to set
 */
    public void setCofinsPadrao(Double cofinspadrao)
    {
        this.cofinsPadrao = cofinspadrao;
    }

    /**
    /**
     * Gets the ambienteEnvio.
     *
     * @return the ambienteEnvio
     */
    public Integer getAmbienteEnvio()
    {
        return ambienteEnvio;
    }

    /**
     * Sets the ambienteenvio.
     *
* @param id the ambienteenvio to set
 */
    public void setAmbienteEnvio(Integer ambienteenvio)
    {
        this.ambienteEnvio = ambienteenvio;
    }

    /**
    /**
     * Gets the servMsmNota.
     *
     * @return the servMsmNota
     */
    public Double getServMsmNota()
    {
        return servMsmNota;
    }

    /**
     * Sets the servmsmnota.
     *
* @param id the servmsmnota to set
 */
    public void setServMsmNota(Double servmsmnota)
    {
        this.servMsmNota = servmsmnota;
    }

    /**
    /**
     * Gets the serieEnvio.
     *
     * @return the serieEnvio
     */
    public String getSerieEnvio()
    {
        return serieEnvio;
    }

    /**
     * Sets the serieenvio.
     *
* @param id the serieenvio to set
 */
    public void setSerieEnvio(String serieenvio)
    {
        this.serieEnvio = serieenvio;
    }

    /**
    /**
     * Gets the anexarXmlEmail.
     *
     * @return the anexarXmlEmail
     */
    public Integer getAnexarXmlEmail()
    {
        return anexarXmlEmail;
    }

    /**
     * Sets the anexarxmlemail.
     *
* @param id the anexarxmlemail to set
 */
    public void setAnexarXmlEmail(Integer anexarxmlemail)
    {
        this.anexarXmlEmail = anexarxmlemail;
    }

    /**
    /**
     * Gets the idCSC.
     *
     * @return the idCSC
     */
    public String getIdCSC()
    {
        return idCSC;
    }

    /**
     * Sets the idcsc.
     *
* @param id the idcsc to set
 */
    public void setIdCSC(String idcsc)
    {
        this.idCSC = idcsc;
    }

    /**
    /**
     * Gets the cSC.
     *
     * @return the cSC
     */
    public String getCSC()
    {
        return cSC;
    }

    /**
     * Sets the csc.
     *
* @param id the csc to set
 */
    public void setCSC(String csc)
    {
        this.cSC = csc;
    }

    /**
    /**
     * Gets the informacaoAdd.
     *
     * @return the informacaoAdd
     */
    public String getInformacaoAdd()
    {
        return informacaoAdd;
    }

    /**
     * Sets the informacaoadd.
     *
* @param id the informacaoadd to set
 */
    public void setInformacaoAdd(String informacaoadd)
    {
        this.informacaoAdd = informacaoadd;
    }

    /**
    /**
     * Gets the certificado.
     *
     * @return the certificado
     */
    public String getCertificado()
    {
        return certificado;
    }

    /**
     * Sets the certificado.
     *
* @param id the certificado to set
 */
    public void setCertificado(String certificado)
    {
        this.certificado = certificado;
    }

    /**
    /**
     * Gets the senha.
     *
     * @return the senha
     */
    public String getSenha()
    {
        return senha;
    }

    /**
     * Sets the senha.
     *
* @param id the senha to set
 */
    public void setSenha(String senha)
    {
        this.senha = senha;
    }

    /**
    /**
     * Gets the salvarSenha.
     *
     * @return the salvarSenha
     */
    public Integer getSalvarSenha()
    {
        return salvarSenha;
    }

    /**
     * Sets the salvarsenha.
     *
* @param id the salvarsenha to set
 */
    public void setSalvarSenha(Integer salvarsenha)
    {
        this.salvarSenha = salvarsenha;
    }


    public Integer getConfId() {
		return confId;
	}


	public void setConfId(Integer confId) {
		this.confId = confId;
	}


	public String getcSC() {
		return cSC;
	}


	public void setcSC(String cSC) {
		this.cSC = cSC;
	}


	public Integer getCfopPadrao() {
		return cfopPadrao;
	}


	public void setCfopPadrao(Integer cfopPadrao) {
		this.cfopPadrao = cfopPadrao;
	}


	public Cfop getCfop() {
		return cfop;
	}


	public void setCfop(Cfop cfop) {
		this.cfop = cfop;
	}


	/**
    /**
     * Gets the tokenNFCe.
     *
     * @return the tokenNFCe
     */
    public String getTokenNFCe()
    {
        return tokenNFCe;
    }

    /**
     * Sets the tokennfce.
     *
* @param id the tokennfce to set
 */
    public void setTokenNFCe(String tokennfce)
    {
        this.tokenNFCe = tokennfce;
    }

    /**
    /**
     * Gets the logoDanfe.
     *
     * @return the logoDanfe
     */
    public String getLogoDanfe()
    {
        return logoDanfe;
    }

    /**
     * Sets the logodanfe.
     *
* @param id the logodanfe to set
 */
    public void setLogoDanfe(String logodanfe)
    {
        this.logoDanfe = logodanfe;
    }

    /**
    /**
     * Gets the modelo.
     *
     * @return the modelo
     */
    public Integer getModelo()
    {
        return modelo;
    }

    /**
     * Sets the modelo.
     *
* @param id the modelo to set
 */
    public void setModelo(Integer modelo)
    {
        this.modelo = modelo;
    }

    /**
    /**
     * Gets the tipoImpressao.
     *
     * @return the tipoImpressao
     */
    public Integer getTipoImpressao()
    {
        return tipoImpressao;
    }

    /**
     * Sets the tipoimpressao.
     *
* @param id the tipoimpressao to set
 */
    public void setTipoImpressao(Integer tipoimpressao)
    {
        this.tipoImpressao = tipoimpressao;
    }

    /**
    /**
     * Gets the tipoEmissao.
     *
     * @return the tipoEmissao
     */
    public Integer getTipoEmissao()
    {
        return tipoEmissao;
    }

    /**
     * Sets the tipoemissao.
     *
* @param id the tipoemissao to set
 */
    public void setTipoEmissao(Integer tipoemissao)
    {
        this.tipoEmissao = tipoemissao;
    }

 }
