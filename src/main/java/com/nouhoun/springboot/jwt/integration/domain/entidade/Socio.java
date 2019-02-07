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

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */

@Entity
@Table(name = "SOCIO")
public class Socio extends ModelJPA
{

    /** The econtabil id for the Socio. */
    @Id
    @Column(name = "SOCIO_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "socio_seq")
    @SequenceGenerator(name = "socio_seq", sequenceName = "socio_seq", allocationSize = 1)
    private Integer id;
    
    @Column(name = "ENTIDADE_ID")
    private Integer entidadeId;

    /** The econtabil socioAdm for the Socio. */
    @Column(name = "SOCIOADM")
    private Integer socioAdm;

    /** The econtabil pessoa for the Socio. */
    @Column(name = "PESSOA")
    private Integer pessoa;

    /** The econtabil nome for the Socio. */
    @Column(name = "NOME")
    private String nome;

    /** The econtabil valorProlabore for the Socio. */
    @Column(name = "VALORPROLABORE")
    private Double valorProlabore;

    /** The econtabil dataProlabore for the Socio. */
    @Column(name = "DATAPROLABORE")
    private Long dataProlabore;

    /** The econtabil cota for the Socio. */
    @Column(name = "COTA")
    private Double cota;

    /** The econtabil porcentagem for the Socio. */
    @Column(name = "PORCENTAGEM")
    private String porcentagem;



    /**
     * Default constructor.
     */
    public Socio()
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
     * Gets the socioAdm.
     *
     * @return the socioAdm
     */
    public Integer getSocioAdm()
    {
        return socioAdm;
    }

    /**
     * Sets the socioadm.
     *
* @param id the socioadm to set
 */
    public void setSocioAdm(Integer socioadm)
    {
        this.socioAdm = socioadm;
    }

    /**
    /**
     * Gets the pessoa.
     *
     * @return the pessoa
     */
    public Integer getPessoa()
    {
        return pessoa;
    }

    /**
     * Sets the pessoa.
     *
* @param id the pessoa to set
 */
    public void setPessoa(Integer pessoa)
    {
        this.pessoa = pessoa;
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
     * Gets the valorProlabore.
     *
     * @return the valorProlabore
     */
    public Double getValorProlabore()
    {
        return valorProlabore;
    }

    /**
     * Sets the valorprolabore.
     *
* @param id the valorprolabore to set
 */
    public void setValorProlabore(Double valorprolabore)
    {
        this.valorProlabore = valorprolabore;
    }

    /**
    /**
     * Gets the dataProlabore.
     *
     * @return the dataProlabore
     */
    public Long getDataProlabore()
    {
        return dataProlabore;
    }

    /**
     * Sets the dataprolabore.
     *
* @param id the dataprolabore to set
 */
    public void setDataProlabore(Long dataprolabore)
    {
        this.dataProlabore = dataprolabore;
    }

    /**
    /**
     * Gets the cota.
     *
     * @return the cota
     */
    public Double getCota()
    {
        return cota;
    }

    /**
     * Sets the cota.
     *
* @param id the cota to set
 */
    public void setCota(Double cota)
    {
        this.cota = cota;
    }

    /**
    /**
     * Gets the porcentagem.
     *
     * @return the porcentagem
     */
    public String getPorcentagem()
    {
        return porcentagem;
    }

    /**
     * Sets the porcentagem.
     *
* @param id the porcentagem to set
 */
    public void setPorcentagem(String porcentagem)
    {
        this.porcentagem = porcentagem;
    }


	public Integer getEntidadeId() {
		return entidadeId;
	}


	public void setEntidadeId(Integer entidadeId) {
		this.entidadeId = entidadeId;
	}


	@Override
	public String toString() {
		return "Socio [getId()=" + getId() + ", getSocioAdm()=" + getSocioAdm() + ", getPessoa()=" + getPessoa()
				+ ", getNome()=" + getNome() + ", getValorProlabore()=" + getValorProlabore() + ", getDataProlabore()="
				+ getDataProlabore() + ", getCota()=" + getCota() + ", getPorcentagem()=" + getPorcentagem()
				+ ", getEntidadeId()=" + getEntidadeId() + ", toString()=" + super.toString() + "]";
	}

 }
