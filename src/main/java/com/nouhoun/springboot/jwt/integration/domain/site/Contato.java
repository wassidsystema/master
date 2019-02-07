/** create by system gera-java version 1.0.0 13/12/2018 19:38 : 26*/
package com.nouhoun.springboot.jwt.integration.domain.site;


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
@Table(name = "CONTATO")
public class Contato 
{

    /** The econtabil id for the Contato. */
    @Id
    @Column(name = "CONTATO_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contato_seq")
    @SequenceGenerator(name = "contato_seq", sequenceName = "contato_seq", allocationSize = 1)
    private Integer id;

    /** The econtabil lido for the Contato. */
    @Column(name = "LIDO")
    private Integer lido;

    /** The econtabil dataContato for the Contato. */
    @Column(name = "DATACONTATO")
    private Long dataContato;

    /** The econtabil nome for the Contato. */
    @Column(name = "NOME")
    private String nome;

    /** The econtabil email for the Contato. */
    @Column(name = "EMAIL")
    private String email;

    /** The econtabil telefone for the Contato. */
    @Column(name = "TELEFONE")
    private String telefone;

    /** The econtabil assunto for the Contato. */
    @Column(name = "ASSUNTO")
    private String assunto;

    /** The econtabil texto for the Contato. */
    @Column(name = "TEXTO")
    private String texto;

    /** The econtabil motivoValue for the Contato. */
    @Column(name = "MOTIVOVALUE")
    private Integer motivoValue;

    /** The econtabil contatosList for the Contato. */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="contato_id", referencedColumnName="contato_id", nullable = false, insertable = false, updatable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private List<ContatoItens> contatosList;



    /**
     * Default constructor.
     */
    public Contato()
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
     * Gets the lido.
     *
     * @return the lido
     */
    public Integer getLido()
    {
        return lido;
    }

    /**
     * Sets the lido.
     *
* @param id the lido to set
 */
    public void setLido(Integer lido)
    {
        this.lido = lido;
    }

    /**
    /**
     * Gets the dataContato.
     *
     * @return the dataContato
     */
    public Long getDataContato()
    {
        return dataContato;
    }

    /**
     * Sets the datacontato.
     *
* @param id the datacontato to set
 */
    public void setDataContato(Long datacontato)
    {
        this.dataContato = datacontato;
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
     * Gets the telefone.
     *
     * @return the telefone
     */
    public String getTelefone()
    {
        return telefone;
    }

    /**
     * Sets the telefone.
     *
* @param id the telefone to set
 */
    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }

    /**
    /**
     * Gets the assunto.
     *
     * @return the assunto
     */
    public String getAssunto()
    {
        return assunto;
    }

    /**
     * Sets the assunto.
     *
* @param id the assunto to set
 */
    public void setAssunto(String assunto)
    {
        this.assunto = assunto;
    }

    /**
    /**
     * Gets the texto.
     *
     * @return the texto
     */
    public String getTexto()
    {
        return texto;
    }

    /**
     * Sets the texto.
     *
* @param id the texto to set
 */
    public void setTexto(String texto)
    {
        this.texto = texto;
    }

    /**
    /**
     * Gets the motivoValue.
     *
     * @return the motivoValue
     */
    public Integer getMotivoValue()
    {
        return motivoValue;
    }

    /**
     * Sets the motivovalue.
     *
* @param id the motivovalue to set
 */
    public void setMotivoValue(Integer motivovalue)
    {
        this.motivoValue = motivovalue;
    }

    /**
    /**
     * Gets the contatoslist.
     *
     * @return the contatoslist
     */
    public List<ContatoItens> getContatosList()
    {
        return contatosList;
    }

    /**
     * Sets the contatoslist.
     *
* @param id the contatoslist to set
 */
public void setContatosList(List<ContatoItens> contatoslist)
{
        this.contatosList = contatoslist;
    }

 }
