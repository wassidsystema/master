/** create by system gera-java version 1.0.0 17/12/2018 21:35 : 42*/

package com.nouhoun.springboot.jwt.integration.service.impl.entidade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfigProduto;
import com.nouhoun.springboot.jwt.integration.repository.entidade.ConfigProdutoRepository;
import com.nouhoun.springboot.jwt.integration.service.entidade.ConfigProdutoService;

@Service("configprodutoService")
public class ConfigProdutoServiceImpl implements ConfigProdutoService {

	@Autowired
	private ConfigProdutoRepository configprodutoRepository;

	@Override
	public ConfigProduto updateConfigProduto(ConfigProduto configproduto) {
		return configprodutoRepository.save(configproduto);
	}

	@Override
	public ConfigProduto saveConfigProduto(ConfigProduto configproduto) {
		return configprodutoRepository.save(configproduto);
	}

	@Override
	public ConfigProduto findConfigProdutoById(Integer id) {
		return configprodutoRepository.findConfigProdutoById(id);
	}

	@Override
	public List<ConfigProduto> findConfigProdutoAll(PaginationFilter filter) {
		return configprodutoRepository.findAll();
	}

	@Override
	public ConfigProduto deleteConfigProduto(ConfigProduto configproduto) {
		configprodutoRepository.delete(configproduto);
		return configproduto;

	}

}
