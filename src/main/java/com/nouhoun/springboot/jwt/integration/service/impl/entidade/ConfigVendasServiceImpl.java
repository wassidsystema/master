/** create by system gera-java version 1.0.0 17/12/2018 21:35 : 42*/

package com.nouhoun.springboot.jwt.integration.service.impl.entidade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfigVendas;
import com.nouhoun.springboot.jwt.integration.repository.entidade.ConfigVendasRepository;
import com.nouhoun.springboot.jwt.integration.service.entidade.ConfigVendasService;

@Service("configvendasService")
public class ConfigVendasServiceImpl implements ConfigVendasService {

	@Autowired
	private ConfigVendasRepository configvendasRepository;

	@Override
	public ConfigVendas updateConfigVendas(ConfigVendas configvendas) {
		return configvendasRepository.save(configvendas);
	}

	@Override
	public ConfigVendas saveConfigVendas(ConfigVendas configvendas) {
		return configvendasRepository.save(configvendas);
	}

	@Override
	public ConfigVendas findConfigVendasById(Integer id) {
		return configvendasRepository.findConfigVendasById(id);
	}

	@Override
	public List<ConfigVendas> findConfigVendasAll(PaginationFilter filter) {
		return configvendasRepository.findAll();
	}

	@Override
	public ConfigVendas deleteConfigVendas(ConfigVendas configvendas) {
		configvendasRepository.delete(configvendas);
		return configvendas;

	}

}
