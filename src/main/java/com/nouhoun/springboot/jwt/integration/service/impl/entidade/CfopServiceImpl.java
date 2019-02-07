/** create by system gera-java version 1.0.0 17/12/2018 21:35 : 42*/


package com.nouhoun.springboot.jwt.integration.service.impl.entidade;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Cfop;
import com.nouhoun.springboot.jwt.integration.repository.entidade.CfopRepository;
import com.nouhoun.springboot.jwt.integration.service.entidade.CfopService;

@Service("cfopService")
public class CfopServiceImpl implements CfopService {

     @Autowired
     private CfopRepository cfopRepository;

     @Override
     public Cfop updateCfop(Cfop cfop) {
          return cfopRepository.save(cfop);
     }
     @Override
     public Cfop saveCfop(Cfop cfop) {
         return cfopRepository.save(cfop);
     }


     @Override
     public Cfop findCfopById(Integer id) {
         return cfopRepository.findCfopById(id);
     }

      @Override
      public List < Cfop > findCfopAll(PaginationFilter filter) {
          return cfopRepository.findAll();
      }

@Override
public Cfop deleteCfop(Cfop cfop) {
     cfopRepository.delete(cfop);
	    return cfop;
	
}


}
