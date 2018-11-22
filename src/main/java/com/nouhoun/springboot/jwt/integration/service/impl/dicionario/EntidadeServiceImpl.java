/** create by system gera-java version 1.0.0 21/11/2018 0:3 : 14*/


package com.nouhoun.springboot.jwt.integration.service.impl.dicionario;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nouhoun.springboot.jwt.api.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.dicionario.Entidade;
import com.nouhoun.springboot.jwt.integration.domain.dicionario.GroupMenu;
import com.nouhoun.springboot.jwt.integration.repository.dicionario.EntidadeRepository;
import com.nouhoun.springboot.jwt.integration.service.dicionario.EntidadeService;

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
 	public Entidade deleteEntidade(Entidade groupmenu) {
    	 entidadeRepository.delete(groupmenu);
 		return groupmenu;
 		
 	}

     @Override
     public Entidade findEntidadeById(Integer id) {
         return entidadeRepository.findEntidadeById(id);
     }

      @Override
      public List < Entidade > findEntidadeAll(PaginationFilter filter) {
          return (List <Entidade> ) entidadeRepository.findEntidadeAll(filter);
      }



}
