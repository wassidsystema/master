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
@Table(name = "CONFIGGERAL")
public class ConfigGeral 
{

    /** The econtabil id for the ConfigGeral. */
    @Id
    @Column(name = "CONFIGGERAL_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "configGeral_seq")
    @SequenceGenerator(name = "configGeral_seq", sequenceName = "configGeral_seq", allocationSize = 1)
    private Integer id;

    /** The econtabil fusoHorario for the ConfigGeral. */
    @Column(name = "FUSOHORARIO")
    private Integer fusoHorario;

    /** The econtabil casasDecimais for the ConfigGeral. */
    @Column(name = "CASASDECIMAIS")
    private Integer casasDecimais;

    /** The econtabil diasCartaCobr for the ConfigGeral. */
    @Column(name = "DIASCARTACOBR")
    private Integer diasCartaCobr;

    /** The econtabil infPosicionarMouse for the ConfigGeral. */
    @Column(name = "INFPOSICIONARMOUSE")
    private Integer infPosicionarMouse;

    /** The econtabil cnpjCPFUnico for the ConfigGeral. */
    @Column(name = "CNPJCPFUNICO")
    private Integer cnpjCPFUnico;

    /** The econtabil impCodPersonalizado for the ConfigGeral. */
    @Column(name = "IMPCODPERSONALIZADO")
    private Integer impCodPersonalizado;

    /** The econtabil logListRelImp for the ConfigGeral. */
    @Column(name = "LOGLISTRELIMP")
    private Integer logListRelImp;

    /** The econtabil obsProdFinProd for the ConfigGeral. */
    @Column(name = "OBSPRODFINPROD")
    private Integer obsProdFinProd;

    /** The econtabil ativNFCe for the ConfigGeral. */
    @Column(name = "ATIVNFCE")
    private Integer ativNFCe;
    
    @Column(name = "CONFIGURACAO_ID")
    private Integer confId;



    /**
     * Default constructor.
     */
    public ConfigGeral()
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
     * Gets the fusoHorario.
     *
     * @return the fusoHorario
     */
    public Integer getFusoHorario()
    {
        return fusoHorario;
    }

    /**
     * Sets the fusohorario.
     *
* @param id the fusohorario to set
 */
    public void setFusoHorario(Integer fusohorario)
    {
        this.fusoHorario = fusohorario;
    }

    /**
    /**
     * Gets the casasDecimais.
     *
     * @return the casasDecimais
     */
    public Integer getCasasDecimais()
    {
        return casasDecimais;
    }

    /**
     * Sets the casasdecimais.
     *
* @param id the casasdecimais to set
 */
    public void setCasasDecimais(Integer casasdecimais)
    {
        this.casasDecimais = casasdecimais;
    }

    /**
    /**
     * Gets the diasCartaCobr.
     *
     * @return the diasCartaCobr
     */
    public Integer getDiasCartaCobr()
    {
        return diasCartaCobr;
    }

    /**
     * Sets the diascartacobr.
     *
* @param id the diascartacobr to set
 */
    public void setDiasCartaCobr(Integer diascartacobr)
    {
        this.diasCartaCobr = diascartacobr;
    }

    /**
    /**
     * Gets the infPosicionarMouse.
     *
     * @return the infPosicionarMouse
     */
    public Integer getInfPosicionarMouse()
    {
        return infPosicionarMouse;
    }

    /**
     * Sets the infposicionarmouse.
     *
* @param id the infposicionarmouse to set
 */
    public void setInfPosicionarMouse(Integer infposicionarmouse)
    {
        this.infPosicionarMouse = infposicionarmouse;
    }

    /**
    /**
     * Gets the cnpjCPFUnico.
     *
     * @return the cnpjCPFUnico
     */
    public Integer getCnpjCPFUnico()
    {
        return cnpjCPFUnico;
    }

    /**
     * Sets the cnpjcpfunico.
     *
* @param id the cnpjcpfunico to set
 */
    public void setCnpjCPFUnico(Integer cnpjcpfunico)
    {
        this.cnpjCPFUnico = cnpjcpfunico;
    }

    /**
    /**
     * Gets the impCodPersonalizado.
     *
     * @return the impCodPersonalizado
     */
    public Integer getImpCodPersonalizado()
    {
        return impCodPersonalizado;
    }

    /**
     * Sets the impcodpersonalizado.
     *
* @param id the impcodpersonalizado to set
 */
    public void setImpCodPersonalizado(Integer impcodpersonalizado)
    {
        this.impCodPersonalizado = impcodpersonalizado;
    }

    /**
    /**
     * Gets the logListRelImp.
     *
     * @return the logListRelImp
     */
    public Integer getLogListRelImp()
    {
        return logListRelImp;
    }

    /**
     * Sets the loglistrelimp.
     *
* @param id the loglistrelimp to set
 */
    public void setLogListRelImp(Integer loglistrelimp)
    {
        this.logListRelImp = loglistrelimp;
    }

    /**
    /**
     * Gets the obsProdFinProd.
     *
     * @return the obsProdFinProd
     */
    public Integer getObsProdFinProd()
    {
        return obsProdFinProd;
    }

    /**
     * Sets the obsprodfinprod.
     *
* @param id the obsprodfinprod to set
 */
    public void setObsProdFinProd(Integer obsprodfinprod)
    {
        this.obsProdFinProd = obsprodfinprod;
    }

    /**
    /**
     * Gets the ativNFCe.
     *
     * @return the ativNFCe
     */
    public Integer getAtivNFCe()
    {
        return ativNFCe;
    }

    /**
     * Sets the ativnfce.
     *
* @param id the ativnfce to set
 */
    public void setAtivNFCe(Integer ativnfce)
    {
        this.ativNFCe = ativnfce;
    }

 }
