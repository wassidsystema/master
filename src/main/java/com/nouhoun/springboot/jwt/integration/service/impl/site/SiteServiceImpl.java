/** create by system gera-java version 1.0.0 13/12/2018 22:2 : 27*/

package com.nouhoun.springboot.jwt.integration.service.impl.site;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.site.Site;
import com.nouhoun.springboot.jwt.integration.repository.site.SiteRepository;
import com.nouhoun.springboot.jwt.integration.service.site.SiteService;

@Service("siteService")
public class SiteServiceImpl implements SiteService {

	@Autowired
	private SiteRepository siteRepository;

	@Override
	public Site updateSite(Site site) {
		return siteRepository.save(site);
	}

	@Override
	public Site saveSite(Site site) {
		return siteRepository.save(site);
	}

	@Override
	public Site findSiteById(Integer id) {
		return siteRepository.findSiteById(id);
	}

	@Override
	public List<Site> findSiteAll(PaginationFilter filter) {
		return siteRepository.findAll();
	}

	@Override
	public Site deleteSite(Site site) {
		siteRepository.delete(site);
		return site;

	}

}
