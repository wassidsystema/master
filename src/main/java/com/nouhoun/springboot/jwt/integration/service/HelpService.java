/** create by system gera-java version 1.0.0 22/11/2018 23:10 : 51*/
 package com.nouhoun.springboot.jwt.integration.service;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.Help;



public interface HelpService {


public Help findHelpById(Integer id);
public Help saveHelp(Help help);
public Help updateHelp(Help help);
public List<Help> findHelpAll(PaginationFilter filter);
public Help deleteHelp(Help help);

}
