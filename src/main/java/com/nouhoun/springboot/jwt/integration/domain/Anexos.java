/** create by system gera-java version 1.0.0 20/11/2018 21:33 : 59*/
package com.nouhoun.springboot.jwt.integration.domain;


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
@Table(name = "ANEXOS")
public class Anexos 
{

    /** The econtabil id for the Help. */
    @Id
    @Column(name = "ANEXO_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "anexo_seq")
    @SequenceGenerator(name = "anexo_seq", sequenceName = "anexo_seq", allocationSize = 1)
    private Integer id;

    /** The econtabil titulo for the Help. */
    @Column(name = "Descricao")
    private String descricao;

    /** The econtabil status for the Help. */
    @Column(name = "TIPO")
    private Integer tipo;

    /** The econtabil texto for the Help. */
    @Column(name = "ARQUIVO")
    private String arquivo;
    
    



    /**
     * Default constructor.
     */
    public Anexos()
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


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Integer getTipo() {
		return tipo;
	}


	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}


	public String getArquivo() {
		return arquivo;
	}


	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}

 }
