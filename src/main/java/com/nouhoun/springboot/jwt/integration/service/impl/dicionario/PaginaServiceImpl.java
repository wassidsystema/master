/** create by system gera-java version 1.0.0 21/11/2018 0:3 : 14*/


package com.nouhoun.springboot.jwt.integration.service.impl.dicionario;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nouhoun.springboot.jwt.api.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.dicionario.GroupMenu;
import com.nouhoun.springboot.jwt.integration.domain.dicionario.Pagina;
import com.nouhoun.springboot.jwt.integration.repository.dicionario.PaginaRepository;
import com.nouhoun.springboot.jwt.integration.service.dicionario.PaginaService;

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
 	public Pagina deletePagina(Pagina groupmenu) {
    	 paginaRepository.delete(groupmenu);
 		return groupmenu;
 		
 	}
     @Override
     public Pagina findPaginaById(Integer id) {
         return paginaRepository.findPaginaById(id);
     }

      @Override
      public List < Pagina > findPaginaAll(PaginationFilter filter) {
          return (List <Pagina> ) paginaRepository.findPaginaAll(filter);
      }



}
