/** create by system gera-java version 1.0.0 17/12/2018 21:35 : 42*/

package com.nouhoun.springboot.jwt.integration.service.impl.entidade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Cnae;
import com.nouhoun.springboot.jwt.integration.repository.entidade.CnaeRepository;
import com.nouhoun.springboot.jwt.integration.service.entidade.CnaeService;

@Service("cnaeService")
public class CnaeServiceImpl implements CnaeService {

	@Autowired
	private CnaeRepository cnaeRepository;

	@Override
	public Cnae updateCnae(Cnae cnae) {
		return cnaeRepository.save(cnae);
	}

	@Override
	public Cnae saveCnae(Cnae cnae) {
		return cnaeRepository.save(cnae);
	}

	@Override
	public Cnae findCnaeById(Integer id) {
		return cnaeRepository.findCnaeById(id);
	}

	@Override
	public List<Cnae> findCnaeAll(PaginationFilter filter) {
		return cnaeRepository.findAll();
	}

	@Override
	public Cnae deleteCnae(Cnae cnae) {
		cnaeRepository.delete(cnae);
		return cnae;

	}

}
