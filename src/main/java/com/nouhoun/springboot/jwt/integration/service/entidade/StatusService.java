/** create by system gera-java version 1.0.0 17/12/2018 21:23 : 42*/
 package com.nouhoun.springboot.jwt.integration.service.entidade;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Status;



public interface StatusService {


public Status findStatusById(Integer id);
public Status saveStatus(Status status);
public Status updateStatus(Status status);
public List<Status> findStatusAll(PaginationFilter filter);
public Status deleteStatus(Status status);

}
