/** create by system gera-java version 1.0.0 22/11/2018 23:10 : 51*/
 package com.nouhoun.springboot.jwt.integration.service;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.Dominio;



public interface DominioService {


public Dominio findDominioById(Integer id);
public Dominio saveDominio(Dominio dominio);
public Dominio updateDominio(Dominio dominio);
public List<Dominio> findDominioAll(PaginationFilter filter);
public Dominio deleteDominio(Dominio dominio);

}
