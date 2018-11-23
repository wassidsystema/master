/** create by system gera-java version 1.0.0 22/11/2018 23:15 : 59*/


package com.nouhoun.springboot.jwt.integration.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.Pagina;
import com.nouhoun.springboot.jwt.integration.repository.PaginaRepository;
import com.nouhoun.springboot.jwt.integration.service.PaginaService;
@Service("paginaService")
public class PaginaServiceImpl implements PaginaService {

     @Autowired
     private PaginaRepository paginaRepository;

     @Override
     public Pagina updatePagina(Pagina pagina) {
          return paginaRepository.save(pagina);
     }
     @Override
     public Pagina savePagina(Pagina pagina) {
         return paginaRepository.save(pagina);
     }


     @Override
     public Pagina findPaginaById(Integer id) {
         return paginaRepository.findPaginaById(id);
     }

      @Override
      public List < Pagina > findPaginaAll(PaginationFilter filter) {
          return paginaRepository.findAll();
      }

@Override
public Pagina deletePagina(Pagina pagina) {
     paginaRepository.delete(pagina);
	    return pagina;
	
}


}
