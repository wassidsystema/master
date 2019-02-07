/** create by system gera-java version 1.0.0 17/12/2018 21:23 : 42*/
 package com.nouhoun.springboot.jwt.integration.service.entidade;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Configuracao;



public interface ConfiguracaoService {


public Configuracao findConfiguracaoById(Integer id);
public Configuracao saveConfiguracao(Configuracao configuracao);
public Configuracao updateConfiguracao(Configuracao configuracao);
public List<Configuracao> findConfiguracaoAll(PaginationFilter filter);
public Configuracao deleteConfiguracao(Configuracao configuracao);

}
