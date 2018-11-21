/** create by system gera-java version 1.0.0 20/11/2018 23:48 : 45*/
 package com.nouhoun.springboot.jwt.integration.service.dicionario;

import java.util.List;

import com.nouhoun.springboot.jwt.api.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.dicionario.GroupMenu;



public interface GroupMenuService {


public GroupMenu findGroupMenuById(Integer id);
public GroupMenu saveGroupMenu(GroupMenu groupmenu);
public GroupMenu updateGroupMenu(GroupMenu groupmenu);
public List<GroupMenu> findGroupMenuAll(PaginationFilter filter);

}
