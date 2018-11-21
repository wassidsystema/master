/** create by system gera-java version 1.0.0 20/11/2018 23:48 : 45*/
 package com.nouhoun.springboot.jwt.integration.service.dicionario;

import java.util.List;

import com.nouhoun.springboot.jwt.api.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.dicionario.Tab;



public interface TabService {


public Tab findTabById(Integer id);
public Tab saveTab(Tab tab);
public Tab updateTab(Tab tab);
public List<Tab> findTabAll(PaginationFilter filter);

}
