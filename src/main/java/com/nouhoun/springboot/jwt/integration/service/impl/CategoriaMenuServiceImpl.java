/** create by system gera-java version 1.0.0 22/11/2018 23:15 : 59*/


package com.nouhoun.springboot.jwt.integration.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.CategoriaMenu;
import com.nouhoun.springboot.jwt.integration.repository.CategoriaMenuRepository;
import com.nouhoun.springboot.jwt.integration.service.CategoriaMenuService;

@Service("categoriamenuService")
public class CategoriaMenuServiceImpl implements CategoriaMenuService {

     @Autowired
     private CategoriaMenuRepository categoriamenuRepository;

     @Override
     public CategoriaMenu updateCategoriaMenu(CategoriaMenu categoriamenu) {
          return categoriamenuRepository.save(categoriamenu);
     }
     @Override
     public CategoriaMenu saveCategoriaMenu(CategoriaMenu categoriamenu) {
         return categoriamenuRepository.save(categoriamenu);
     }


     @Override
     public CategoriaMenu findCategoriaMenuById(Integer id) {
         return categoriamenuRepository.findCategoriaMenuById(id);
     }

      @Override
      public List < CategoriaMenu > findCategoriaMenuAll(PaginationFilter filter) {
          return categoriamenuRepository.findAll();
      }

@Override
public CategoriaMenu deleteCategoriaMenu(CategoriaMenu categoriamenu) {
     categoriamenuRepository.delete(categoriamenu);
	    return categoriamenu;
	
}


}
