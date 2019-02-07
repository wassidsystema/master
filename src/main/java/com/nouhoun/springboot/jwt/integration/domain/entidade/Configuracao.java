/** create by system gera-java version 1.0.0 17/12/2018 20:24 : 13*/
package com.nouhoun.springboot.jwt.integration.domain.entidade;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.nouhoun.springboot.jwt.integration.domain.ModelJPA;
import com.nouhoun.springboot.jwt.integration.domain.DTO.entidade.ConfiguracaoDTO;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */

@Entity
@Table(name = "CONFIGURACAO")
public class Configuracao   extends ModelJPA 
{

    /** The econtabil id for the Configuracao. */
    @Id
    @Column(name = "CONFIGURACAO_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "configuracao_seq")
    @SequenceGenerator(name = "configuracao_seq", sequenceName = "configuracao_seq", allocationSize = 1)
    private Integer id;

    /** The econtabil confCabecalho for the Configuracao. */
    @Column(name = "CONFCABECALHO")
    private String confCabecalho;

    /** The econtabil confGeral for the Configuracao. */
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "CONFIGURACAO_ID", referencedColumnName = "CONFIGURACAO_ID", nullable = false, insertable = true, updatable = true)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private ConfigGeral confGeral;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "CONFIGURACAO_ID", insertable = false, unique = false, nullable = false, updatable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private ConfiguracaoNFe confNFe;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "CONFIGURACAO_ID", insertable = false, unique = false, nullable = false, updatable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private ConfigFiscal confFiscal;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "CONFIGURACAO_ID", insertable = false, unique = false, nullable = false, updatable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private ConfigProduto confProd;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "CONFIGURACAO_ID", insertable = false, unique = false, nullable = false, updatable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private ConfigVendas confVendas;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "CONFIGURACAO_ID", insertable = false, unique = false, nullable = false, updatable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private ConfigSMTP confCMTP;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "CONFIGURACAO_ID", insertable = false, unique = false, nullable = false, updatable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private ConfigAlertas confAlertas;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "CONFIGURACAO_ID", insertable = false, unique = false, nullable = false, updatable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private ConfigEntrada confEntrada;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "CONFIGURACAO_ID", insertable = false, unique = false, nullable = false, updatable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private ConfigCarne confCarne;
    
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "CONFIGURACAO_ID", insertable = false, unique = false, nullable = false, updatable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private ConfigOS configOS;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "CONFIGURACAO_ID", insertable = false, unique = false, nullable = false, updatable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private ConfBlueSoft confBlueSoft;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "CONFIGURACAO_ID", referencedColumnName = "CONFIGURACAO_ID", nullable = false, insertable = false, updatable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private List<Boleto> boletoList;

    
    
    public Configuracao(ConfiguracaoDTO config) {
		super();
		this.id = config.getId();
		setModifyDateUTC(config.getModifyDateUTC());
		setModifyUser(config.getModifyUser());
		setCreateDateUTC(config.getCreateDateUTC());
		setCreateUser(config.getCreateUser());
		setParentId(config.getParentId());
		setProcessId(config.getProcessId());
		setTableEnumValue(config.getTableEnumValue());
	}


	/**
     * Default constructor.
     */
    public Configuracao()
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
     * Gets the confCabecalho.
     *
     * @return the confCabecalho
     */
    public String getConfCabecalho()
    {
        return confCabecalho;
    }

    /**
     * Sets the confcabecalho.
     *
* @param id the confcabecalho to set
 */
    public void setConfCabecalho(String confcabecalho)
    {
        this.confCabecalho = confcabecalho;
    }

    /**
    /**
     * Gets the confGeral.
     *
     * @return the confGeral
     */
    public ConfigGeral getConfGeral()
    {
        return confGeral;
    }

    /**
     * Sets the confgeral.
     *
* @param id the confgeral to set
 */
    public void setConfGeral(ConfigGeral confgeral)
    {
        this.confGeral = confgeral;
    }

    /**
    /**
     * Gets the confNFe.
     *
     * @return the confNFe
     */
    public ConfiguracaoNFe getConfNFe()
    {
        return confNFe;
    }

