package com.nouhoun.springboot.jwt.integration.domain.DTO.entidade;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import com.nouhoun.springboot.jwt.integration.domain.Cidade;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.).
 * This represents an account for a transfer setting.
 */
@SuppressWarnings("serial")
public class EnderecoDTO extends ModelDTO {

	private Integer id;
	private String codIbge;
	private Integer pais;
    private Integer entidadeId;
    private String logradouro;
    private String bairro;
    private String numero;
    private Integer enderecoTypeValue;
    private String cep;
    private Double latitude;
    private Double longitude;
    private String complemento;
    private Integer cidadeId;
    private Cidade cidade;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ConfiguracaoDTO [getId()=" + getId() + ", toString()=" + super.toString() + "]";
	}

}