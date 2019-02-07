/** create by system gera-java version 1.0.0 17/12/2018 21:35 : 42*/

package com.nouhoun.springboot.jwt.integration.service.impl.entidade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Arquivo;
import com.nouhoun.springboot.jwt.integration.repository.entidade.ArquivoRepository;
import com.nouhoun.springboot.jwt.integration.service.entidade.ArquivoService;

@Service("arquivoService")
public class ArquivoServiceImpl implements ArquivoService {

	@Autowired
	private ArquivoRepository arquivoRepository;

	@Override
	public Arquivo updateArquivo(Arquivo arquivo) {
		return arquivoRepository.save(arquivo);
	}

	@Override
	public Arquivo saveArquivo(Arquivo arquivo) {
		return arquivoRepository.save(arquivo);
	}

	@Override
	public Arquivo findArquivoById(Integer id) {
		return arquivoRepository.findArquivoById(id);
	}

	@Override
	public List<Arquivo> findArquivoAll(PaginationFilter filter) {
		return arquivoRepository.findAll();
	}

	@Override
	public Arquivo deleteArquivo(Arquivo arquivo) {
		arquivoRepository.delete(arquivo);
		return arquivo;

	}

}
