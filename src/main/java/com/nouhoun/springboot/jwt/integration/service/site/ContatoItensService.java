/** create by system gera-java version 1.0.0 13/12/2018 21:53 : 11*/
 package com.nouhoun.springboot.jwt.integration.service.site;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.site.ContatoItens;



public interface ContatoItensService {


public ContatoItens findContatoItensById(Integer id);
public ContatoItens saveContatoItens(ContatoItens contatoitens);
public ContatoItens updateContatoItens(ContatoItens contatoitens);
public List<ContatoItens> findContatoItensAll(PaginationFilter filter);
public ContatoItens deleteContatoItens(ContatoItens contatoitens);

}
