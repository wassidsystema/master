/** create by system gera-java version 1.0.0 17/12/2018 21:10 : 35*/


package com.nouhoun.springboot.jwt.integration.repository.entidade;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nouhoun.springboot.jwt.integration.domain.entidade.Configuracao;

@Repository("ConfiguracaoRepository")
public interface ConfiguracaoRepository extends JpaRepository<Configuracao, Long> {

@Query("SELECT u  FROM Configuracao u WHERE u.id = :id")
Configuracao findConfiguracaoById(Integer id);


}
