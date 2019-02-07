/** create by system gera-java version 1.0.0 17/12/2018 21:35 : 42*/

package com.nouhoun.springboot.jwt.integration.service.impl.entidade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Telefone;
import com.nouhoun.springboot.jwt.integration.repository.entidade.TelefoneRepository;
import com.nouhoun.springboot.jwt.integration.service.entidade.TelefoneService;

@Service("telefoneService")
public class TelefoneServiceImpl implements TelefoneService {

	@Autowired
	private TelefoneRepository telefoneRepository;

	@Override
	public Telefone updateTelefone(Telefone telefone) {
		return telefoneRepository.save(telefone);
	}

	@Override
	public Telefone saveTelefone(Telefone telefone) {
		return telefoneRepository.save(telefone);
	}

	@Override
	public Telefone findTelefoneById(Integer id) {
		return telefoneRepository.findTelefoneById(id);
	}

	@Override
	public List<Telefone> findTelefoneAll(PaginationFilter filter) {
		return telefoneRepository.findAll();
	}

	@Override
	public Telefone deleteTelefone(Telefone telefone) {
		telefoneRepository.delete(telefone);
		return telefone;

	}

}
