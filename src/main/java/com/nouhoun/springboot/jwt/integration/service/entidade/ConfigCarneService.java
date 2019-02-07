/** create by system gera-java version 1.0.0 17/12/2018 21:23 : 42*/
 package com.nouhoun.springboot.jwt.integration.service.entidade;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfigCarne;



public interface ConfigCarneService {


public ConfigCarne findConfigCarneById(Integer id);
public ConfigCarne saveConfigCarne(ConfigCarne configcarne);
public ConfigCarne updateConfigCarne(ConfigCarne configcarne);
public List<ConfigCarne> findConfigCarneAll(PaginationFilter filter);
public ConfigCarne deleteConfigCarne(ConfigCarne configcarne);

}
