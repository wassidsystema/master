/** create by system gera-java version 1.0.0 22/11/2018 23:15 : 59*/


package com.nouhoun.springboot.jwt.integration.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.Tab;
import com.nouhoun.springboot.jwt.integration.repository.TabRepository;
import com.nouhoun.springboot.jwt.integration.service.TabService;
@Service("tabService")
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
          return tabRepository.findAll();
      }

@Override
public Tab deleteTab(Tab tab) {
     tabRepository.delete(tab);
	    return tab;
	
}


}
