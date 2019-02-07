/** create by system gera-java version 1.0.0 17/12/2018 21:35 : 42*/

package com.nouhoun.springboot.jwt.integration.service.impl.entidade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Configuracao;
import com.nouhoun.springboot.jwt.integration.repository.entidade.ConfiguracaoRepository;
import com.nouhoun.springboot.jwt.integration.service.entidade.ConfiguracaoService;

@Service("configuracaoService")
public class ConfiguracaoServiceImpl implements ConfiguracaoService {

	@Autowired
	private ConfiguracaoRepository configuracaoRepository;

	@Override
	public Configuracao updateConfiguracao(Configuracao configuracao) {
		return configuracaoRepository.save(configuracao);
	}

	@Override
	public Configuracao saveConfiguracao(Configuracao configuracao) {
		return configuracaoRepository.save(configuracao);
	}

	@Override
	public Configuracao findConfiguracaoById(Integer id) {
		return configuracaoRepository.findConfiguracaoById(id);
	}

	@Override
	public List<Configuracao> findConfiguracaoAll(PaginationFilter filter) {
		return configuracaoRepository.findAll();
	}

	@Override
	public Configuracao deleteConfiguracao(Configuracao configuracao) {
		configuracaoRepository.delete(configuracao);
		return configuracao;

	}

}
