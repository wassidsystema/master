/** create by system gera-java version 1.0.0 20/11/2018 23:48 : 45*/
 package com.nouhoun.springboot.jwt.integration.service.dicionario;

import java.util.List;

import com.nouhoun.springboot.jwt.api.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.dicionario.Field;



public interface FieldService {


public Field findFieldById(Integer id);
public Field saveField(Field field);
public Field updateField(Field field);
public List<Field> findFieldAll(PaginationFilter filter);

}
