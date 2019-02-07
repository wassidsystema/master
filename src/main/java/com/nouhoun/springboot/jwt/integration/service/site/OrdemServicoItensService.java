/** create by system gera-java version 1.0.0 13/12/2018 21:53 : 11*/
 package com.nouhoun.springboot.jwt.integration.service.site;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.site.OrdemServicoItens;



public interface OrdemServicoItensService  {


public OrdemServicoItens findOrdemServicoItensById(Integer id);
public OrdemServicoItens saveOrdemServicoItens(OrdemServicoItens ordemservicoitens);
public OrdemServicoItens updateOrdemServicoItens(OrdemServicoItens ordemservicoitens);
public List<OrdemServicoItens> findOrdemServicoItensAll(PaginationFilter filter);
public OrdemServicoItens deleteOrdemServicoItens(OrdemServicoItens ordemservicoitens);

}
