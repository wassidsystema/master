/** create by system gera-java version 1.0.0 20/11/2018 23:48 : 45*/
 package com.nouhoun.springboot.jwt.integration.service.dicionario;

import java.util.List;

import com.nouhoun.springboot.jwt.api.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.dicionario.CategoriaMenu;
import com.nouhoun.springboot.jwt.integration.domain.dicionario.Help;



public interface HelpService {


public Help findHelpById(Integer id);
public Help saveHelp(Help help);
public Help updateHelp(Help help);
public List<Help> findHelpAll(PaginationFilter filter);
public Help deleteHelp(Help groupmenu);

}
