/** create by system gera-java version 1.0.0 17/12/2018 20:24 : 13*/
package com.nouhoun.springboot.jwt.integration.domain.entidade;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.nouhoun.springboot.jwt.integration.domain.Cidade;
import com.nouhoun.springboot.jwt.integration.domain.ModelJPA;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */

@Entity
@Table(name = "ENDERECO")
public class Endereco extends ModelJPA
{

    /** The econtabil id for the Endereco. */
    @Id
    @Column(name = "ENDERECO_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "endereco_seq")
    @SequenceGenerator(name = "endereco_seq", sequenceName = "endereco_seq", allocationSize = 1)
    private Integer id;

    /** The econtabil codIbge for the Endereco. */
    @Column(name = "CODIBGE")
    private String codIbge;

    /** The econtabil pais for the Endereco. */
    @Column(name = "PAIS")
    private Integer pais;
    
    @Column(name = "ENTIDADE_ID")
    private Integer entidadeId;

    /** The econtabil logradouro for the Endereco. */
    @Column(name = "LOGRADOURO")
    private String logradouro;

    /** The econtabil bairro for the Endereco. */
    @Column(name = "BAIRRO")
    private String bairro;

    /** The econtabil numero for the Endereco. */
    @Column(name = "NUMERO")
    private String numero;

    /** The econtabil enderecoTypeValue for the Endereco. */
    @Column(name = "ENDERECOTYPEVALUE")
    private Integer enderecoTypeValue;

    /** The econtabil cep for the Endereco. */
    @Column(name = "CEP")
    private String cep;

    /** The econtabil latitude for the Endereco. */
    @Column(name = "LATITUDE")
    private Double latitude;

    /** The econtabil longitude for the Endereco. */
    @Column(name = "LONGITUDE")
    private Double longitude;

    /** The econtabil complemento for the Endereco. */
    @Column(name = "COMPLEMENTO")
    private String complemento;

    /** The econtabil cidade for the Endereco. */
    @Column(name = "CIDADE_ID")
    private Integer cidadeId;
    
    @OneToOne(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
    @JoinColumn(name = "CIDADE_ID",insertable = false, unique = false, nullable = false, updatable = false)
    private Cidade cidade;



    /**
     * Default constructor.
     */
    public Endereco()
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
     * Gets the codIbge.
     *
     * @return the codIbge
     */
    public String getCodIbge()
    {
        return codIbge;
    }

    /**
     * Sets the codibge.
     *
* @param id the codibge to set
 */
    public void setCodIbge(String codibge)
    {
        this.codIbge = codibge;
    }

    /**
    /**
     * Gets the pais.
     *
     * @return the pais
     */
    public Integer getPais()
    {
        return pais;
    }

    /**
     * Sets the pais.
     *
* @param id the pais to set
 */
    public void setPais(Integer pais)
    {
        this.pais = pais;
    }

    /**
    /**
     * Gets the logradouro.
     *
     * @return the logradouro
     */
    public String getLogradouro()
    {
        return logradouro;
    }

    /**
     * Sets the logradouro.
     *
* @param id the logradouro to set
 */
    public void setLogradouro(String logradouro)
    {
        this.logradouro = logradouro;
    }

    /**
    /**
     * Gets the bairro.
     *
     * @return the bairro
     */
    public String getBairro()
    {
        return bairro;
    }

    /**
     * Sets the bairro.
     *
* @param id the bairro to set
 */
    public void setBairro(String bairro)
    {
        this.bairro = bairro;
    }

    /**
    /**
     * Gets the numero.
     *
     * @return the numero
     */
    public String getNumero()
    {
        return numero;
    }

    /**
     * Sets the numero.
     *
* @param id the numero to set
 */
    public void setNumero(String numero)
    {
        this.numero = numero;
    }

    /**
    /**
     * Gets the enderecoTypeValue.
     *
     * @return the enderecoTypeValue
     */
    public Integer getEnderecoTypeValue()
    {
        return enderecoTypeValue;
    }

    /**
     * Sets the enderecotypevalue.
     *
* @param id the enderecotypevalue to set
 */
    public void setEnderecoTypeValue(Integer enderecotypevalue)
    {
        this.enderecoTypeValue = enderecotypevalue;
    }

    /**
    /**
     * Gets the cep.
     *
     * @return the cep
     */
    public String getCep()
    {
        return cep;
    }

    /**
     * Sets the cep.
     *
* @param id the cep to set
 */
    public void setCep(String cep)
    {
        this.cep = cep;
    }

    /**
    /**
     * Gets the latitude.
     *
     * @return the latitude
     */
    public Double getLatitude()
    {
        return latitude;
    }

    /**
     * Sets the latitude.
     *
* @param id the latitude to set
 */
    public void setLatitude(Double latitude)
    {
        this.latitude = latitude;
    }

    /**
    /**
     * Gets the longitude.
     *
     * @return the longitude
     */
    public Double getLongitude()
    {
        return longitude;
    }

    /**
     * Sets the longitude.
     *
* @param id the longitude to set
 */
    public void setLongitude(Double longitude)
    {
        this.longitude = longitude;
    }

    /**
    /**
     * Gets the complemento.
     *
     * @return the complemento
     */
    public String getComplemento()
    {
        return complemento;
    }

    /**
     * Sets the complemento.
     *
* @param id the complemento to set
 */
    public void setComplemento(String complemento)
    {
        this.complemento = complemento;
    }

    /**
    /**
     * Gets the cidade.
     *
     * @return the cidade
     */
    public Cidade getCidade()
    {
        return cidade;
    }

    /**
     * Sets the cidade.
     *
* @param id the cidade to set
 */
    public void setCidade(Cidade cidade)
    {
        this.cidade = cidade;
    }


	public Integer getEntidadeId() {
		return entidadeId;
	}


	public void setEntidadeId(Integer entidadeId) {
		this.entidadeId = entidadeId;
	}


	public Integer getCidadeId() {
		return cidadeId;
	}


	public void setCidadeId(Integer cidadeId) {
		this.cidadeId = cidadeId;
	}


	@Override
	public String toString() {
		return "Endereco [getId()=" + getId() + ", getCodIbge()=" + getCodIbge() + ", getPais()=" + getPais()
				+ ", getLogradouro()=" + getLogradouro() + ", getBairro()=" + getBairro() + ", getNumero()="
				+ getNumero() + ", getEnderecoTypeValue()=" + getEnderecoTypeValue() + ", getCep()=" + getCep()
				+ ", getLatitude()=" + getLatitude() + ", getLongitude()=" + getLongitude() + ", getComplemento()="
				+ getComplemento() + ", getCidade()=" + getCidade() + ", getEntidadeId()=" + getEntidadeId()
				+ ", getCidadeId()=" + getCidadeId() + ", toString()=" + super.toString() + "]";
	}

 }
