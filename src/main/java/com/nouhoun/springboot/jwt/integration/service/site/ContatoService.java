/** create by system gera-java version 1.0.0 13/12/2018 21:53 : 11*/
 package com.nouhoun.springboot.jwt.integration.service.site;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.site.Contato;



public interface ContatoService {


public Contato findContatoById(Integer id);
public Contato saveContato(Contato contato);
public Contato updateContato(Contato contato);
public List<Contato> findContatoAll(PaginationFilter filter);
public Contato deleteContato(Contato contato);

}
