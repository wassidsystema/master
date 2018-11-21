/** create by system gera-java version 1.0.0 21/11/2018 0:3 : 14*/


package com.nouhoun.springboot.jwt.integration.service.impl.dicionario;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nouhoun.springboot.jwt.api.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.dicionario.Help;
import com.nouhoun.springboot.jwt.integration.repository.dicionario.HelpRepository;
import com.nouhoun.springboot.jwt.integration.service.dicionario.HelpService;

public class HelpServiceImpl implements HelpService {

     @Autowired
     private HelpRepository helpRepository;

     @Override
     public Help updateHelp(Help help) {
          return helpRepository.save(help);
     }
     @Override
     public Help saveHelp(Help help) {
         return helpRepository.save(help);
     }


     @Override
     public Help findHelpById(Integer id) {
         return helpRepository.findHelpById(id);
     }

      @Override
      public List < Help > findHelpAll(PaginationFilter filter) {
          return (List <Help> ) helpRepository.findHelpAll(filter);
      }



}
