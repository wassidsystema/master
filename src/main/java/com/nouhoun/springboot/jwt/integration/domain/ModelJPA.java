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
import com.nouhoun.springboot.jwt.integration.domain.DTO.entidade.ModelDTO.Action;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */

public class ModelJPA 
{

	public enum Action {
		INSERT, UPDATE, DELETE, NOME
	}

	@Column(name = "MODEMACTION")
	private Action modelAction;
	
	@Column(name = "MODIFYDATEUTC")
	private Long modifyDateUTC;
	
	@Column(name = "MODIFYUSER")
	private String modifyUser;
	
	@Column(name = "CREATEDATEUTC")
	private Long createDateUTC;
	
	@Column(name = "CREATEUSER")
	private String createUser;
	
	@Column(name = "PARENTID")
	private Integer parentId;
	
	@Column(name = "PROCESSID")
	private Integer processId;
	
	@Column(name = "TABLEENUMVALUE")
	private Integer tableEnumValue;

	public Action getModelAction() {
		return modelAction;
	}

	public void setModelAction(Action modelAction) {
		this.modelAction = modelAction;
	}

	public Long getModifyDateUTC() {
		return modifyDateUTC;
	}

	public void setModifyDateUTC(Long modifyDateUTC) {
		this.modifyDateUTC = modifyDateUTC;
	}

	public String getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}

	public Long getCreateDateUTC() {
		return createDateUTC;
	}

	public void setCreateDateUTC(Long createDateUTC) {
		this.createDateUTC = createDateUTC;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getProcessId() {
		return processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}

	public Integer getTableEnumValue() {
		return tableEnumValue;
	}

	public void setTableEnumValue(Integer tableEnumValue) {
		this.tableEnumValue = tableEnumValue;
	}

	@Override
	public String toString() {
		return "ModelJPA [getModelAction()=" + getModelAction() + ", getModifyDateUTC()=" + getModifyDateUTC()
				+ ", getModifyUser()=" + getModifyUser() + ", getCreateDateUTC()=" + getCreateDateUTC()
				+ ", getCreateUser()=" + getCreateUser() + ", getParentId()=" + getParentId() + ", getProcessId()="
				+ getProcessId() + ", getTableEnumValue()=" + getTableEnumValue() + ", toString()=" + super.toString()
				+ "]";
	}
	
 }
