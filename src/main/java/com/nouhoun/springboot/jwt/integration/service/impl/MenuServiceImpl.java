/** create by system gera-java version 1.0.0 22/11/2018 23:15 : 59*/


package com.nouhoun.springboot.jwt.integration.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.Menu;
import com.nouhoun.springboot.jwt.integration.repository.MenuRepository;
import com.nouhoun.springboot.jwt.integration.service.MenuService;
@Service("menuService")
public class MenuServiceImpl implements MenuService {

     @Autowired
     private MenuRepository menuRepository;

     @Override
     public Menu updateMenu(Menu menu) {
          return menuRepository.save(menu);
     }
     @Override
     public Menu saveMenu(Menu menu) {
         return menuRepository.save(menu);
     }


     @Override
     public Menu findMenuById(Integer id) {
         return menuRepository.findMenuById(id);
     }

      @Override
      public List < Menu > findMenuAll(PaginationFilter filter) {
          return menuRepository.findAll();
      }

@Override
public Menu deleteMenu(Menu menu) {
     menuRepository.delete(menu);
	    return menu;
	
}


}
