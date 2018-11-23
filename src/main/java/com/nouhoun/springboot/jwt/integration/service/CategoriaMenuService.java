/** create by system gera-java version 1.0.0 22/11/2018 23:10 : 51*/
 package com.nouhoun.springboot.jwt.integration.service;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.CategoriaMenu;



public interface CategoriaMenuService {


public CategoriaMenu findCategoriaMenuById(Integer id);
public CategoriaMenu saveCategoriaMenu(CategoriaMenu categoriamenu);
public CategoriaMenu updateCategoriaMenu(CategoriaMenu categoriamenu);
public List<CategoriaMenu> findCategoriaMenuAll(PaginationFilter filter);
public CategoriaMenu deleteCategoriaMenu(CategoriaMenu categoriamenu);

}
