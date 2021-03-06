/** create by system gera-java version 1.0.0 13/12/2018 21:53 : 11*/
 package com.nouhoun.springboot.jwt.integration.service.site;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.site.PlanoByEmpresa;



public interface PlanoByEmpresaService {


public PlanoByEmpresa findPlanoByEmpresaById(Integer id);
public PlanoByEmpresa savePlanoByEmpresa(PlanoByEmpresa planobyempresa);
public PlanoByEmpresa updatePlanoByEmpresa(PlanoByEmpresa planobyempresa);
public List<PlanoByEmpresa> findPlanoByEmpresaAll(PaginationFilter filter);
public PlanoByEmpresa deletePlanoByEmpresa(PlanoByEmpresa planobyempresa);

}
