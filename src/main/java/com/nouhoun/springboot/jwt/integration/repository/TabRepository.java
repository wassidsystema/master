/** create by system gera-java version 1.0.0 20/11/2018 22:53 : 45*/


package com.nouhoun.springboot.jwt.integration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.Tab;

@Repository("TabRepository")
public interface TabRepository extends JpaRepository<Tab, Long> {

@Query("SELECT u  FROM Tab u WHERE u.id = :id")
Tab findTabById(@Param("id") Integer id);

@Query("SELECT t FROM Tab t")
List<Tab> findTabAll(PaginationFilter filter);


}
