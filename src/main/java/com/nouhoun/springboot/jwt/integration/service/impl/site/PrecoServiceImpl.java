/** create by system gera-java version 1.0.0 13/12/2018 22:2 : 27*/

package com.nouhoun.springboot.jwt.integration.service.impl.site;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.site.Preco;
import com.nouhoun.springboot.jwt.integration.repository.site.PrecoRepository;
import com.nouhoun.springboot.jwt.integration.service.site.PrecoService;

@Service("precoService")
public class PrecoServiceImpl implements PrecoService {

	@Autowired
	private PrecoRepository precoRepository;

	@Override
	public Preco updatePreco(Preco preco) {
		return precoRepository.save(preco);
	}

	@Override
	public Preco savePreco(Preco preco) {
		return precoRepository.save(preco);
	}

	@Override
	public Preco findPrecoById(Integer id) {
		return precoRepository.findPrecoById(id);
	}

	@Override
	public List<Preco> findPrecoAll(PaginationFilter filter) {
		return precoRepository.findAll();
	}

	@Override
	public Preco deletePreco(Preco preco) {
		precoRepository.delete(preco);
		return preco;

	}

}
