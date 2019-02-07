/** create by system gera-java version 1.0.0 13/12/2018 21:53 : 11*/
 package com.nouhoun.springboot.jwt.integration.service.site;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.site.Site;



public interface SiteService {


public Site findSiteById(Integer id);
public Site saveSite(Site site);
public Site updateSite(Site site);
public List<Site> findSiteAll(PaginationFilter filter);
public Site deleteSite(Site site);

}
