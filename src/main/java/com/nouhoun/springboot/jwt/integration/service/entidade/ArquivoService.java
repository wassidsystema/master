/** create by system gera-java version 1.0.0 17/12/2018 21:23 : 42*/
 package com.nouhoun.springboot.jwt.integration.service.entidade;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Arquivo;



public interface ArquivoService {


public Arquivo findArquivoById(Integer id);
public Arquivo saveArquivo(Arquivo arquivo);
public Arquivo updateArquivo(Arquivo arquivo);
public List<Arquivo> findArquivoAll(PaginationFilter filter);
public Arquivo deleteArquivo(Arquivo arquivo);

}
