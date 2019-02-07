/** create by system gera-java version 1.0.0 17/12/2018 21:23 : 42*/
 package com.nouhoun.springboot.jwt.integration.service.entidade;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Email;



public interface EmailService {


public Email findEmailById(Integer id);
public Email saveEmail(Email email);
public Email updateEmail(Email email);
public List<Email> findEmailAll(PaginationFilter filter);
public Email deleteEmail(Email email);

}
