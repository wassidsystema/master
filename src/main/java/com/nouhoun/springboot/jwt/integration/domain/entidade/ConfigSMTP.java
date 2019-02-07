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
@Table(name = "CONFIGSMTP")
public class ConfigSMTP 
{

    /** The econtabil id for the ConfigSMTP. */
    @Id
    @Column(name = "CONFIGSMTP_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "configSMTP_seq")
    @SequenceGenerator(name = "configSMTP_seq", sequenceName = "configSMTP_seq", allocationSize = 1)
    private Integer id;
    
    @Column(name = "CONFIGURACAO_ID")
    private Integer confId;

    /** The econtabil servSMTP for the ConfigSMTP. */
    @Column(name = "SERVSMTP")
    private String servSMTP;

    /** The econtabil porta for the ConfigSMTP. */
    @Column(name = "PORTA")
    private String porta;

    /** The econtabil endEmail for the ConfigSMTP. */
    @Column(name = "ENDEMAIL")
    private String endEmail;

    /** The econtabil usuario for the ConfigSMTP. */
    @Column(name = "USUARIO")
    private String usuario;

    /** The econtabil senha for the ConfigSMTP. */
    @Column(name = "SENHA")
    private String senha;

    /** The econtabil seguranca for the ConfigSMTP. */
    @Column(name = "SEGURANCA")
    private Integer seguranca;

    /** The econtabil ativSMTP for the ConfigSMTP. */
    @Column(name = "ATIVSMTP")
    private Integer ativSMTP;



    /**
     * Default constructor.
     */
    public ConfigSMTP()
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
     * Gets the servSMTP.
     *
     * @return the servSMTP
     */
    public String getServSMTP()
    {
        return servSMTP;
    }

    /**
     * Sets the servsmtp.
     *
* @param id the servsmtp to set
 */
    public void setServSMTP(String servsmtp)
    {
        this.servSMTP = servsmtp;
    }

    /**
    /**
     * Gets the porta.
     *
     * @return the porta
     */
    public String getPorta()
    {
        return porta;
    }

    /**
     * Sets the porta.
     *
* @param id the porta to set
 */
    public void setPorta(String porta)
    {
        this.porta = porta;
    }

    /**
    /**
     * Gets the endEmail.
     *
     * @return the endEmail
     */
    public String getEndEmail()
    {
        return endEmail;
    }

    /**
     * Sets the endemail.
     *
* @param id the endemail to set
 */
    public void setEndEmail(String endemail)
    {
        this.endEmail = endemail;
    }

    /**
    /**
     * Gets the usuario.
     *
     * @return the usuario
     */
    public String getUsuario()
    {
        return usuario;
    }

    /**
     * Sets the usuario.
     *
* @param id the usuario to set
 */
    public void setUsuario(String usuario)
    {
        this.usuario = usuario;
    }

    /**
    /**
     * Gets the senha.
     *
     * @return the senha
     */
    public String getSenha()
    {
        return senha;
    }

    /**
     * Sets the senha.
     *
* @param id the senha to set
 */
    public void setSenha(String senha)
    {
        this.senha = senha;
    }

    /**
    /**
     * Gets the seguranca.
     *
     * @return the seguranca
     */
    public Integer getSeguranca()
    {
        return seguranca;
    }

    /**
     * Sets the seguranca.
     *
* @param id the seguranca to set
 */
    public void setSeguranca(Integer seguranca)
    {
        this.seguranca = seguranca;
    }

    /**
    /**
     * Gets the ativSMTP.
     *
     * @return the ativSMTP
     */
    public Integer getAtivSMTP()
    {
        return ativSMTP;
    }

    /**
     * Sets the ativsmtp.
     *
* @param id the ativsmtp to set
 */
    public void setAtivSMTP(Integer ativsmtp)
    {
        this.ativSMTP = ativsmtp;
    }

 }
