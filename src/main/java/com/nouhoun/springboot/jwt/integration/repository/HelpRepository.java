/** create by system gera-java version 1.0.0 22/11/2018 23:5 : 35*/


package com.nouhoun.springboot.jwt.integration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nouhoun.springboot.jwt.integration.domain.Help;

@Repository("HelpRepository")
public interface HelpRepository extends JpaRepository<Help, Long> {

@Query("SELECT u  FROM Help u WHERE u.id = :id")
Help findHelpById(Integer id);


}
