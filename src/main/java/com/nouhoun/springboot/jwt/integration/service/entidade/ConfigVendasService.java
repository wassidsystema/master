/** create by system gera-java version 1.0.0 17/12/2018 21:23 : 42*/
 package com.nouhoun.springboot.jwt.integration.service.entidade;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfigVendas;



public interface ConfigVendasService {


public ConfigVendas findConfigVendasById(Integer id);
public ConfigVendas saveConfigVendas(ConfigVendas configvendas);
public ConfigVendas updateConfigVendas(ConfigVendas configvendas);
public List<ConfigVendas> findConfigVendasAll(PaginationFilter filter);
public ConfigVendas deleteConfigVendas(ConfigVendas configvendas);

}
