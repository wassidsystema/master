/** create by system gera-java version 1.0.0 22/11/2018 23:15 : 59*/

package com.nouhoun.springboot.jwt.integration.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.GroupMenu;
import com.nouhoun.springboot.jwt.integration.repository.GroupMenuRepository;
import com.nouhoun.springboot.jwt.integration.service.GroupMenuService;
@Service("groupMenuService")
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
	public List<GroupMenu> findGroupMenuAll(PaginationFilter filter) {
		return groupmenuRepository.findAll();
	}

	@Override
	public GroupMenu deleteGroupMenu(GroupMenu groupmenu) {
		groupmenuRepository.delete(groupmenu);
		return groupmenu;

	}

}
