/** create by system gera-java version 1.0.0 17/12/2018 21:23 : 42*/
 package com.nouhoun.springboot.jwt.integration.service.entidade;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Telefone;



public interface TelefoneService {


public Telefone findTelefoneById(Integer id);
public Telefone saveTelefone(Telefone telefone);
public Telefone updateTelefone(Telefone telefone);
public List<Telefone> findTelefoneAll(PaginationFilter filter);
public Telefone deleteTelefone(Telefone telefone);

}
