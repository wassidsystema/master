/** create by system gera-java version 1.0.0 13/12/2018 19:38 : 26*/
package com.nouhoun.springboot.jwt.integration.domain.site;


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
@Table(name = "CONTATOITENS")
public class ContatoItens 
{

    /** The econtabil id for the ContatoItens. */
    @Id
    @Column(name = "CONTATOITENS_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contatoitens_seq")
    @SequenceGenerator(name = "contatoitens_seq", sequenceName = "contatoitens_seq", allocationSize = 1)
    private Integer id;

    /** The econtabil dataAlt for the ContatoItens. */
    @Column(name = "DATAALT")
    private Long dataAlt;

    /** The econtabil texto for the ContatoItens. */
    @Column(name = "TEXTO")
    private String texto;

    /** The econtabil titulo for the ContatoItens. */
    @Column(name = "TITULO")
    private String titulo;

    /** The econtabil contatoStatus for the ContatoItens. */
    @Column(name = "CONTATOSTATUS")
    private Integer contatoStatus;

    /** The econtabil visto for the ContatoItens. */
    @Column(name = "VISTO")
    private Boolean visto;



    /**
     * Default constructor.
     */
    public ContatoItens()
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
     * Gets the dataAlt.
     *
     * @return the dataAlt
     */
    public Long getDataAlt()
    {
        return dataAlt;
    }

    /**
     * Sets the dataalt.
     *
* @param id the dataalt to set
 */
    public void setDataAlt(Long dataalt)
    {
        this.dataAlt = dataalt;
    }

    /**
    /**
     * Gets the texto.
     *
     * @return the texto
     */
    public String getTexto()
    {
        return texto;
    }

    /**
     * Sets the texto.
     *
* @param id the texto to set
 */
    public void setTexto(String texto)
    {
        this.texto = texto;
    }

    /**
    /**
     * Gets the titulo.
     *
     * @return the titulo
     */
    public String getTitulo()
    {
        return titulo;
    }

    /**
     * Sets the titulo.
     *
* @param id the titulo to set
 */
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    /**
    /**
     * Gets the contatoStatus.
     *
     * @return the contatoStatus
     */
    public Integer getContatoStatus()
    {
        return contatoStatus;
    }

    /**
     * Sets the contatostatus.
     *
* @param id the contatostatus to set
 */
    public void setContatoStatus(Integer contatostatus)
    {
        this.contatoStatus = contatostatus;
    }

    /**
    /**
     * Gets the visto.
     *
     * @return the visto
     */
    public Boolean getVisto()
    {
        return visto;
    }

    /**
     * Sets the visto.
     *
* @param id the visto to set
 */
    public void setVisto(Boolean visto)
    {
        this.visto = visto;
    }

 }
