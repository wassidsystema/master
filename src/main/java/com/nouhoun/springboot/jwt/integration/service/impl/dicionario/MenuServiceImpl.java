/** create by system gera-java version 1.0.0 21/11/2018 0:3 : 14*/


package com.nouhoun.springboot.jwt.integration.service.impl.dicionario;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nouhoun.springboot.jwt.api.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.dicionario.GroupMenu;
import com.nouhoun.springboot.jwt.integration.domain.dicionario.Menu;
import com.nouhoun.springboot.jwt.integration.repository.dicionario.MenuRepository;
import com.nouhoun.springboot.jwt.integration.service.dicionario.MenuService;

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
 	public Menu deleteMenu(Menu groupmenu) {
    	 menuRepository.delete(groupmenu);
 		return groupmenu;
 		
 	}
     @Override
     public Menu findMenuById(Integer id) {
         return menuRepository.findMenuById(id);
     }

      @Override
      public List < Menu > findMenuAll(PaginationFilter filter) {
          return (List <Menu> ) menuRepository.findMenuAll(filter);
      }



}
