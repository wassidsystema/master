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
@Table(name = "FIELD")
public class Field 
{

    /** The econtabil id for the Field. */
    @Id
    @Column(name = "FIELD_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "field_seq")
	@SequenceGenerator(name = "field_seq", sequenceName = "field_seq", allocationSize = 1)
    private Integer id;

    /** The econtabil tamanho for the Field. */
    @Column(name = "TAMANHO")
    private Integer tamanho;

    /** The econtabil tipo for the Field. */
    @Column(name = "TIPO")
    private String tipo;

    /** The econtabil requerid for the Field. */
    @Column(name = "REQUERID")
    private Integer requerid;

    /** The econtabil primaryKey for the Field. */
    @Column(name = "PRIMARYKEY")
    private Integer primaryKey;

    /** The econtabil forenkey for the Field. */
    @Column(name = "FORENKEY")
    private Integer forenkey;

    /** The econtabil model for the Field. */
    @Column(name = "MODEL")
    private Integer model;

    /** The econtabil xml for the Field. */
    @Column(name = "XML")
    private Integer xml;
    
    @Column(name = "entidade_id")
    private Integer entidadeId;
    
    @Column(name = "tab_id")
    private Integer tabId;



    /**
     * Default constructor.
     */
    public Field()
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
     * Gets the tamanho.
     *
     * @return the tamanho
     */
    public Integer getTamanho()
    {
        return tamanho;
    }

    /**
     * Sets the tamanho.
     *
* @param id the tamanho to set
 */
    public void setTamanho(Integer tamanho)
    {
        this.tamanho = tamanho;
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
     * Gets the requerid.
     *
     * @return the requerid
     */
    public Integer getRequerid()
    {
        return requerid;
    }

    /**
     * Sets the requerid.
     *
* @param id the requerid to set
 */
    public void setRequerid(Integer requerid)
    {
        this.requerid = requerid;
    }

    /**
    /**
     * Gets the primaryKey.
     *
     * @return the primaryKey
     */
    public Integer getPrimaryKey()
    {
        return primaryKey;
    }

    /**
     * Sets the primarykey.
     *
* @param id the primarykey to set
 */
    public void setPrimaryKey(Integer primarykey)
    {
        this.primaryKey = primarykey;
    }

    /**
    /**
     * Gets the forenkey.
     *
     * @return the forenkey
     */
    public Integer getForenkey()
    {
        return forenkey;
    }

    /**
     * Sets the forenkey.
     *
* @param id the forenkey to set
 */
    public void setForenkey(Integer forenkey)
    {
        this.forenkey = forenkey;
    }

    /**
    /**
     * Gets the model.
     *
     * @return the model
     */
    public Integer getModel()
    {
        return model;
    }

    /**
     * Sets the model.
     *
* @param id the model to set
 */
    public void setModel(Integer model)
    {
        this.model = model;
    }

    /**
    /**
     * Gets the xml.
     *
     * @return the xml
     */
    public Integer getXml()
    {
        return xml;
    }

    /**
     * Sets the xml.
     *
* @param id the xml to set
 */
    public void setXml(Integer xml)
    {
        this.xml = xml;
    }


	public Integer getEntidadeId() {
		return entidadeId;
	}


	public void setEntidadeId(Integer entidadeId) {
		this.entidadeId = entidadeId;
	}


	public Integer getTabId() {
		return tabId;
	}


	public void setTabId(Integer tabId) {
		this.tabId = tabId;
	}

 }
