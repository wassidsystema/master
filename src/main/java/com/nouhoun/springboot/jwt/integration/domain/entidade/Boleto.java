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
@Table(name = "BOLETO")
public class Boleto 
{

    /** The econtabil id for the Boleto. */
    @Id
    @Column(name = "BOLETO_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "boleto_seq")
    @SequenceGenerator(name = "boleto_seq", sequenceName = "boleto_seq", allocationSize = 1)
    private Integer id;
    
    @Column(name = "CONFIGURACAO_ID")
    private Integer confId;

    /** The econtabil ativarBolOnLine for the Boleto. */
    @Column(name = "ATIVARBOLONLINE")
    private Integer ativarBolOnLine;

    /** The econtabil tipoBoleto for the Boleto. */
    @Column(name = "TIPOBOLETO")
    private Integer tipoBoleto;

    /** The econtabil agencia for the Boleto. */
    @Column(name = "AGENCIA")
    private Integer agencia;

    /** The econtabil cedente for the Boleto. */
    @Column(name = "CEDENTE")
    private Integer cedente;

    /** The econtabil juros for the Boleto. */
    @Column(name = "JUROS")
    private Double juros;

    /** The econtabil tipoCalcMora for the Boleto. */
    @Column(name = "TIPOCALCMORA")
    private Integer tipoCalcMora;

    /** The econtabil mora for the Boleto. */
    @Column(name = "MORA")
    private Double mora;

    /** The econtabil instrucoes for the Boleto. */
    @Column(name = "INSTRUCOES")
    private String instrucoes;

    /** The econtabil demonstrativo for the Boleto. */
    @Column(name = "DEMONSTRATIVO")
    private String demonstrativo;

    /** The econtabil impJuros for the Boleto. */
    @Column(name = "IMPJUROS")
    private Integer impJuros;



    /**
     * Default constructor.
     */
    public Boleto()
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
     * Gets the ativarBolOnLine.
     *
     * @return the ativarBolOnLine
     */
    public Integer getAtivarBolOnLine()
    {
        return ativarBolOnLine;
    }

    /**
     * Sets the ativarbolonline.
     *
* @param id the ativarbolonline to set
 */
    public void setAtivarBolOnLine(Integer ativarbolonline)
    {
        this.ativarBolOnLine = ativarbolonline;
    }

    /**
    /**
     * Gets the tipoBoleto.
     *
     * @return the tipoBoleto
     */
    public Integer getTipoBoleto()
    {
        return tipoBoleto;
    }

    /**
     * Sets the tipoboleto.
     *
* @param id the tipoboleto to set
 */
    public void setTipoBoleto(Integer tipoboleto)
    {
        this.tipoBoleto = tipoboleto;
    }

    /**
    /**
     * Gets the agencia.
     *
     * @return the agencia
     */
    public Integer getAgencia()
    {
        return agencia;
    }

    /**
     * Sets the agencia.
     *
* @param id the agencia to set
 */
    public void setAgencia(Integer agencia)
    {
        this.agencia = agencia;
    }

    /**
    /**
     * Gets the cedente.
     *
     * @return the cedente
     */
    public Integer getCedente()
    {
        return cedente;
    }

    /**
     * Sets the cedente.
     *
* @param id the cedente to set
 */
    public void setCedente(Integer cedente)
    {
        this.cedente = cedente;
    }

    /**
    /**
     * Gets the juros.
     *
     * @return the juros
     */
    public Double getJuros()
    {
        return juros;
    }

    /**
     * Sets the juros.
     *
* @param id the juros to set
 */
    public void setJuros(Double juros)
    {
        this.juros = juros;
    }

    /**
    /**
     * Gets the tipoCalcMora.
     *
     * @return the tipoCalcMora
     */
    public Integer getTipoCalcMora()
    {
        return tipoCalcMora;
    }

    /**
     * Sets the tipocalcmora.
     *
* @param id the tipocalcmora to set
 */
    public void setTipoCalcMora(Integer tipocalcmora)
    {
        this.tipoCalcMora = tipocalcmora;
    }

    /**
    /**
     * Gets the mora.
     *
     * @return the mora
     */
    public Double getMora()
    {
        return mora;
    }

    /**
     * Sets the mora.
     *
* @param id the mora to set
 */
    public void setMora(Double mora)
    {
        this.mora = mora;
    }

    /**
    /**
     * Gets the instrucoes.
     *
     * @return the instrucoes
     */
    public String getInstrucoes()
    {
        return instrucoes;
    }

    /**
     * Sets the instrucoes.
     *
* @param id the instrucoes to set
 */
    public void setInstrucoes(String instrucoes)
    {
        this.instrucoes = instrucoes;
    }

    /**
    /**
     * Gets the demonstrativo.
     *
     * @return the demonstrativo
     */
    public String getDemonstrativo()
    {
        return demonstrativo;
    }

    /**
     * Sets the demonstrativo.
     *
* @param id the demonstrativo to set
 */
    public void setDemonstrativo(String demonstrativo)
    {
        this.demonstrativo = demonstrativo;
    }

    /**
    /**
     * Gets the impJuros.
     *
     * @return the impJuros
     */
    public Integer getImpJuros()
    {
        return impJuros;
    }

    /**
     * Sets the impjuros.
     *
* @param id the impjuros to set
 */
    public void setImpJuros(Integer impjuros)
    {
        this.impJuros = impjuros;
    }


	public Integer getConfId() {
		return confId;
	}


	public void setConfId(Integer confId) {
		this.confId = confId;
	}

 }
