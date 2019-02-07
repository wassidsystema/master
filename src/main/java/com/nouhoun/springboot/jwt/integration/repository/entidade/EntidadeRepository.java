/** create by system gera-java version 1.0.0 17/12/2018 21:10 : 35*/


package com.nouhoun.springboot.jwt.integration.repository.entidade;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nouhoun.springboot.jwt.integration.domain.entidade.Entidade;

@Repository("EntidadeRepository")
public interface EntidadeRepository extends JpaRepository<Entidade, Long> {

@Query("SELECT u  FROM Entidade u WHERE u.id = :id")
Entidade findEntidadeById(Integer id);


@Query("SELECT u  FROM Entidade u WHERE u.id = :id")
Entidade findEntidadeByUserId(Integer id);


}
