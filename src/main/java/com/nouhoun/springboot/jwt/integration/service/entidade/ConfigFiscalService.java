/** create by system gera-java version 1.0.0 17/12/2018 21:23 : 42*/
 package com.nouhoun.springboot.jwt.integration.service.entidade;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfigFiscal;



public interface ConfigFiscalService {


public ConfigFiscal findConfigFiscalById(Integer id);
public ConfigFiscal saveConfigFiscal(ConfigFiscal configfiscal);
public ConfigFiscal updateConfigFiscal(ConfigFiscal configfiscal);
public List<ConfigFiscal> findConfigFiscalAll(PaginationFilter filter);
public ConfigFiscal deleteConfigFiscal(ConfigFiscal configfiscal);

}
