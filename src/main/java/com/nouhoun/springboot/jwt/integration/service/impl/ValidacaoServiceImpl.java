/** create by system gera-java version 1.0.0 22/11/2018 23:15 : 59*/


package com.nouhoun.springboot.jwt.integration.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.Validacao;
import com.nouhoun.springboot.jwt.integration.repository.ValidacaoRepository;
import com.nouhoun.springboot.jwt.integration.service.ValidacaoService;
@Service("validacaoService")
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
     public Validacao findValidacaoById(Integer id) {
         return validacaoRepository.findValidacaoById(id);
     }

      @Override
      public List < Validacao > findValidacaoAll(PaginationFilter filter) {
          return validacaoRepository.findAll();
      }

@Override
public Validacao deleteValidacao(Validacao validacao) {
     validacaoRepository.delete(validacao);
	    return validacao;
	
}


}
