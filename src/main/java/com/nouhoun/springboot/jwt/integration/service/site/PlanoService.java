/** create by system gera-java version 1.0.0 13/12/2018 21:53 : 11*/
 package com.nouhoun.springboot.jwt.integration.service.site;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.site.Plano;



public interface PlanoService {


public Plano findPlanoById(Integer id);
public Plano savePlano(Plano plano);
public Plano updatePlano(Plano plano);
public List<Plano> findPlanoAll(PaginationFilter filter);
public Plano deletePlano(Plano plano);

}
