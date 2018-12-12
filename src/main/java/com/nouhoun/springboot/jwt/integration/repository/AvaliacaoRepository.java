package com.nouhoun.springboot.jwt.integration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nouhoun.springboot.jwt.integration.domain.Avaliacao;

@Repository("avaliacaoRepository")
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
	
	@Query("SELECT u  FROM Avaliacao u WHERE u.empresaId = :id")
	List<Avaliacao> findAvaliacaoByEmpresa(Integer id);
	
}
