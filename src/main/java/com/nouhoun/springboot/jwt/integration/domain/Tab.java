/** create by system gera-java version 1.0.0 20/11/2018 21:33 : 59*/
package com.nouhoun.springboot.jwt.integration.domain;

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
 * This class is a representation of an Account (i.e Checking, Savings, etc.).
 * This represents an account for a transfer setting.
 */

@Entity
@Table(name = "TAB")
public class Tab {

	/** The econtabil id for the Tab. */
	@Id
	@Column(name = "TAB_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tab_seq")
	@SequenceGenerator(name = "tab_seq", sequenceName = "tab_seq", allocationSize = 1)
	private Integer id;

	/** The econtabil nome for the Tab. */
	@Column(name = "NOME")
	private String nome;

	/** The econtabil label for the Tab. */
	@Column(name = "LABEL")
	private String label;

	/** The econtabil order for the Tab. */
	@Column(name = "ORDERS")
	private Integer order;
	
	@Column(name = "pagina_id")
	private Integer pagina_id;

	/** The econtabil fields for the Tab. */
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "tab_id", referencedColumnName = "tab_id", nullable = false, insertable = false, updatable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private List<Field> fields;

	/**
	 * Default constructor.
	 */
	public Tab() {
		super();
	}

	/**
	 * /** Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * /** Gets the nome.
	 *
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Sets the nome.
	 *
	 * @param id the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * /** Gets the label.
	 *
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * Sets the label.
	 *
	 * @param id the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * /** Gets the order.
	 *
	 * @return the order
	 */
	public Integer getOrder() {
		return order;
	}

	/**
	 * Sets the order.
	 *
	 * @param id the order to set
	 */
	public void setOrder(Integer order) {
		this.order = order;
	}

	public Integer getPagina_id() {
		return pagina_id;
	}

	public void setPagina_id(Integer pagina_id) {
		this.pagina_id = pagina_id;
	}

	public List<Field> getFields() {
		return fields;
	}

	public void setFields(List<Field> fields) {
		this.fields = fields;
	}

}
