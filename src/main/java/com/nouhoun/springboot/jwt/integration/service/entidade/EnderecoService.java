/** create by system gera-java version 1.0.0 17/12/2018 21:23 : 42*/
 package com.nouhoun.springboot.jwt.integration.service.entidade;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Endereco;




public interface EnderecoService {


public Endereco findEnderecoById(Integer id);
public Endereco saveEndereco(Endereco endereco);
public Endereco updateEndereco(Endereco endereco);
public List<Endereco> findEnderecoAll(PaginationFilter filter);
public Endereco deleteEndereco(Endereco endereco);

}
