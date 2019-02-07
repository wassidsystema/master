/** create by system gera-java version 1.0.0 17/12/2018 21:23 : 42*/
 package com.nouhoun.springboot.jwt.integration.service.entidade;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfigEntrada;



public interface ConfigEntradaService {


public ConfigEntrada findConfigEntradaById(Integer id);
public ConfigEntrada saveConfigEntrada(ConfigEntrada configentrada);
public ConfigEntrada updateConfigEntrada(ConfigEntrada configentrada);
public List<ConfigEntrada> findConfigEntradaAll(PaginationFilter filter);
public ConfigEntrada deleteConfigEntrada(ConfigEntrada configentrada);

}
