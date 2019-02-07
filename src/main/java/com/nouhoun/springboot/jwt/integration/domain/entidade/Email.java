/** create by system gera-java version 1.0.0 17/12/2018 20:24 : 13*/
package com.nouhoun.springboot.jwt.integration.domain.entidade;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.nouhoun.springboot.jwt.integration.domain.ModelJPA;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */

@Entity
@Table(name = "EMAIL")
public class Email extends ModelJPA
{

    /** The econtabil id for the Email. */
    @Id
    @Column(name = "EMAIL_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "email_seq")
    @SequenceGenerator(name = "email_seq", sequenceName = "email_seq", allocationSize = 1)
    private Integer id;

    /** The econtabil typeValue for the Email. */
    @Column(name = "TYPEVALUE")
    private Integer typeValue;
    
    @Column(name = "ENTIDADE_ID")
    private Integer entidadeId;

    /** The econtabil email for the Email. */
    @Column(name = "EMAIL")
    private String email;

    /** The econtabil emailTypeEnumValue for the Email. */
    @Column(name = "EMAILTYPEENUMVALUE")
    private Integer emailTypeEnumValue;



    /**
     * Default constructor.
     */
    public Email()
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
     * Gets the typeValue.
     *
     * @return the typeValue
     */
    public Integer getTypeValue()
    {
        return typeValue;
    }

    /**
     * Sets the typevalue.
     *
* @param id the typevalue to set
 */
    public void setTypeValue(Integer typevalue)
    {
        this.typeValue = typevalue;
    }

    /**
    /**
     * Gets the email.
     *
     * @return the email
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * Sets the email.
     *
* @param id the email to set
 */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
    /**
     * Gets the emailTypeEnumValue.
     *
     * @return the emailTypeEnumValue
     */
    public Integer getEmailTypeEnumValue()
    {
        return emailTypeEnumValue;
    }

    /**
     * Sets the emailtypeenumvalue.
     *
* @param id the emailtypeenumvalue to set
 */
    public void setEmailTypeEnumValue(Integer emailtypeenumvalue)
    {
        this.emailTypeEnumValue = emailtypeenumvalue;
    }


	public Integer getEntidadeId() {
		return entidadeId;
	}


	public void setEntidadeId(Integer entidadeId) {
		this.entidadeId = entidadeId;
	}


	@Override
	public String toString() {
		return "Email [getId()=" + getId() + ", getTypeValue()=" + getTypeValue() + ", getEmail()=" + getEmail()
				+ ", getEmailTypeEnumValue()=" + getEmailTypeEnumValue() + ", getEntidadeId()=" + getEntidadeId()
				+ ", toString()=" + super.toString() + "]";
	}

 }
