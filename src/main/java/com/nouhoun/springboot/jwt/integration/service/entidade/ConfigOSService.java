/** create by system gera-java version 1.0.0 17/12/2018 21:23 : 42*/
 package com.nouhoun.springboot.jwt.integration.service.entidade;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfigOS;



public interface ConfigOSService {


public ConfigOS findConfigOSById(Integer id);
public ConfigOS saveConfigOS(ConfigOS configos);
public ConfigOS updateConfigOS(ConfigOS configos);
public List<ConfigOS> findConfigOSAll(PaginationFilter filter);
public ConfigOS deleteConfigOS(ConfigOS configos);

}
