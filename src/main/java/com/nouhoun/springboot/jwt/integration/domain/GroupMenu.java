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
@Table(name = "GROUPMENU")
public class GroupMenu 
{

    /** The econtabil id for the GroupMenu. */
    @Id
    @Column(name = "GROUPMENU_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "groupmenu_seq")
    @SequenceGenerator(name = "groupmenu_seq", sequenceName = "groupmenu_seq", allocationSize = 1)
    private Integer id;
    
    @Column(name = "MENU_ID")
	private Integer menuId;

    /** The econtabil nome for the GroupMenu. */
    @Column(name = "NOME")
    private String nome;
    
	/** The econtabil nivel for the Menu. */
	@Column(name = "ORDER")
	private Integer order;
	
	@Column(name = "ICONE")
	private String icone;

	/** The econtabil pagina_id for the Menu. */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "GROUPMENU_ID", nullable = true, insertable = false, updatable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private List<Pagina> paginasss;



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


	

	public List<Pagina> getPaginasss() {
		return paginasss;
	}


	public void setPaginasss(List<Pagina> paginasss) {
		this.paginasss = paginasss;
	}


	public Integer getMenuId() {
		return menuId;
	}


	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}


	public Integer getOrder() {
		return order;
	}


	public void setOrder(Integer order) {
		this.order = order;
	}


	public String getIcone() {
		return icone;
	}


	public void setIcone(String icone) {
		this.icone = icone;
	}

 }
