/** create by system gera-java version 1.0.0 13/12/2018 21:53 : 11*/
 package com.nouhoun.springboot.jwt.integration.service.site;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.site.Preco;



public interface PrecoService {


public Preco findPrecoById(Integer id);
public Preco savePreco(Preco preco);
public Preco updatePreco(Preco preco);
public List<Preco> findPrecoAll(PaginationFilter filter);
public Preco deletePreco(Preco preco);

}
