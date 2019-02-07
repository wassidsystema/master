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
@Table(name = "CONFIGCARNE")
public class ConfigCarne 
{

    /** The econtabil id for the ConfigCarne. */
    @Id
    @Column(name = "CONFIGCARNE_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "configCarne_seq")
    @SequenceGenerator(name = "configCarne_seq", sequenceName = "configCarne_seq", allocationSize = 1)
    private Integer id;
    
    @Column(name = "CONFIGURACAO_ID")
    private Integer confId;

    /** The econtabil carneBotelo for the ConfigCarne. */
    @Column(name = "CARNEBOTELO")
    private Integer carneBotelo;

    /** The econtabil carneNormal for the ConfigCarne. */
    @Column(name = "CARNENORMAL")
    private Integer carneNormal;

    /** The econtabil localPag for the ConfigCarne. */
    @Column(name = "LOCALPAG")
    private String localPag;

    /** The econtabil instr1 for the ConfigCarne. */
    @Column(name = "INSTR1")
    private String instr1;

    /** The econtabil instr2 for the ConfigCarne. */
    @Column(name = "INSTR2")
    private String instr2;

    /** The econtabil instr3 for the ConfigCarne. */
    @Column(name = "INSTR3")
    private String instr3;

    /** The econtabil instr4 for the ConfigCarne. */
    @Column(name = "INSTR4")
    private String instr4;



    /**
     * Default constructor.
     */
    public ConfigCarne()
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
     * Gets the carneBotelo.
     *
     * @return the carneBotelo
     */
    public Integer getCarneBotelo()
    {
        return carneBotelo;
    }

    /**
     * Sets the carnebotelo.
     *
* @param id the carnebotelo to set
 */
    public void setCarneBotelo(Integer carnebotelo)
    {
        this.carneBotelo = carnebotelo;
    }

    /**
    /**
     * Gets the carneNormal.
     *
     * @return the carneNormal
     */
    public Integer getCarneNormal()
    {
        return carneNormal;
    }

    /**
     * Sets the carnenormal.
     *
* @param id the carnenormal to set
 */
    public void setCarneNormal(Integer carnenormal)
    {
        this.carneNormal = carnenormal;
    }

    /**
    /**
     * Gets the localPag.
     *
     * @return the localPag
     */
    public String getLocalPag()
    {
        return localPag;
    }

    /**
     * Sets the localpag.
     *
* @param id the localpag to set
 */
    public void setLocalPag(String localpag)
    {
        this.localPag = localpag;
    }

    /**
    /**
     * Gets the instr1.
     *
     * @return the instr1
     */
    public String getInstr1()
    {
        return instr1;
    }

    /**
     * Sets the instr1.
     *
* @param id the instr1 to set
 */
    public void setInstr1(String instr1)
    {
        this.instr1 = instr1;
    }

    /**
    /**
     * Gets the instr2.
     *
     * @return the instr2
     */
    public String getInstr2()
    {
        return instr2;
    }

    /**
     * Sets the instr2.
     *
* @param id the instr2 to set
 */
    public void setInstr2(String instr2)
    {
        this.instr2 = instr2;
    }

    /**
    /**
     * Gets the instr3.
     *
     * @return the instr3
     */
    public String getInstr3()
    {
        return instr3;
    }

    /**
     * Sets the instr3.
     *
* @param id the instr3 to set
 */
    public void setInstr3(String instr3)
    {
        this.instr3 = instr3;
    }

    /**
    /**
     * Gets the instr4.
     *
     * @return the instr4
     */
    public String getInstr4()
    {
        return instr4;
    }

    /**
     * Sets the instr4.
     *
* @param id the instr4 to set
 */
    public void setInstr4(String instr4)
    {
        this.instr4 = instr4;
    }

 }
