/** create by system gera-java version 1.0.0 17/12/2018 21:23 : 42*/
 package com.nouhoun.springboot.jwt.integration.service.entidade;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Boleto;



public interface BoletoService {


public Boleto findBoletoById(Integer id);
public Boleto saveBoleto(Boleto boleto);
public Boleto updateBoleto(Boleto boleto);
public List<Boleto> findBoletoAll(PaginationFilter filter);
public Boleto deleteBoleto(Boleto boleto);

}