    /**
     * Sets the confnfe.
     *
* @param id the confnfe to set
 */
    public void setConfNFe(ConfiguracaoNFe confnfe)
    {
        this.confNFe = confnfe;
    }

    /**
    /**
     * Gets the confFiscal.
     *
     * @return the confFiscal
     */
    public ConfigFiscal getConfFiscal()
    {
        return confFiscal;
    }

    /**
     * Sets the conffiscal.
     *
* @param id the conffiscal to set
 */
    public void setConfFiscal(ConfigFiscal conffiscal)
    {
        this.confFiscal = conffiscal;
    }

    /**
    /**
     * Gets the confProd.
     *
     * @return the confProd
     */
    public ConfigProduto getConfProd()
    {
        return confProd;
    }

    /**
     * Sets the confprod.
     *
* @param id the confprod to set
 */
    public void setConfProd(ConfigProduto confprod)
    {
        this.confProd = confprod;
    }

    /**
    /**
     * Gets the confVendas.
     *
     * @return the confVendas
     */
    public ConfigVendas getConfVendas()
    {
        return confVendas;
    }

    /**
     * Sets the confvendas.
     *
* @param id the confvendas to set
 */
    public void setConfVendas(ConfigVendas confvendas)
    {
        this.confVendas = confvendas;
    }

    /**
    /**
     * Gets the confCMTP.
     *
     * @return the confCMTP
     */
    public ConfigSMTP getConfCMTP()
    {
        return confCMTP;
    }

    /**
     * Sets the confcmtp.
     *
* @param id the confcmtp to set
 */
    public void setConfCMTP(ConfigSMTP confcmtp)
    {
        this.confCMTP = confcmtp;
    }

    /**
    /**
     * Gets the confAlertas.
     *
     * @return the confAlertas
     */
    public ConfigAlertas getConfAlertas()
    {
        return confAlertas;
    }

    /**
     * Sets the confalertas.
     *
* @param id the confalertas to set
 */
    public void setConfAlertas(ConfigAlertas confalertas)
    {
        this.confAlertas = confalertas;
    }

    /**
    /**
     * Gets the confEntrada.
     *
     * @return the confEntrada
     */
    public ConfigEntrada getConfEntrada()
    {
        return confEntrada;
    }

    /**
     * Sets the confentrada.
     *
* @param id the confentrada to set
 */
    public void setConfEntrada(ConfigEntrada confentrada)
    {
        this.confEntrada = confentrada;
    }

    /**
    /**
     * Gets the confCarne.
     *
     * @return the confCarne
     */
    public ConfigCarne getConfCarne()
    {
        return confCarne;
    }

    /**
     * Sets the confcarne.
     *
* @param id the confcarne to set
 */
    public void setConfCarne(ConfigCarne confcarne)
    {
        this.confCarne = confcarne;
    }

    /**
    /**
     * Gets the configOS.
     *
     * @return the configOS
     */
    public ConfigOS getConfigOS()
    {
        return configOS;
    }

    /**
     * Sets the configos.
     *
* @param id the configos to set
 */
    public void setConfigOS(ConfigOS configos)
    {
        this.configOS = configos;
    }

    /**
    /**
     * Gets the confBlueSoft.
     *
     * @return the confBlueSoft
     */
    public ConfBlueSoft getConfBlueSoft()
    {
        return confBlueSoft;
    }

    /**
     * Sets the confbluesoft.
     *
* @param id the confbluesoft to set
 */
    public void setConfBlueSoft(ConfBlueSoft confbluesoft)
    {
        this.confBlueSoft = confbluesoft;
    }

    /**
    /**
     * Gets the boletolist.
     *
     * @return the boletolist
     */
    public List<Boleto> getBoletoList()
    {
        return boletoList;
    }

    /**
     * Sets the boletolist.
     *
* @param id the boletolist to set
 */
public void setBoletoList(List<Boleto> boletolist)
{
        this.boletoList = boletolist;
    }

 }
