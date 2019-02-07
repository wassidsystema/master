/** create by system gera-java version 1.0.0 13/12/2018 22:2 : 27*/

package com.nouhoun.springboot.jwt.integration.service.impl.site;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.site.Contato;
import com.nouhoun.springboot.jwt.integration.repository.site.ContatoRepository;
import com.nouhoun.springboot.jwt.integration.service.site.ContatoService;

@Service("contatoService")
public class ContatoServiceImpl implements ContatoService {

	@Autowired
	private ContatoRepository contatoRepository;

	@Override
	public Contato updateContato(Contato contato) {
		return contatoRepository.save(contato);
	}

	@Override
	public Contato saveContato(Contato contato) {
		return contatoRepository.save(contato);
	}

	@Override
	public Contato findContatoById(Integer id) {
		return contatoRepository.findContatoById(id);
	}

	@Override
	public List<Contato> findContatoAll(PaginationFilter filter) {
		return contatoRepository.findAll();
	}

	@Override
	public Contato deleteContato(Contato contato) {
		contatoRepository.delete(contato);
		return contato;

	}

}
