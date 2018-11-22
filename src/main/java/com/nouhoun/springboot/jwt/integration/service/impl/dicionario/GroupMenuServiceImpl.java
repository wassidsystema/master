/** create by system gera-java version 1.0.0 21/11/2018 0:3 : 14*/


package com.nouhoun.springboot.jwt.integration.service.impl.dicionario;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nouhoun.springboot.jwt.api.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.dicionario.GroupMenu;
import com.nouhoun.springboot.jwt.integration.repository.dicionario.GroupMenuRepository;
import com.nouhoun.springboot.jwt.integration.service.dicionario.GroupMenuService;

public class GroupMenuServiceImpl implements GroupMenuService {

     @Autowired
     private GroupMenuRepository groupmenuRepository;

     @Override
     public GroupMenu updateGroupMenu(GroupMenu groupmenu) {
          return groupmenuRepository.save(groupmenu);
     }
     @Override
     public GroupMenu saveGroupMenu(GroupMenu groupmenu) {
         return groupmenuRepository.save(groupmenu);
     }


     @Override
     public GroupMenu findGroupMenuById(Integer id) {
         return groupmenuRepository.findGroupMenuById(id);
     }

      @Override
      public List < GroupMenu > findGroupMenuAll(PaginationFilter filter) {
          return (List <GroupMenu> ) groupmenuRepository.findGroupMenuAll(filter);
      }
	@Override
	public GroupMenu deleteGroupMenu(GroupMenu groupmenu) {
		groupmenuRepository.delete(groupmenu);
		return groupmenu;
		
	}



}
