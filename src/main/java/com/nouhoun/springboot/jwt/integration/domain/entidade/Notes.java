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
@Table(name = "NOTES")
public class Notes 
{

    /** The econtabil id for the Notes. */
    @Id
    @Column(name = "NOTES_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "note_seq")
    @SequenceGenerator(name = "note_seq", sequenceName = "note_seq", allocationSize = 1)
    private Integer id;

    /** The econtabil noteText for the Notes. */
    @Column(name = "NOTETEXT")
    private String noteText;



    /**
     * Default constructor.
     */
    public Notes()
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
     * Gets the noteText.
     *
     * @return the noteText
     */
    public String getNoteText()
    {
        return noteText;
    }

    /**
     * Sets the notetext.
     *
* @param id the notetext to set
 */
    public void setNoteText(String notetext)
    {
        this.noteText = notetext;
    }

 }
