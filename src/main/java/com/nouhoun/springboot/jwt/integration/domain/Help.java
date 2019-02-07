/** create by system gera-java version 1.0.0 20/11/2018 21:33 : 59*/
package com.nouhoun.springboot.jwt.integration.domain;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */

@Entity
@Table(name = "HELP")
public class Help 
{

    /** The econtabil id for the Help. */
    @Id
    @Column(name = "HELP_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "help_seq")
    @SequenceGenerator(name = "help_seq", sequenceName = "help_seq", allocationSize = 1)
    private Integer id;

    /** The econtabil titulo for the Help. */
    @Column(name = "TITULO")
    private String titulo;

    /** The econtabil texto for the Help. */
    @Column(name = "TEXTO")
    private String texto;
//    
//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(
//            name = "HELP_ANEXOS",
//            joinColumns = {@JoinColumn(name = "HELP_ID", referencedColumnName = "ID")},
//            inverseJoinColumns = {@JoinColumn(name = "ANEXO_ID", referencedColumnName = "ID")})
//    private List<Anexos> anexosList;



    /**
     * Default constructor.
     */
    public Help()
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


//	public List<Anexos> getAnexosList() {
//		return anexosList;
//	}
//
//
//	public void setAnexosList(List<Anexos> anexosList) {
//		this.anexosList = anexosList;
//	}
    
    

 }
