/** create by system gera-java version 1.0.0 17/12/2018 21:35 : 42*/


package com.nouhoun.springboot.jwt.integration.service.impl.entidade;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Status;
import com.nouhoun.springboot.jwt.integration.repository.entidade.StatusRepository;
import com.nouhoun.springboot.jwt.integration.service.entidade.StatusService;

@Service("statusService")
public class StatusServiceImpl implements StatusService {

     @Autowired
     private StatusRepository statusRepository;

     @Override
     public Status updateStatus(Status status) {
          return statusRepository.save(status);
     }
     @Override
     public Status saveStatus(Status status) {
         return statusRepository.save(status);
     }


     @Override
     public Status findStatusById(Integer id) {
         return statusRepository.findStatusById(id);
     }

      @Override
      public List < Status > findStatusAll(PaginationFilter filter) {
          return statusRepository.findAll();
      }

@Override
public Status deleteStatus(Status status) {
     statusRepository.delete(status);
	    return status;
	
}


}
