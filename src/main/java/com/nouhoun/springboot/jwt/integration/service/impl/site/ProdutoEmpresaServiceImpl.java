/** create by system gera-java version 1.0.0 13/12/2018 22:2 : 27*/

package com.nouhoun.springboot.jwt.integration.service.impl.site;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.site.ProdutoEmpresa;
import com.nouhoun.springboot.jwt.integration.repository.site.ProdutoEmpresaRepository;
import com.nouhoun.springboot.jwt.integration.service.site.ProdutoEmpresaService;

@Service("produtoEmpresaService")
public class ProdutoEmpresaServiceImpl implements ProdutoEmpresaService {

	@Autowired
	private ProdutoEmpresaRepository produtoEmpresaRepository;

	@Override
	public ProdutoEmpresa updateProdutoEmpresa(ProdutoEmpresa produtoempresa) {
		return produtoEmpresaRepository.save(produtoempresa);
	}

	@Override
	public ProdutoEmpresa saveProdutoEmpresa(ProdutoEmpresa produtoempresa) {
		return produtoEmpresaRepository.save(produtoempresa);
	}

	@Override
	public ProdutoEmpresa findProdutoEmpresaById(Integer id) {
		return produtoEmpresaRepository.findProdutoEmpresaById(id);
	}

	@Override
	public List<ProdutoEmpresa> findProdutoEmpresaAll(PaginationFilter filter) {
		return produtoEmpresaRepository.findAll();
	}

	@Override
	public ProdutoEmpresa deleteProdutoEmpresa(ProdutoEmpresa produtoempresa) {
		produtoEmpresaRepository.delete(produtoempresa);
		return produtoempresa;

	}

}
