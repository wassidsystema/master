/** create by system gera-java version 1.0.0 17/12/2018 21:23 : 42*/
 package com.nouhoun.springboot.jwt.integration.service.entidade;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Socio;



public interface SocioService {


public Socio findSocioById(Integer id);
public Socio saveSocio(Socio socio);
public Socio updateSocio(Socio socio);
public List<Socio> findSocioAll(PaginationFilter filter);
public Socio deleteSocio(Socio socio);

}
