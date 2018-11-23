/** create by system gera-java version 1.0.0 22/11/2018 23:10 : 51*/
 package com.nouhoun.springboot.jwt.integration.service;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.Field;



public interface FieldService {


public Field findFieldById(Integer id);
public Field saveField(Field field);
public Field updateField(Field field);
public List<Field> findFieldAll(PaginationFilter filter);
public Field deleteField(Field field);

}
