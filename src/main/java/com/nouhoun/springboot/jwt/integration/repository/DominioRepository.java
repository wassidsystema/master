/** create by system gera-java version 1.0.0 22/11/2018 23:5 : 35*/


package com.nouhoun.springboot.jwt.integration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nouhoun.springboot.jwt.integration.domain.Dominio;

@Repository("DominioRepository")
public interface DominioRepository extends JpaRepository<Dominio, Long> {

@Query("SELECT u  FROM Dominio u WHERE u.id = :id")
Dominio findDominioById(Integer id);


}
