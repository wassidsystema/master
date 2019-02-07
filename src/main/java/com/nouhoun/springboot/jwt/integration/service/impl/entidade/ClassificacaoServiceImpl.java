/** create by system gera-java version 1.0.0 17/12/2018 21:35 : 42*/

package com.nouhoun.springboot.jwt.integration.service.impl.entidade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Classificacao;
import com.nouhoun.springboot.jwt.integration.repository.entidade.ClassificacaoRepository;
import com.nouhoun.springboot.jwt.integration.service.entidade.ClassificacaoService;

@Service("classificacaoService")
public class ClassificacaoServiceImpl implements ClassificacaoService {

	@Autowired
	private ClassificacaoRepository classificacaoRepository;

	@Override
	public Classificacao updateClassificacao(Classificacao classificacao) {
		return classificacaoRepository.save(classificacao);
	}

	@Override
	public Classificacao saveClassificacao(Classificacao classificacao) {
		return classificacaoRepository.save(classificacao);
	}

	@Override
	public Classificacao findClassificacaoById(Integer id) {
		return classificacaoRepository.findClassificacaoById(id);
	}

	@Override
	public List<Classificacao> findClassificacaoAll(PaginationFilter filter) {
		return classificacaoRepository.findAll();
	}

	@Override
	public Classificacao deleteClassificacao(Classificacao classificacao) {
		classificacaoRepository.delete(classificacao);
		return classificacao;

	}

}
