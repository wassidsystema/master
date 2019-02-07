/** create by system gera-java version 1.0.0 13/12/2018 22:2 : 27*/

package com.nouhoun.springboot.jwt.integration.service.impl.site;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.site.Servico;
import com.nouhoun.springboot.jwt.integration.repository.site.ServicoRepository;
import com.nouhoun.springboot.jwt.integration.service.site.ServicoService;

@Service("servicoService")
public class ServicoServiceImpl implements ServicoService {

	@Autowired
	private ServicoRepository servicoRepository;

	@Override
	public Servico updateServico(Servico servico) {
		return servicoRepository.save(servico);
	}

	@Override
	public Servico saveServico(Servico servico) {
		return servicoRepository.save(servico);
	}

	@Override
	public Servico findServicoById(Integer id) {
		return servicoRepository.findServicoById(id);
	}

	@Override
	public List<Servico> findServicoAll(PaginationFilter filter) {
		return servicoRepository.findAll();
	}

	@Override
	public Servico deleteServico(Servico servico) {
		servicoRepository.delete(servico);
		return servico;

	}

}
