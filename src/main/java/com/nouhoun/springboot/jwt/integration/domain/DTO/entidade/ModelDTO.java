package com.nouhoun.springboot.jwt.integration.domain.DTO.entidade;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.domain.entidade.Entidade;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.).
 * This represents an account for a transfer setting.
 */
@SuppressWarnings("serial")
public class ModelDTO {
	public enum Action {
		INSERT, UPDATE, DELETE, NOME
	}

	private Action modelAction;
	private Long modifyDateUTC;
	private String modifyUser;
	private Long createDateUTC;
	private String createUser;
	private Integer parentId;
	private Integer processId;
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
		return "ModelDTO [getModelAction()=" + getModelAction() + ", getModifyDateUTC()=" + getModifyDateUTC()
				+ ", getModifyUser()=" + getModifyUser() + ", getCreateDateUTC()=" + getCreateDateUTC()
				+ ", getCreateUser()=" + getCreateUser() + ", getParentId()=" + getParentId() + ", getProcessId()="
				+ getProcessId() + ", getTableEnumValue()=" + getTableEnumValue() + ", toString()=" + super.toString()
				+ "]";
	}

}