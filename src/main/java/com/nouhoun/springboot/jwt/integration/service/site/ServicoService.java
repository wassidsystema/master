/** create by system gera-java version 1.0.0 13/12/2018 21:53 : 11*/
 package com.nouhoun.springboot.jwt.integration.service.site;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.site.Servico;



public interface ServicoService {


public Servico findServicoById(Integer id);
public Servico saveServico(Servico servico);
public Servico updateServico(Servico servico);
public List<Servico> findServicoAll(PaginationFilter filter);
public Servico deleteServico(Servico servico);

}
