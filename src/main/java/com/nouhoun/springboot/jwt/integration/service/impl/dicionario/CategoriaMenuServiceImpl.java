/** create by system gera-java version 1.0.0 21/11/2018 0:3 : 14*/


package com.nouhoun.springboot.jwt.integration.service.impl.dicionario;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nouhoun.springboot.jwt.api.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.dicionario.CategoriaMenu;
import com.nouhoun.springboot.jwt.integration.repository.dicionario.CategoriaMenuRepository;
import com.nouhoun.springboot.jwt.integration.service.dicionario.CategoriaMenuService;

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
          return (List <CategoriaMenu> ) categoriamenuRepository.findCategoriaMenuAll(filter);
      }



}
