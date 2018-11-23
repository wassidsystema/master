/** create by system gera-java version 1.0.0 22/11/2018 23:10 : 51*/
 package com.nouhoun.springboot.jwt.integration.service;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.Validacao;



public interface ValidacaoService {


public Validacao findValidacaoById(Integer id);
public Validacao saveValidacao(Validacao validacao);
public Validacao updateValidacao(Validacao validacao);
public List<Validacao> findValidacaoAll(PaginationFilter filter);
public Validacao deleteValidacao(Validacao validacao);

}
