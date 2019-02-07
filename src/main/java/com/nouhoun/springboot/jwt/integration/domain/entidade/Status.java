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
@Table(name = "STATUS")
public class Status 
{

    /** The econtabil id for the Status. */
    @Id
    @Column(name = "STATUS_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "status_seq")
    @SequenceGenerator(name = "status_seq", sequenceName = "status_seq", allocationSize = 1)
    private Integer id;

    /** The econtabil dataStatus for the Status. */
    @Column(name = "DATASTATUS")
    private Long dataStatus;

    /** The econtabil statusValue for the Status. */
    @Column(name = "STATUSVALUE")
    private Integer statusValue;

    /** The econtabil acaoEnumValue for the Status. */
    @Column(name = "ACAOENUMVALUE")
    private Integer acaoEnumValue;

    /** The econtabil note for the Status. */
    @Column(name = "NOTE")
    private String note;



    /**
     * Default constructor.
     */
    public Status()
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
     * Gets the dataStatus.
     *
     * @return the dataStatus
     */
    public Long getDataStatus()
    {
        return dataStatus;
    }

    /**
     * Sets the datastatus.
     *
* @param id the datastatus to set
 */
    public void setDataStatus(Long datastatus)
    {
        this.dataStatus = datastatus;
    }

    /**
    /**
     * Gets the statusValue.
     *
     * @return the statusValue
     */
    public Integer getStatusValue()
    {
        return statusValue;
    }

    /**
     * Sets the statusvalue.
     *
* @param id the statusvalue to set
 */
    public void setStatusValue(Integer statusvalue)
    {
        this.statusValue = statusvalue;
    }

    /**
    /**
     * Gets the acaoEnumValue.
     *
     * @return the acaoEnumValue
     */
    public Integer getAcaoEnumValue()
    {
        return acaoEnumValue;
    }

    /**
     * Sets the acaoenumvalue.
     *
* @param id the acaoenumvalue to set
 */
    public void setAcaoEnumValue(Integer acaoenumvalue)
    {
        this.acaoEnumValue = acaoenumvalue;
    }

    /**
    /**
     * Gets the note.
     *
     * @return the note
     */
    public String getNote()
    {
        return note;
    }

    /**
     * Sets the note.
     *
* @param id the note to set
 */
    public void setNote(String note)
    {
        this.note = note;
    }

 }
