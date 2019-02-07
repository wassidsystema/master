/** create by system gera-java version 1.0.0 13/12/2018 21:32 : 43*/


package com.nouhoun.springboot.jwt.integration.repository.site;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nouhoun.springboot.jwt.integration.domain.site.ContatoItens;

@Repository("ContatoItensRepository")
public interface ContatoItensRepository extends JpaRepository<ContatoItens, Long> {

@Query("SELECT u  FROM ContatoItens u WHERE u.id = :id")
ContatoItens findContatoItensById(Integer id);


}
