/** create by system gera-java version 1.0.0 17/12/2018 21:35 : 42*/

package com.nouhoun.springboot.jwt.integration.service.impl.entidade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfigFiscal;
import com.nouhoun.springboot.jwt.integration.repository.entidade.ConfigFiscalRepository;
import com.nouhoun.springboot.jwt.integration.service.entidade.ConfigFiscalService;

@Service("configfiscalService")
public class ConfigFiscalServiceImpl implements ConfigFiscalService {

	@Autowired
	private ConfigFiscalRepository configfiscalRepository;

	@Override
	public ConfigFiscal updateConfigFiscal(ConfigFiscal configfiscal) {
		return configfiscalRepository.save(configfiscal);
	}

	@Override
	public ConfigFiscal saveConfigFiscal(ConfigFiscal configfiscal) {
		return configfiscalRepository.save(configfiscal);
	}

	@Override
	public ConfigFiscal findConfigFiscalById(Integer id) {
		return configfiscalRepository.findConfigFiscalById(id);
	}

	@Override
	public List<ConfigFiscal> findConfigFiscalAll(PaginationFilter filter) {
		return configfiscalRepository.findAll();
	}

	@Override
	public ConfigFiscal deleteConfigFiscal(ConfigFiscal configfiscal) {
		configfiscalRepository.delete(configfiscal);
		return configfiscal;

	}

}
