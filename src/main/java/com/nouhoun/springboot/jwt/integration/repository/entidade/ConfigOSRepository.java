/** create by system gera-java version 1.0.0 17/12/2018 21:10 : 35*/


package com.nouhoun.springboot.jwt.integration.repository.entidade;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfigOS;

@Repository("ConfigOSRepository")
public interface ConfigOSRepository extends JpaRepository<ConfigOS, Long> {

@Query("SELECT u  FROM ConfigOS u WHERE u.id = :id")
ConfigOS findConfigOSById(Integer id);


}
