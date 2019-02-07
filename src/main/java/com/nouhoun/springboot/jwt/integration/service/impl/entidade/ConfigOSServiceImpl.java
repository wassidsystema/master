/** create by system gera-java version 1.0.0 17/12/2018 21:35 : 42*/


package com.nouhoun.springboot.jwt.integration.service.impl.entidade;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfigOS;
import com.nouhoun.springboot.jwt.integration.repository.entidade.ConfigOSRepository;
import com.nouhoun.springboot.jwt.integration.service.entidade.ConfigOSService;

@Service("configosService")
public class ConfigOSServiceImpl implements ConfigOSService {

     @Autowired
     private ConfigOSRepository configosRepository;

     @Override
     public ConfigOS updateConfigOS(ConfigOS configos) {
          return configosRepository.save(configos);
     }
     @Override
     public ConfigOS saveConfigOS(ConfigOS configos) {
         return configosRepository.save(configos);
     }


     @Override
     public ConfigOS findConfigOSById(Integer id) {
         return configosRepository.findConfigOSById(id);
     }

      @Override
      public List < ConfigOS > findConfigOSAll(PaginationFilter filter) {
          return configosRepository.findAll();
      }

@Override
public ConfigOS deleteConfigOS(ConfigOS configos) {
     configosRepository.delete(configos);
	    return configos;
	
}


}
