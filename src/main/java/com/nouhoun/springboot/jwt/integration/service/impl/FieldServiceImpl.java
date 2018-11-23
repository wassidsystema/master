/** create by system gera-java version 1.0.0 22/11/2018 23:15 : 59*/


package com.nouhoun.springboot.jwt.integration.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.Field;
import com.nouhoun.springboot.jwt.integration.repository.FieldRepository;
import com.nouhoun.springboot.jwt.integration.service.FieldService;
@Service("fieldService")
public class FieldServiceImpl implements FieldService {

     @Autowired
     private FieldRepository fieldRepository;

     @Override
     public Field updateField(Field field) {
          return fieldRepository.save(field);
     }
     @Override
     public Field saveField(Field field) {
         return fieldRepository.save(field);
     }


     @Override
     public Field findFieldById(Integer id) {
         return fieldRepository.findFieldById(id);
     }

      @Override
      public List < Field > findFieldAll(PaginationFilter filter) {
          return fieldRepository.findAll();
      }

@Override
public Field deleteField(Field field) {
     fieldRepository.delete(field);
	    return field;
	
}


}
