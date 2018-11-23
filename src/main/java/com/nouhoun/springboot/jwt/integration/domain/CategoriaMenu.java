/** create by system gera-java version 1.0.0 20/11/2018 21:33 : 59*/
package com.nouhoun.springboot.jwt.integration.domain;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */

@Entity
@Table(name = "CATEGORIAMENU")
public class CategoriaMenu 
{

    /** The econtabil id for the CategoriaMenu. */
    @Id
    @Column(name = "CATEGORIAMENU_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categoriamenu_seq")
    @SequenceGenerator(name = "categoriamenu_seq", sequenceName = "categoriamenu_seq", allocationSize = 1)
    private Integer id;

    /** The econtabil nome for the CategoriaMenu. */
    @Column(name = "NOME")
    private String nome;

//    /** The econtabil categoriaMenu_id for the CategoriaMenu. */
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name="categoriaMenu_id", referencedColumnName="categoriaMenu_id", nullable = false, insertable = true, updatable = true)
//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//    private List<Menu> categoriaMenu_id;



    /**
     * Default constructor.
     */
    public CategoriaMenu()
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

//    /**
//    /**
//     * Gets the categoriamenu_id.
//     *
//     * @return the categoriamenu_id
//     */
//    public List<Menu> getCategoriaMenu_id()
//    {
//        return categoriaMenu_id;
//    }
//
//    /**
//     * Sets the categoriamenu_id.
//     *
//* @param id the categoriamenu_id to set
// */
//public void setCategoriaMenu_id(List<Menu> categoriamenu_id)
//{
//        this.categoriaMenu_id = categoriamenu_id;
//    }

 }
