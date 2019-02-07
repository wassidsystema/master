/** create by system gera-java version 1.0.0 17/12/2018 21:23 : 42*/
 package com.nouhoun.springboot.jwt.integration.service.entidade;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Classificacao;



public interface ClassificacaoService {


public Classificacao findClassificacaoById(Integer id);
public Classificacao saveClassificacao(Classificacao classificacao);
public Classificacao updateClassificacao(Classificacao classificacao);
public List<Classificacao> findClassificacaoAll(PaginationFilter filter);
public Classificacao deleteClassificacao(Classificacao classificacao);

}
