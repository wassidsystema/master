/** create by system gera-java version 1.0.0 22/11/2018 23:10 : 51*/
 package com.nouhoun.springboot.jwt.integration.service;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.Pagina;



public interface PaginaService {


public Pagina findPaginaById(Integer id);
public Pagina savePagina(Pagina pagina);
public Pagina updatePagina(Pagina pagina);
public List<Pagina> findPaginaAll(PaginationFilter filter);
public Pagina deletePagina(Pagina pagina);

}
