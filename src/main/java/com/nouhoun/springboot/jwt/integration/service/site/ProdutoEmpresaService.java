/** create by system gera-java version 1.0.0 13/12/2018 21:53 : 11*/
 package com.nouhoun.springboot.jwt.integration.service.site;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.site.ProdutoEmpresa;



public interface ProdutoEmpresaService {


public ProdutoEmpresa findProdutoEmpresaById(Integer id);
public ProdutoEmpresa saveProdutoEmpresa(ProdutoEmpresa produtoempresa);
public ProdutoEmpresa updateProdutoEmpresa(ProdutoEmpresa produtoempresa);
public List<ProdutoEmpresa> findProdutoEmpresaAll(PaginationFilter filter);
public ProdutoEmpresa deleteProdutoEmpresa(ProdutoEmpresa produtoempresa);

}
