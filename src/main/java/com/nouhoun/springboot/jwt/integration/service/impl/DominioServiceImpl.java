/** create by system gera-java version 1.0.0 22/11/2018 23:15 : 59*/


package com.nouhoun.springboot.jwt.integration.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.Dominio;
import com.nouhoun.springboot.jwt.integration.repository.DominioRepository;
import com.nouhoun.springboot.jwt.integration.service.DominioService;
@Service("dominioService")
public class DominioServiceImpl implements DominioService {

     @Autowired
     private DominioRepository dominioRepository;

     @Override
     public Dominio updateDominio(Dominio dominio) {
          return dominioRepository.save(dominio);
     }
     @Override
     public Dominio saveDominio(Dominio dominio) {
         return dominioRepository.save(dominio);
     }


     @Override
     public Dominio findDominioById(Integer id) {
         return dominioRepository.findDominioById(id);
     }

      @Override
      public List < Dominio > findDominioAll(PaginationFilter filter) {
          return dominioRepository.findAll();
      }

@Override
public Dominio deleteDominio(Dominio dominio) {
     dominioRepository.delete(dominio);
	    return dominio;
	
}


}
