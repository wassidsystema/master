/** create by system gera-java version 1.0.0 17/12/2018 21:35 : 42*/

package com.nouhoun.springboot.jwt.integration.service.impl.entidade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfiguracaoNFe;
import com.nouhoun.springboot.jwt.integration.repository.entidade.ConfiguracaoNFeRepository;
import com.nouhoun.springboot.jwt.integration.service.entidade.ConfiguracaoNFeService;

@Service("configuracaonfeService")
public class ConfiguracaoNFeServiceImpl implements ConfiguracaoNFeService {

	@Autowired
	private ConfiguracaoNFeRepository configuracaonfeRepository;

	@Override
	public ConfiguracaoNFe updateConfiguracaoNFe(ConfiguracaoNFe configuracaonfe) {
		return configuracaonfeRepository.save(configuracaonfe);
	}

	@Override
	public ConfiguracaoNFe saveConfiguracaoNFe(ConfiguracaoNFe configuracaonfe) {
		return configuracaonfeRepository.save(configuracaonfe);
	}

	@Override
	public ConfiguracaoNFe findConfiguracaoNFeById(Integer id) {
		return configuracaonfeRepository.findConfiguracaoNFeById(id);
	}

	@Override
	public List<ConfiguracaoNFe> findConfiguracaoNFeAll(PaginationFilter filter) {
		return configuracaonfeRepository.findAll();
	}

	@Override
	public ConfiguracaoNFe deleteConfiguracaoNFe(ConfiguracaoNFe configuracaonfe) {
		configuracaonfeRepository.delete(configuracaonfe);
		return configuracaonfe;

	}

}
