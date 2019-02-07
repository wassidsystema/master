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
@Table(name = "CONFIGENTRADA")
public class ConfigEntrada 
{

    /** The econtabil id for the ConfigEntrada. */
    @Id
    @Column(name = "CONFIGENTRADA_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "configEntrada_seq")
    @SequenceGenerator(name = "configEntrada_seq", sequenceName = "configEntrada_seq", allocationSize = 1)
    private Integer id;
    
    @Column(name = "CONFIGURACAO_ID")
    private Integer confId;

    /** The econtabil valorTotalFixo for the ConfigEntrada. */
    @Column(name = "VALORTOTALFIXO")
    private Integer valorTotalFixo;

    /** The econtabil manterPrecoVendaProd for the ConfigEntrada. */
    @Column(name = "MANTERPRECOVENDAPROD")
    private Integer manterPrecoVendaProd;



    /**
     * Default constructor.
     */
    public ConfigEntrada()
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
     * Gets the valorTotalFixo.
     *
     * @return the valorTotalFixo
     */
    public Integer getValorTotalFixo()
    {
        return valorTotalFixo;
    }

    /**
     * Sets the valortotalfixo.
     *
* @param id the valortotalfixo to set
 */
    public void setValorTotalFixo(Integer valortotalfixo)
    {
        this.valorTotalFixo = valortotalfixo;
    }

    /**
    /**
     * Gets the manterPrecoVendaProd.
     *
     * @return the manterPrecoVendaProd
     */
    public Integer getManterPrecoVendaProd()
    {
        return manterPrecoVendaProd;
    }

    /**
     * Sets the manterprecovendaprod.
     *
* @param id the manterprecovendaprod to set
 */
    public void setManterPrecoVendaProd(Integer manterprecovendaprod)
    {
        this.manterPrecoVendaProd = manterprecovendaprod;
    }

 }
