/** create by system gera-java version 1.0.0 22/11/2018 23:5 : 35*/


package com.nouhoun.springboot.jwt.integration.repository.site;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nouhoun.springboot.jwt.integration.domain.site.Servico;

@Repository("ServicoRepository")
public interface ServicoRepository extends JpaRepository<Servico, Long> {

@Query("SELECT u  FROM Servico u WHERE u.id = :id")
Servico findServicoById(Integer id);


}
