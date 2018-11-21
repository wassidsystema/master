/** create by system gera-java version 1.0.0 20/11/2018 23:48 : 45*/
 package com.nouhoun.springboot.jwt.integration.service.dicionario;

import java.util.List;

import com.nouhoun.springboot.jwt.api.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.dicionario.Menu;



public interface MenuService {


public Menu findMenuById(Integer id);
public Menu saveMenu(Menu menu);
public Menu updateMenu(Menu menu);
public List<Menu> findMenuAll(PaginationFilter filter);

}
