/** create by system gera-java version 1.0.0 17/12/2018 21:35 : 42*/

package com.nouhoun.springboot.jwt.integration.service.impl.entidade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfigGeral;
import com.nouhoun.springboot.jwt.integration.repository.entidade.ConfigGeralRepository;
import com.nouhoun.springboot.jwt.integration.service.entidade.ConfigGeralService;

@Service("configgeralService")
public class ConfigGeralServiceImpl implements ConfigGeralService {

	@Autowired
	private ConfigGeralRepository configgeralRepository;

	@Override
	public ConfigGeral updateConfigGeral(ConfigGeral configgeral) {
		return configgeralRepository.save(configgeral);
	}

	@Override
	public ConfigGeral saveConfigGeral(ConfigGeral configgeral) {
		return configgeralRepository.save(configgeral);
	}

	@Override
	public ConfigGeral findConfigGeralById(Integer id) {
		return configgeralRepository.findConfigGeralById(id);
	}

	@Override
	public List<ConfigGeral> findConfigGeralAll(PaginationFilter filter) {
		return configgeralRepository.findAll();
	}

	@Override
	public ConfigGeral deleteConfigGeral(ConfigGeral configgeral) {
		configgeralRepository.delete(configgeral);
		return configgeral;

	}

}
