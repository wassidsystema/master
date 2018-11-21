/** create by system gera-java version 1.0.0 21/11/2018 0:3 : 14*/


package com.nouhoun.springboot.jwt.integration.service.impl.dicionario;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nouhoun.springboot.jwt.api.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.dicionario.Tab;
import com.nouhoun.springboot.jwt.integration.repository.dicionario.TabRepository;
import com.nouhoun.springboot.jwt.integration.service.dicionario.TabService;

public class TabServiceImpl implements TabService {

     @Autowired
     private TabRepository tabRepository;

     @Override
     public Tab updateTab(Tab tab) {
          return tabRepository.save(tab);
     }
     @Override
     public Tab saveTab(Tab tab) {
         return tabRepository.save(tab);
     }


     @Override
     public Tab findTabById(Integer id) {
         return tabRepository.findTabById(id);
     }

      @Override
      public List < Tab > findTabAll(PaginationFilter filter) {
          return (List <Tab> ) tabRepository.findTabAll(filter);
      }



}
