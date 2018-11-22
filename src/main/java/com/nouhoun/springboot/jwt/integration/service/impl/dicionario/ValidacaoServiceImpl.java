/** create by system gera-java version 1.0.0 21/11/2018 0:3 : 14*/


package com.nouhoun.springboot.jwt.integration.service.impl.dicionario;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nouhoun.springboot.jwt.api.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.dicionario.GroupMenu;
import com.nouhoun.springboot.jwt.integration.domain.dicionario.Validacao;
import com.nouhoun.springboot.jwt.integration.repository.dicionario.ValidacaoRepository;
import com.nouhoun.springboot.jwt.integration.service.dicionario.ValidacaoService;

public class ValidacaoServiceImpl implements ValidacaoService {

     @Autowired
     private ValidacaoRepository validacaoRepository;

     @Override
     public Validacao updateValidacao(Validacao validacao) {
          return validacaoRepository.save(validacao);
     }
     @Override
     public Validacao saveValidacao(Validacao validacao) {
         return validacaoRepository.save(validacao);
     }

     @Override
 	public Validacao deleteValidacao(Validacao groupmenu) {
    	 validacaoRepository.delete(groupmenu);
 		return groupmenu;
 		
 	}
     @Override
     public Validacao findValidacaoById(Integer id) {
         return validacaoRepository.findValidacaoById(id);
     }

      @Override
      public List < Validacao > findValidacaoAll(PaginationFilter filter) {
          return (List <Validacao> ) validacaoRepository.findValidacaoAll(filter);
      }



}
