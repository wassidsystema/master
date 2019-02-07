/** create by system gera-java version 1.0.0 17/12/2018 21:23 : 42*/
 package com.nouhoun.springboot.jwt.integration.service.entidade;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Cnae;



public interface CnaeService {


public Cnae findCnaeById(Integer id);
public Cnae saveCnae(Cnae cnae);
public Cnae updateCnae(Cnae cnae);
public List<Cnae> findCnaeAll(PaginationFilter filter);
public Cnae deleteCnae(Cnae cnae);

}
