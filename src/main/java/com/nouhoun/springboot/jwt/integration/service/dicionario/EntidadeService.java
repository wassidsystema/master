/** create by system gera-java version 1.0.0 20/11/2018 23:48 : 45*/
 package com.nouhoun.springboot.jwt.integration.service.dicionario;

import java.util.List;

import com.nouhoun.springboot.jwt.api.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.dicionario.Entidade;



public interface EntidadeService {


public Entidade findEntidadeById(Integer id);
public Entidade saveEntidade(Entidade entidade);
public Entidade updateEntidade(Entidade entidade);
public List<Entidade> findEntidadeAll(PaginationFilter filter);

}
