/** create by system gera-java version 1.0.0 22/11/2018 23:15 : 59*/


package com.nouhoun.springboot.jwt.integration.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.Entidade;
import com.nouhoun.springboot.jwt.integration.repository.EntidadeRepository;
import com.nouhoun.springboot.jwt.integration.service.EntidadeService;
@Service("entidadeService")
public class EntidadeServiceImpl implements EntidadeService {

     @Autowired
     private EntidadeRepository entidadeRepository;

     @Override
     public Entidade updateEntidade(Entidade entidade) {
          return entidadeRepository.save(entidade);
     }
     @Override
     public Entidade saveEntidade(Entidade entidade) {
         return entidadeRepository.save(entidade);
     }


     @Override
     public Entidade findEntidadeById(Integer id) {
         return entidadeRepository.findEntidadeById(id);
     }

      @Override
      public List < Entidade > findEntidadeAll(PaginationFilter filter) {
          return entidadeRepository.findAll();
      }

@Override
public Entidade deleteEntidade(Entidade entidade) {
     entidadeRepository.delete(entidade);
	    return entidade;
	
}


}
