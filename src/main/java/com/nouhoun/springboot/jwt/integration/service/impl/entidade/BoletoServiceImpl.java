/** create by system gera-java version 1.0.0 17/12/2018 21:35 : 42*/

package com.nouhoun.springboot.jwt.integration.service.impl.entidade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Boleto;
import com.nouhoun.springboot.jwt.integration.repository.entidade.BoletoRepository;
import com.nouhoun.springboot.jwt.integration.service.entidade.BoletoService;

@Service("boletoService")
public class BoletoServiceImpl implements BoletoService {

	@Autowired
	private BoletoRepository boletoRepository;

	@Override
	public Boleto updateBoleto(Boleto boleto) {
		return boletoRepository.save(boleto);
	}

	@Override
	public Boleto saveBoleto(Boleto boleto) {
		return boletoRepository.save(boleto);
	}

	@Override
	public Boleto findBoletoById(Integer id) {
		return boletoRepository.findBoletoById(id);
	}

	@Override
	public List<Boleto> findBoletoAll(PaginationFilter filter) {
		return boletoRepository.findAll();
	}

	@Override
	public Boleto deleteBoleto(Boleto boleto) {
		boletoRepository.delete(boleto);
		return boleto;

	}

}
