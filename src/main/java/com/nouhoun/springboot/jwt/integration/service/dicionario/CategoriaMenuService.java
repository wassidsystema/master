/** create by system gera-java version 1.0.0 20/11/2018 23:48 : 45*/
 package com.nouhoun.springboot.jwt.integration.service.dicionario;

import java.util.List;

import com.nouhoun.springboot.jwt.api.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.dicionario.CategoriaMenu;



public interface CategoriaMenuService {


public CategoriaMenu findCategoriaMenuById(Integer id);
public CategoriaMenu saveCategoriaMenu(CategoriaMenu categoriamenu);
public CategoriaMenu updateCategoriaMenu(CategoriaMenu categoriamenu);
public List<CategoriaMenu> findCategoriaMenuAll(PaginationFilter filter);
public CategoriaMenu deleteCategoriaMenu(CategoriaMenu groupmenu);

}
