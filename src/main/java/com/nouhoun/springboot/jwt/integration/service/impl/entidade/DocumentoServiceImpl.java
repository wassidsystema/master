/** create by system gera-java version 1.0.0 17/12/2018 21:35 : 42*/

package com.nouhoun.springboot.jwt.integration.service.impl.entidade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Documento;
import com.nouhoun.springboot.jwt.integration.repository.entidade.DocumentoRepository;
import com.nouhoun.springboot.jwt.integration.service.entidade.DocumentoService;

@Service("documentoService")
public class DocumentoServiceImpl implements DocumentoService {

	@Autowired
	private DocumentoRepository documentoRepository;

	@Override
	public Documento updateDocumento(Documento documento) {
		return documentoRepository.save(documento);
	}

	@Override
	public Documento saveDocumento(Documento documento) {
		return documentoRepository.save(documento);
	}

	@Override
	public Documento findDocumentoById(Integer id) {
		return documentoRepository.findDocumentoById(id);
	}

	@Override
	public List<Documento> findDocumentoAll(PaginationFilter filter) {
		return documentoRepository.findAll();
	}

	@Override
	public Documento deleteDocumento(Documento documento) {
		documentoRepository.delete(documento);
		return documento;

	}

}
