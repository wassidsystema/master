/** create by system gera-java version 1.0.0 13/12/2018 21:32 : 42*/


package com.nouhoun.springboot.jwt.integration.repository.site;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nouhoun.springboot.jwt.integration.domain.site.ProdutoEmpresa;

@Repository("ProdutoEmpresaRepository")
public interface ProdutoEmpresaRepository extends JpaRepository<ProdutoEmpresa, Long> {

@Query("SELECT u  FROM ProdutoEmpresa u WHERE u.id = :id")
ProdutoEmpresa findProdutoEmpresaById(Integer id);


}
