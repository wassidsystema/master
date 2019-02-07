/** create by system gera-java version 1.0.0 13/12/2018 22:2 : 27*/


package com.nouhoun.springboot.jwt.integration.service.impl.site;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.site.PlanoByEmpresa;
import com.nouhoun.springboot.jwt.integration.repository.site.PlanoByEmpresaRepository;
import com.nouhoun.springboot.jwt.integration.service.site.PlanoByEmpresaService;

@Service("planobyempresaService")
public class PlanoByEmpresaServiceImpl implements PlanoByEmpresaService {

     @Autowired
     private PlanoByEmpresaRepository planobyempresaRepository;

     @Override
     public PlanoByEmpresa updatePlanoByEmpresa(PlanoByEmpresa planobyempresa) {
          return planobyempresaRepository.save(planobyempresa);
     }
     @Override
     public PlanoByEmpresa savePlanoByEmpresa(PlanoByEmpresa planobyempresa) {
         return planobyempresaRepository.save(planobyempresa);
     }


     @Override
     public PlanoByEmpresa findPlanoByEmpresaById(Integer id) {
         return planobyempresaRepository.findPlanoByEmpresaById(id);
     }

      @Override
      public List < PlanoByEmpresa > findPlanoByEmpresaAll(PaginationFilter filter) {
          return planobyempresaRepository.findAll();
      }

@Override
public PlanoByEmpresa deletePlanoByEmpresa(PlanoByEmpresa planobyempresa) {
     planobyempresaRepository.delete(planobyempresa);
	    return planobyempresa;
	
}


}
