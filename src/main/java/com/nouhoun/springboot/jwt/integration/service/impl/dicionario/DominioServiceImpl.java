/** create by system gera-java version 1.0.0 21/11/2018 0:3 : 14*/


package com.nouhoun.springboot.jwt.integration.service.impl.dicionario;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nouhoun.springboot.jwt.api.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.dicionario.Dominio;
import com.nouhoun.springboot.jwt.integration.repository.dicionario.DominioRepository;
import com.nouhoun.springboot.jwt.integration.service.dicionario.DominioService;

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
          return (List <Dominio> ) dominioRepository.findDominioAll(filter);
      }



}
