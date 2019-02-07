/** create by system gera-java version 1.0.0 17/12/2018 21:35 : 42*/

package com.nouhoun.springboot.jwt.integration.service.impl.entidade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfigSMTP;
import com.nouhoun.springboot.jwt.integration.repository.entidade.ConfigSMTPRepository;
import com.nouhoun.springboot.jwt.integration.service.entidade.ConfigSMTPService;

@Service("configsmtpService")
public class ConfigSMTPServiceImpl implements ConfigSMTPService {

	@Autowired
	private ConfigSMTPRepository configsmtpRepository;

	@Override
	public ConfigSMTP updateConfigSMTP(ConfigSMTP configsmtp) {
		return configsmtpRepository.save(configsmtp);
	}

	@Override
	public ConfigSMTP saveConfigSMTP(ConfigSMTP configsmtp) {
		return configsmtpRepository.save(configsmtp);
	}

	@Override
	public ConfigSMTP findConfigSMTPById(Integer id) {
		return configsmtpRepository.findConfigSMTPById(id);
	}

	@Override
	public List<ConfigSMTP> findConfigSMTPAll(PaginationFilter filter) {
		return configsmtpRepository.findAll();
	}

	@Override
	public ConfigSMTP deleteConfigSMTP(ConfigSMTP configsmtp) {
		configsmtpRepository.delete(configsmtp);
		return configsmtp;

	}

}
