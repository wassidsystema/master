/** create by system gera-java version 1.0.0 13/12/2018 22:2 : 27*/

package com.nouhoun.springboot.jwt.integration.service.impl.site;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.site.ContatoItens;
import com.nouhoun.springboot.jwt.integration.repository.site.ContatoItensRepository;
import com.nouhoun.springboot.jwt.integration.service.site.ContatoItensService;

@Service("contatoitensService")
public class ContatoItensServiceImpl implements ContatoItensService {

	@Autowired
	private ContatoItensRepository contatoitensRepository;

	@Override
	public ContatoItens updateContatoItens(ContatoItens contatoitens) {
		return contatoitensRepository.save(contatoitens);
	}

	@Override
	public ContatoItens saveContatoItens(ContatoItens contatoitens) {
		return contatoitensRepository.save(contatoitens);
	}

	@Override
	public ContatoItens findContatoItensById(Integer id) {
		return contatoitensRepository.findContatoItensById(id);
	}

	@Override
	public List<ContatoItens> findContatoItensAll(PaginationFilter filter) {
		return contatoitensRepository.findAll();
	}

	@Override
	public ContatoItens deleteContatoItens(ContatoItens contatoitens) {
		contatoitensRepository.delete(contatoitens);
		return contatoitens;

	}

}
