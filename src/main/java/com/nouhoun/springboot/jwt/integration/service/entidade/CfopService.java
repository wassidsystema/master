/** create by system gera-java version 1.0.0 17/12/2018 21:23 : 42*/
 package com.nouhoun.springboot.jwt.integration.service.entidade;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Cfop;



public interface CfopService {


public Cfop findCfopById(Integer id);
public Cfop saveCfop(Cfop cfop);
public Cfop updateCfop(Cfop cfop);
public List<Cfop> findCfopAll(PaginationFilter filter);
public Cfop deleteCfop(Cfop cfop);

}
