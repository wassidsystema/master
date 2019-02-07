/** create by system gera-java version 1.0.0 17/12/2018 21:35 : 42*/

package com.nouhoun.springboot.jwt.integration.service.impl.entidade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfigEntrada;
import com.nouhoun.springboot.jwt.integration.repository.entidade.ConfigEntradaRepository;
import com.nouhoun.springboot.jwt.integration.service.entidade.ConfigEntradaService;

@Service("configentradaService")
public class ConfigEntradaServiceImpl implements ConfigEntradaService {

	@Autowired
	private ConfigEntradaRepository configentradaRepository;

	@Override
	public ConfigEntrada updateConfigEntrada(ConfigEntrada configentrada) {
		return configentradaRepository.save(configentrada);
	}

	@Override
	public ConfigEntrada saveConfigEntrada(ConfigEntrada configentrada) {
		return configentradaRepository.save(configentrada);
	}

	@Override
	public ConfigEntrada findConfigEntradaById(Integer id) {
		return configentradaRepository.findConfigEntradaById(id);
	}

	@Override
	public List<ConfigEntrada> findConfigEntradaAll(PaginationFilter filter) {
		return configentradaRepository.findAll();
	}

	@Override
	public ConfigEntrada deleteConfigEntrada(ConfigEntrada configentrada) {
		configentradaRepository.delete(configentrada);
		return configentrada;

	}

}
