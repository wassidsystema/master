/** create by system gera-java version 1.0.0 17/12/2018 21:35 : 42*/

package com.nouhoun.springboot.jwt.integration.service.impl.entidade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Socio;
import com.nouhoun.springboot.jwt.integration.repository.entidade.SocioRepository;
import com.nouhoun.springboot.jwt.integration.service.entidade.SocioService;

@Service("socioService")
public class SocioServiceImpl implements SocioService {

	@Autowired
	private SocioRepository socioRepository;

	@Override
	public Socio updateSocio(Socio socio) {
		return socioRepository.save(socio);
	}

	@Override
	public Socio saveSocio(Socio socio) {
		return socioRepository.save(socio);
	}

	@Override
	public Socio findSocioById(Integer id) {
		return socioRepository.findSocioById(id);
	}

	@Override
	public List<Socio> findSocioAll(PaginationFilter filter) {
		return socioRepository.findAll();
	}

	@Override
	public Socio deleteSocio(Socio socio) {
		socioRepository.delete(socio);
		return socio;

	}

}
