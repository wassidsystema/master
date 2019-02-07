/** create by system gera-java version 1.0.0 17/12/2018 21:35 : 42*/

package com.nouhoun.springboot.jwt.integration.service.impl.entidade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfigCarne;
import com.nouhoun.springboot.jwt.integration.repository.entidade.ConfigCarneRepository;
import com.nouhoun.springboot.jwt.integration.service.entidade.ConfigCarneService;

@Service("configcarneService")
public class ConfigCarneServiceImpl implements ConfigCarneService {

	@Autowired
	private ConfigCarneRepository configcarneRepository;

	@Override
	public ConfigCarne updateConfigCarne(ConfigCarne configcarne) {
		return configcarneRepository.save(configcarne);
	}

	@Override
	public ConfigCarne saveConfigCarne(ConfigCarne configcarne) {
		return configcarneRepository.save(configcarne);
	}

	@Override
	public ConfigCarne findConfigCarneById(Integer id) {
		return configcarneRepository.findConfigCarneById(id);
	}

	@Override
	public List<ConfigCarne> findConfigCarneAll(PaginationFilter filter) {
		return configcarneRepository.findAll();
	}

	@Override
	public ConfigCarne deleteConfigCarne(ConfigCarne configcarne) {
		configcarneRepository.delete(configcarne);
		return configcarne;

	}

}
