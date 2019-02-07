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
@Table(name = "CONFBLUESOFT")
public class ConfBlueSoft 
{

    /** The econtabil id for the ConfBlueSoft. */
    @Id
    @Column(name = "CONFBLUESOFT_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "confBlueSoft_seq")
    @SequenceGenerator(name = "confBlueSoft_seq", sequenceName = "confBlueSoft_seq", allocationSize = 1)
    private Integer id;
    
    @Column(name = "CONFIGURACAO_ID")
    private Integer confId;

    /** The econtabil ativBlue for the ConfBlueSoft. */
    @Column(name = "ATIVBLUE")
    private Integer ativBlue;

    /** The econtabil url for the ConfBlueSoft. */
    @Column(name = "URL")
    private String url;

    /** The econtabil token for the ConfBlueSoft. */
    @Column(name = "TOKEN")
    private String token;



    /**
     * Default constructor.
     */
    public ConfBlueSoft()
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
     * Gets the ativBlue.
     *
     * @return the ativBlue
     */
    public Integer getAtivBlue()
    {
        return ativBlue;
    }

    /**
     * Sets the ativblue.
     *
* @param id the ativblue to set
 */
    public void setAtivBlue(Integer ativblue)
    {
        this.ativBlue = ativblue;
    }

    /**
    /**
     * Gets the url.
     *
     * @return the url
     */
    public String getUrl()
    {
        return url;
    }

    /**
     * Sets the url.
     *
* @param id the url to set
 */
    public void setUrl(String url)
    {
        this.url = url;
    }

    /**
    /**
     * Gets the token.
     *
     * @return the token
     */
    public String getToken()
    {
        return token;
    }

    /**
     * Sets the token.
     *
* @param id the token to set
 */
    public void setToken(String token)
    {
        this.token = token;
    }

 }
