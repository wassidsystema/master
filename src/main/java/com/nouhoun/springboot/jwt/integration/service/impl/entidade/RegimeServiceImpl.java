/** create by system gera-java version 1.0.0 17/12/2018 21:35 : 42*/

package com.nouhoun.springboot.jwt.integration.service.impl.entidade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Regime;
import com.nouhoun.springboot.jwt.integration.repository.entidade.RegimeRepository;
import com.nouhoun.springboot.jwt.integration.service.entidade.RegimeService;

@Service("regimeService")
public class RegimeServiceImpl implements RegimeService {

	@Autowired
	private RegimeRepository regimeRepository;

	@Override
	public Regime updateRegime(Regime regime) {
		return regimeRepository.save(regime);
	}

	@Override
	public Regime saveRegime(Regime regime) {
		return regimeRepository.save(regime);
	}

	@Override
	public Regime findRegimeById(Integer id) {
		return regimeRepository.findRegimeById(id);
	}

	@Override
	public List<Regime> findRegimeAll(PaginationFilter filter) {
		return regimeRepository.findAll();
	}

	@Override
	public Regime deleteRegime(Regime regime) {
		regimeRepository.delete(regime);
		return regime;

	}

}
