/** create by system gera-java version 1.0.0 20/11/2018 23:48 : 45*/
 package com.nouhoun.springboot.jwt.integration.service.dicionario;

import java.util.List;

import com.nouhoun.springboot.jwt.api.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.dicionario.Dominio;



public interface DominioService {


public Dominio findDominioById(Integer id);
public Dominio saveDominio(Dominio dominio);
public Dominio updateDominio(Dominio dominio);
public List<Dominio> findDominioAll(PaginationFilter filter);

}
