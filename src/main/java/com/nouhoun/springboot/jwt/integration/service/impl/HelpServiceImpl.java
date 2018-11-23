/** create by system gera-java version 1.0.0 22/11/2018 23:15 : 59*/


package com.nouhoun.springboot.jwt.integration.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.Help;
import com.nouhoun.springboot.jwt.integration.repository.HelpRepository;
import com.nouhoun.springboot.jwt.integration.service.HelpService;
@Service("helpService")
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
          return helpRepository.findAll();
      }

@Override
public Help deleteHelp(Help help) {
     helpRepository.delete(help);
	    return help;
	
}


}
