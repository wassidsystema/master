/** create by system gera-java version 1.0.0 17/12/2018 21:35 : 42*/

package com.nouhoun.springboot.jwt.integration.service.impl.entidade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfBlueSoft;
import com.nouhoun.springboot.jwt.integration.repository.entidade.ConfBlueSoftRepository;
import com.nouhoun.springboot.jwt.integration.service.entidade.ConfBlueSoftService;

@Service("confbluesoftService")
public class ConfBlueSoftServiceImpl implements ConfBlueSoftService {

	@Autowired
	private ConfBlueSoftRepository confbluesoftRepository;

	@Override
	public ConfBlueSoft updateConfBlueSoft(ConfBlueSoft confbluesoft) {
		return confbluesoftRepository.save(confbluesoft);
	}

	@Override
	public ConfBlueSoft saveConfBlueSoft(ConfBlueSoft confbluesoft) {
		return confbluesoftRepository.save(confbluesoft);
	}

	@Override
	public ConfBlueSoft findConfBlueSoftById(Integer id) {
		return confbluesoftRepository.findConfBlueSoftById(id);
	}

	@Override
	public List<ConfBlueSoft> findConfBlueSoftAll(PaginationFilter filter) {
		return confbluesoftRepository.findAll();
	}

	@Override
	public ConfBlueSoft deleteConfBlueSoft(ConfBlueSoft confbluesoft) {
		confbluesoftRepository.delete(confbluesoft);
		return confbluesoft;

	}

}
