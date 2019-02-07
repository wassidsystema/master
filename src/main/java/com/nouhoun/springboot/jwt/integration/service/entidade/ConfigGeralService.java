/** create by system gera-java version 1.0.0 17/12/2018 21:23 : 42*/
 package com.nouhoun.springboot.jwt.integration.service.entidade;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfigGeral;



public interface ConfigGeralService {


public ConfigGeral findConfigGeralById(Integer id);
public ConfigGeral saveConfigGeral(ConfigGeral configgeral);
public ConfigGeral updateConfigGeral(ConfigGeral configgeral);
public List<ConfigGeral> findConfigGeralAll(PaginationFilter filter);
public ConfigGeral deleteConfigGeral(ConfigGeral configgeral);

}
