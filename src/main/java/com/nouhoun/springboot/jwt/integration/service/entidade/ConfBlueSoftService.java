/** create by system gera-java version 1.0.0 17/12/2018 21:23 : 42*/
 package com.nouhoun.springboot.jwt.integration.service.entidade;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfBlueSoft;



public interface ConfBlueSoftService {


public ConfBlueSoft findConfBlueSoftById(Integer id);
public ConfBlueSoft saveConfBlueSoft(ConfBlueSoft confbluesoft);
public ConfBlueSoft updateConfBlueSoft(ConfBlueSoft confbluesoft);
public List<ConfBlueSoft> findConfBlueSoftAll(PaginationFilter filter);
public ConfBlueSoft deleteConfBlueSoft(ConfBlueSoft confbluesoft);

}
