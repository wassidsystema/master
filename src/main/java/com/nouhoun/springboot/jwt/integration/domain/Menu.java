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
@Table(name = "MENU")
public class Menu {

	/** The econtabil id for the Menu. */
	@Id
	@Column(name = "MENU_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "menu_seq")
	@SequenceGenerator(name = "menu_seq", sequenceName = "menu_seq", allocationSize = 1)
	private Integer id;

	/** The econtabil nome for the Menu. */
	@Column(name = "NOME")
	private String nome;

	/** The econtabil label for the Menu. */
	@Column(name = "LABEL")
	private String label;

	/** The econtabil status for the Menu. */
	@Column(name = "STATUS")
	private Integer status;

	/** The econtabil nivel for the Menu. */
	@Column(name = "NIVEL")
	private Integer nivel;
	
	@Column(name = "ICON")
	private String icon;
	
	/** The econtabil pagina_id for the Menu. */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="MENU_ID", nullable = false, insertable = false, updatable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private List<GroupMenu> groupMenu;

	/**
	 * Default constructor.
	 */
	public Menu() {
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
	 * /** Gets the status.
	 *
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param id the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * /** Gets the nivel.
	 *
	 * @return the nivel
	 */
	public Integer getNivel() {
		return nivel;
	}

	/**
	 * Sets the nivel.
	 *
	 * @param id the nivel to set
	 */
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public List<GroupMenu> getGroupMenu() {
		return groupMenu;
	}

	public void setGroupMenu(List<GroupMenu> groupMenu) {
		this.groupMenu = groupMenu;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

}
