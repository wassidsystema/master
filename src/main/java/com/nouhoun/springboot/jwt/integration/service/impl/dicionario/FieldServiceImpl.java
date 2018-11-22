/** create by system gera-java version 1.0.0 21/11/2018 0:3 : 14*/


package com.nouhoun.springboot.jwt.integration.service.impl.dicionario;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nouhoun.springboot.jwt.api.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.dicionario.Field;
import com.nouhoun.springboot.jwt.integration.domain.dicionario.GroupMenu;
import com.nouhoun.springboot.jwt.integration.repository.dicionario.FieldRepository;
import com.nouhoun.springboot.jwt.integration.service.dicionario.FieldService;

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
 	public Field deleteField(Field groupmenu) {
    	 fieldRepository.delete(groupmenu);
 		return groupmenu;
 		
 	}
     @Override
     public Field findFieldById(Integer id) {
         return fieldRepository.findFieldById(id);
     }

      @Override
      public List < Field > findFieldAll(PaginationFilter filter) {
          return (List <Field> ) fieldRepository.findFieldAll(filter);
      }



}
