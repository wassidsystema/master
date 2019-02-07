/** create by system gera-java version 1.0.0 13/12/2018 22:2 : 27*/


package com.nouhoun.springboot.jwt.integration.service.impl.site;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.site.OrdemServico;
import com.nouhoun.springboot.jwt.integration.repository.site.OrdemServicoRepository;
import com.nouhoun.springboot.jwt.integration.service.site.OrdemServicoService;

@Service("ordemservicoService")
public class OrdemServicoServiceImpl implements OrdemServicoService {

     @Autowired
     private OrdemServicoRepository ordemservicoRepository;

     @Override
     public OrdemServico updateOrdemServico(OrdemServico ordemservico) {
          return ordemservicoRepository.save(ordemservico);
     }
     @Override
     public OrdemServico saveOrdemServico(OrdemServico ordemservico) {
         return ordemservicoRepository.save(ordemservico);
     }


     @Override
     public OrdemServico findOrdemServicoById(Integer id) {
         return ordemservicoRepository.findOrdemServicoById(id);
     }

      @Override
      public List < OrdemServico > findOrdemServicoAll(PaginationFilter filter) {
          return ordemservicoRepository.findAll();
      }

@Override
public OrdemServico deleteOrdemServico(OrdemServico ordemservico) {
     ordemservicoRepository.delete(ordemservico);
	    return ordemservico;
	
}


}
