/** create by system gera-java version 1.0.0 13/12/2018 19:50 : 5*/
package com.nouhoun.springboot.jwt.integration.domain.site;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */

@Entity
@Table(name = "PRECO")
public class Preco 
{

    /** The econtabil id for the Preco. */
    @Id
    @Column(name = "PRECO_ID")
    private Integer id;

    /** The econtabil dataMarcacao for the Preco. */
    @Column(name = "DATAMARCACAO")
    private Date dataMarcacao;

    /** The econtabil precoTypeEnum for the Preco. */
    @Column(name = "PRECOTYPEENUM")
    private Integer precoTypeEnum;

    /** The econtabil valor for the Preco. */
    @Column(name = "VALOR")
    private Double valor;

    /** The econtabil dataProInicial for the Preco. */
    @Column(name = "DATAPROINICIAL")
    private Date dataProInicial;

    /** The econtabil dataProFinal for the Preco. */
    @Column(name = "DATAPROFINAL")
    private Date dataProFinal;



    /**
     * Default constructor.
     */
    public Preco()
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
     * Gets the precoTypeEnum.
     *
     * @return the precoTypeEnum
     */
    public Integer getPrecoTypeEnum()
    {
        return precoTypeEnum;
    }

    /**
     * Sets the precotypeenum.
     *
* @param id the precotypeenum to set
 */
    public void setPrecoTypeEnum(Integer precotypeenum)
    {
        this.precoTypeEnum = precotypeenum;
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


	public Date getDataMarcacao() {
		return dataMarcacao;
	}


	public void setDataMarcacao(Date dataMarcacao) {
		this.dataMarcacao = dataMarcacao;
	}


	public Date getDataProInicial() {
		return dataProInicial;
	}


	public void setDataProInicial(Date dataProInicial) {
		this.dataProInicial = dataProInicial;
	}


	public Date getDataProFinal() {
		return dataProFinal;
	}


	public void setDataProFinal(Date dataProFinal) {
		this.dataProFinal = dataProFinal;
	}

    /**
    /**
     * Gets the dataProInicial.
     *
     * @return the dataProInicial
     */
 
    /**
     * Sets the dataproinicial.
     *
* @param id the dataproinicial to set
 */
   

    /**
    /**
     * Gets the dataProFinal.
     *
     * @return the dataProFinal
     */
   

    /**
     * Sets the dataprofinal.
     *
* @param id the dataprofinal to set
 */
  

 }
