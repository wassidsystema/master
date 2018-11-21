/** create by system gera-java version 1.0.0 20/11/2018 23:48 : 45*/
 package com.nouhoun.springboot.jwt.integration.service.dicionario;

import java.util.List;

import com.nouhoun.springboot.jwt.api.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.dicionario.Validacao;



public interface ValidacaoService {


public Validacao findValidacaoById(Integer id);
public Validacao saveValidacao(Validacao validacao);
public Validacao updateValidacao(Validacao validacao);
public List<Validacao> findValidacaoAll(PaginationFilter filter);

}
