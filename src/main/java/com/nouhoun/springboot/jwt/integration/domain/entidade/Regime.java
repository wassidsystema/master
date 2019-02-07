/** create by system gera-java version 1.0.0 17/12/2018 20:24 : 13*/
package com.nouhoun.springboot.jwt.integration.domain.entidade;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.nouhoun.springboot.jwt.integration.domain.ModelJPA;
import com.nouhoun.springboot.jwt.integration.domain.DTO.entidade.RegimeDTO;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */

@Entity
@Table(name = "REGIME")
public class Regime   extends ModelJPA 
{

    /** The econtabil id for the Regime. */
    @Id
    @Column(name = "REGIME_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "regime_seq")
    @SequenceGenerator(name = "regime_seq", sequenceName = "regime_seq", allocationSize = 1)
    private Integer id;

    /** The econtabil nome for the Regime. */
    @Column(name = "NOME")
    private String nome;

    /** The econtabil descricao for the Regime. */
    @Column(name = "DESCRICAO")
    private String descricao;



    /**
     * Default constructor.
     */
    public Regime()
    {
        super();
    }

    

    public Regime(RegimeDTO regime) {
		super();
		this.id = regime.getId();
		this.nome = regime.getNome();
		this.descricao = regime.getDescricao();
		setModifyDateUTC(regime.getModifyDateUTC());
		setModifyUser(regime.getModifyUser());
		setCreateDateUTC(regime.getCreateDateUTC());
		setCreateUser(regime.getCreateUser());
		setParentId(regime.getParentId());
		setProcessId(regime.getProcessId());
		setTableEnumValue(regime.getTableEnumValue());
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
     * Gets the nome.
     *
     * @return the nome
     */
    public String getNome()
    {
        return nome;
    }

    /**
     * Sets the nome.
     *
* @param id the nome to set
 */
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    /**
    /**
     * Gets the descricao.
     *
     * @return the descricao
     */
    public String getDescricao()
    {
        return descricao;
    }

    /**
     * Sets the descricao.
     *
* @param id the descricao to set
 */
    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }



	@Override
	public String toString() {
		return "Regime [getId()=" + getId() + ", getNome()=" + getNome() + ", getDescricao()=" + getDescricao()
				+ ", toString()=" + super.toString() + "]";
	}
    
    

 }
