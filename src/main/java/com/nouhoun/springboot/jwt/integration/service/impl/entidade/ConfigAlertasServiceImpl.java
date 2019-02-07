/** create by system gera-java version 1.0.0 17/12/2018 21:35 : 42*/

package com.nouhoun.springboot.jwt.integration.service.impl.entidade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfigAlertas;
import com.nouhoun.springboot.jwt.integration.repository.entidade.ConfigAlertasRepository;
import com.nouhoun.springboot.jwt.integration.service.entidade.ConfigAlertasService;

@Service("configalertasService")
public class ConfigAlertasServiceImpl implements ConfigAlertasService {

	@Autowired
	private ConfigAlertasRepository configalertasRepository;

	@Override
	public ConfigAlertas updateConfigAlertas(ConfigAlertas configalertas) {
		return configalertasRepository.save(configalertas);
	}

	@Override
	public ConfigAlertas saveConfigAlertas(ConfigAlertas configalertas) {
		return configalertasRepository.save(configalertas);
	}

	@Override
	public ConfigAlertas findConfigAlertasById(Integer id) {
		return configalertasRepository.findConfigAlertasById(id);
	}

	@Override
	public List<ConfigAlertas> findConfigAlertasAll(PaginationFilter filter) {
		return configalertasRepository.findAll();
	}

	@Override
	public ConfigAlertas deleteConfigAlertas(ConfigAlertas configalertas) {
		configalertasRepository.delete(configalertas);
		return configalertas;

	}

}
