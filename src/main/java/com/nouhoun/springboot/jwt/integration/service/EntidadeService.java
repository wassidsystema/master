/** create by system gera-java version 1.0.0 22/11/2018 23:10 : 51*/
 package com.nouhoun.springboot.jwt.integration.service;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.Entidade;



public interface EntidadeService {


public Entidade findEntidadeById(Integer id);
public Entidade saveEntidade(Entidade entidade);
public Entidade updateEntidade(Entidade entidade);
public List<Entidade> findEntidadeAll(PaginationFilter filter);
public Entidade deleteEntidade(Entidade entidade);

}
