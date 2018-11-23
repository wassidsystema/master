/** create by system gera-java version 1.0.0 22/11/2018 23:10 : 51*/
 package com.nouhoun.springboot.jwt.integration.service;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.Tab;



public interface TabService {


public Tab findTabById(Integer id);
public Tab saveTab(Tab tab);
public Tab updateTab(Tab tab);
public List<Tab> findTabAll(PaginationFilter filter);
public Tab deleteTab(Tab tab);

}
