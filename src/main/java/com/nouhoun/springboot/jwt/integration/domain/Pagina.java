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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */

@Entity
@Table(name = "PAGINA")
public class Pagina 
{

    /** The econtabil id for the Pagina. */
    @Id
    @Column(name = "PAGINA_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pagina_seq")
    @SequenceGenerator(name = "pagina_seq", sequenceName = "pagina_seq", allocationSize = 1)
    private Integer id;
    
    @Column(name = "GROUPMENU_ID")
    private Integer groupMenuId;

    /** The econtabil pagina for the Pagina. */
    @Column(name = "PAGINA")
    private String pagina;
    
    @Column(name = "ENTIDADE_ID")
    private Integer entidadeId;
    
    @Column(name = "EXISTE_PAG", nullable = false,  columnDefinition = "Integer default 0")
    private Integer existe;
    
    @Column(name = "pagina_fisica", nullable = false,  columnDefinition = "String default 0")
    private String paginaFisica;

    /** The econtabil status for the Pagina. */
    @Column(name = "STATUS")
    private Integer status;

    /** The econtabil help for the Pagina. */
    @OneToOne(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
    @JoinColumn(name = "help_id",insertable = false, unique = false, nullable = true, updatable = false)
    private Help help;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="pagina_id", nullable = false, insertable = false, updatable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private List<Tab> tabs;



    /**
     * Default constructor.
     */
    public Pagina()
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
     * Gets the pagina.
     *
     * @return the pagina
     */
    public String getPagina()
    {
        return pagina;
    }

    /**
     * Sets the pagina.
     *
* @param id the pagina to set
 */
    public void setPagina(String pagina)
    {
        this.pagina = pagina;
    }

    /**
    /**
     * Gets the status.
     *
     * @return the status
     */
    public Integer getStatus()
    {
        return status;
    }

    /**
     * Sets the status.
     *
* @param id the status to set
 */
    public void setStatus(Integer status)
    {
        this.status = status;
    }


	public Integer getEntidadeId() {
		return entidadeId;
	}


	public void setEntidadeId(Integer entidadeId) {
		this.entidadeId = entidadeId;
	}


	public Integer getExiste() {
		return existe;
	}


	public void setExiste(Integer existe) {
		this.existe = existe;
	}


	public String getPaginaFisica() {
		return paginaFisica;
	}


	public void setPaginaFisica(String paginaFisica) {
		this.paginaFisica = paginaFisica;
	}


	public Help getHelp() {
		return help;
	}


	public void setHelp(Help help) {
		this.help = help;
	}


	public List<Tab> getTabs() {
		return tabs;
	}


	public void setTabs(List<Tab> tabs) {
		this.tabs = tabs;
	}


	public Integer getGroupMenuId() {
		return groupMenuId;
	}


	public void setGroupMenuId(Integer groupMenuId) {
		this.groupMenuId = groupMenuId;
	}
	
	

//    /**
//    /**
//     * Gets the help.
//     *
//     * @return the help
//     */
//    public Help getHelp()
//    {
//        return help;
//    }
//
//    /**
//     * Sets the help.
//     *
//* @param id the help to set
// */
//    public void setHelp(Help help)
//    {
//        this.help = help;
//    }
//
//
//
//
//	public List<Tab> getTabs() {
//		return tabs;
//	}
//
//
//	public void setTabs(List<Tab> tabs) {
//		this.tabs = tabs;
//	}



 }
