package com.nouhoun.springboot.jwt.integration.domain.DTO.entidade;

import java.util.List;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.).
 * This represents an account for a transfer setting.
 */
@SuppressWarnings("serial")
public class EmpresaDTO extends EntidadeDTO {

	private List<PlanoDTO> planoList;

	private Integer qntFilial;

	private Integer qntDeposito;

	private List<FilialDTO> filialList;

	private List<DepositoDTO> depositoList;

	private List<ContaCorrenteDTO> contaCorrenteList;

	private List<TarefaEntDTO> tarefaList;

	public EmpresaDTO() {
		super();
	}

	public List<PlanoDTO> getPlanoList() {
		return planoList;
	}

	public void setPlanoList(List<PlanoDTO> planoList) {
		this.planoList = planoList;
	}

	public Integer getQntFilial() {
		return qntFilial;
	}

	public void setQntFilial(Integer qntFilial) {
		this.qntFilial = qntFilial;
	}

	public Integer getQntDeposito() {
		return qntDeposito;
	}

	public void setQntDeposito(Integer qntDeposito) {
		this.qntDeposito = qntDeposito;
	}

	public List<FilialDTO> getFilialList() {
		return filialList;
	}

	public void setFilialList(List<FilialDTO> filialList) {
		this.filialList = filialList;
	}

	public List<DepositoDTO> getDepositoList() {
		return depositoList;
	}

	public void setDepositoList(List<DepositoDTO> depositoList) {
		this.depositoList = depositoList;
	}

	public List<ContaCorrenteDTO> getContaCorrenteList() {
		return contaCorrenteList;
	}

	public void setContaCorrenteList(List<ContaCorrenteDTO> contaCorrenteList) {
		this.contaCorrenteList = contaCorrenteList;
	}

	public List<TarefaEntDTO> getTarefaList() {
		return tarefaList;
	}

	public void setTarefaList(List<TarefaEntDTO> tarefaList) {
		this.tarefaList = tarefaList;
	}

	@Override
	public String toString() {
		return "EmpresaDTO [getPlanoList()=" + getPlanoList() + ", getQntFilial()=" + getQntFilial()
				+ ", getQntDeposito()=" + getQntDeposito() + ", getFilialList()=" + getFilialList()
				+ ", getDepositoList()=" + getDepositoList() + ", getContaCorrenteList()=" + getContaCorrenteList()
				+ ", getTarefaList()=" + getTarefaList() + ", toString()=" + super.toString() + "]";
	}

}