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
@Table(name = "ARQUIVO")
public class Arquivo 
{

    /** The econtabil id for the Arquivo. */
    @Id
    @Column(name = "ARQUIVO_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "arquivo_seq")
    @SequenceGenerator(name = "arquivo_seq", sequenceName = "arquivo_seq", allocationSize = 1)
    private Integer id;

    /** The econtabil nome for the Arquivo. */
    @Column(name = "NOME")
    private String nome;

    /** The econtabil local for the Arquivo. */
    @Column(name = "LOCAL")
    private String local;

    /** The econtabil tipo for the Arquivo. */
    @Column(name = "TIPO")
    private String tipo;

    /** The econtabil tamanho for the Arquivo. */
    @Column(name = "TAMANHO")
    private String tamanho;



    /**
     * Default constructor.
     */
    public Arquivo()
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
     * Gets the local.
     *
     * @return the local
     */
    public String getLocal()
    {
        return local;
    }

    /**
     * Sets the local.
     *
* @param id the local to set
 */
    public void setLocal(String local)
    {
        this.local = local;
    }

    /**
    /**
     * Gets the tipo.
     *
     * @return the tipo
     */
    public String getTipo()
    {
        return tipo;
    }

    /**
     * Sets the tipo.
     *
* @param id the tipo to set
 */
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    /**
    /**
     * Gets the tamanho.
     *
     * @return the tamanho
     */
    public String getTamanho()
    {
        return tamanho;
    }

    /**
     * Sets the tamanho.
     *
* @param id the tamanho to set
 */
    public void setTamanho(String tamanho)
    {
        this.tamanho = tamanho;
    }

 }
