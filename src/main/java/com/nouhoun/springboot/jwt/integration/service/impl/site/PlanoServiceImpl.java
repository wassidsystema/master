/** create by system gera-java version 1.0.0 13/12/2018 22:2 : 27*/

package com.nouhoun.springboot.jwt.integration.service.impl.site;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.site.Plano;
import com.nouhoun.springboot.jwt.integration.repository.site.PlanoRepository;
import com.nouhoun.springboot.jwt.integration.service.site.PlanoService;

@Service("planoService")
public class PlanoServiceImpl implements PlanoService {

	@Autowired
	private PlanoRepository planoRepository;

	@Override
	public Plano updatePlano(Plano plano) {
		return planoRepository.save(plano);
	}

	@Override
	public Plano savePlano(Plano plano) {
		return planoRepository.save(plano);
	}

	@Override
	public Plano findPlanoById(Integer id) {
		return planoRepository.findPlanoById(id);
	}

	@Override
	public List<Plano> findPlanoAll(PaginationFilter filter) {
		return planoRepository.findAll();
	}

	@Override
	public Plano deletePlano(Plano plano) {
		planoRepository.delete(plano);
		return plano;

	}

}
