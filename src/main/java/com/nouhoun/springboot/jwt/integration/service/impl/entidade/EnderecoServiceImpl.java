/** create by system gera-java version 1.0.0 17/12/2018 21:35 : 42*/

package com.nouhoun.springboot.jwt.integration.service.impl.entidade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Endereco;
import com.nouhoun.springboot.jwt.integration.repository.entidade.EnderecoRepository;
import com.nouhoun.springboot.jwt.integration.service.entidade.EnderecoService;

@Service("enderecoService")
public class EnderecoServiceImpl implements EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;

	@Override
	public Endereco updateEndereco(Endereco endereco) {
		return enderecoRepository.save(endereco);
	}

	@Override
	public Endereco saveEndereco(Endereco endereco) {
		return enderecoRepository.save(endereco);
	}

	@Override
	public Endereco findEnderecoById(Integer id) {
		return enderecoRepository.findEnderecoById(id);
	}

	@Override
	public List<Endereco> findEnderecoAll(PaginationFilter filter) {
		return enderecoRepository.findAll();
	}

	@Override
	public Endereco deleteEndereco(Endereco endereco) {
		enderecoRepository.delete(endereco);
		return endereco;

	}

}
