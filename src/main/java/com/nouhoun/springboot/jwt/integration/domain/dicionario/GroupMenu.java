/** create by system gera-java version 1.0.0 20/11/2018 21:33 : 59*/
package com.nouhoun.springboot.jwt.integration.domain.dicionario;


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
@Table(name = "GROUPMENU")
public class GroupMenu 
{

    /** The econtabil id for the GroupMenu. */
    @Id
    @Column(name = "GROUPMENU_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "groupmenu_seq")
    @SequenceGenerator(name = "groupmenu_seq", sequenceName = "groupmenu_seq", allocationSize = 1)
    private Integer id;

    /** The econtabil nome for the GroupMenu. */
    @Column(name = "NOME")
    private String nome;

    /** The econtabil pagina_id for the GroupMenu. */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="groupMenu_id", referencedColumnName="groupMenu_id", nullable = false, insertable = true, updatable = true)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private List<CategoriaMenu> pagina_id;



    /**
     * Default constructor.
     */
    public GroupMenu()
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
     * Gets the pagina_id.
     *
     * @return the pagina_id
     */
    public List<CategoriaMenu> getPagina_id()
    {
        return pagina_id;
    }

    /**
     * Sets the pagina_id.
     *
* @param id the pagina_id to set
 */
public void setPagina_id(List<CategoriaMenu> pagina_id)
{
        this.pagina_id = pagina_id;
    }

 }
