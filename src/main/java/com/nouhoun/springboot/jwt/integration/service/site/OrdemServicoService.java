/** create by system gera-java version 1.0.0 13/12/2018 21:53 : 11*/
 package com.nouhoun.springboot.jwt.integration.service.site;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.site.OrdemServico;



public interface OrdemServicoService {


public OrdemServico findOrdemServicoById(Integer id);
public OrdemServico saveOrdemServico(OrdemServico ordemservico);
public OrdemServico updateOrdemServico(OrdemServico ordemservico);
public List<OrdemServico> findOrdemServicoAll(PaginationFilter filter);
public OrdemServico deleteOrdemServico(OrdemServico ordemservico);

}
