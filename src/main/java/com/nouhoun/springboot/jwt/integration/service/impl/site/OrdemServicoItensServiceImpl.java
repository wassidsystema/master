/** create by system gera-java version 1.0.0 13/12/2018 22:2 : 27*/

package com.nouhoun.springboot.jwt.integration.service.impl.site;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.site.OrdemServicoItens;
import com.nouhoun.springboot.jwt.integration.repository.site.OrdemServicoItensRepository;
import com.nouhoun.springboot.jwt.integration.service.site.OrdemServicoItensService;

@Service("ordemservicoitensService")
public class OrdemServicoItensServiceImpl implements OrdemServicoItensService {

	@Autowired
	private OrdemServicoItensRepository ordemservicoitensRepository;

	@Override
	public OrdemServicoItens updateOrdemServicoItens(OrdemServicoItens ordemservicoitens) {
		return ordemservicoitensRepository.save(ordemservicoitens);
	}

	@Override
	public OrdemServicoItens saveOrdemServicoItens(OrdemServicoItens ordemservicoitens) {
		return ordemservicoitensRepository.save(ordemservicoitens);
	}

	@Override
	public OrdemServicoItens findOrdemServicoItensById(Integer id) {
		return ordemservicoitensRepository.findOrdemServicoItensById(id);
	}

	@Override
	public List<OrdemServicoItens> findOrdemServicoItensAll(PaginationFilter filter) {
		return ordemservicoitensRepository.findAll();
	}

	@Override
	public OrdemServicoItens deleteOrdemServicoItens(OrdemServicoItens ordemservicoitens) {
		ordemservicoitensRepository.delete(ordemservicoitens);
		return ordemservicoitens;

	}

}
