/** create by system gera-java version 1.0.0 20/11/2018 23:48 : 45*/
 package com.nouhoun.springboot.jwt.integration.service.dicionario;

import java.util.List;

import com.nouhoun.springboot.jwt.api.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.dicionario.Pagina;



public interface PaginaService {


public Pagina findPaginaById(Integer id);
public Pagina savePagina(Pagina pagina);
public Pagina updatePagina(Pagina pagina);
public List<Pagina> findPaginaAll(PaginationFilter filter);

}
