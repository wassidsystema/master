/** create by system gera-java version 1.0.0 17/12/2018 21:23 : 42*/
 package com.nouhoun.springboot.jwt.integration.service.entidade;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Documento;



public interface DocumentoService {


public Documento findDocumentoById(Integer id);
public Documento saveDocumento(Documento documento);
public Documento updateDocumento(Documento documento);
public List<Documento> findDocumentoAll(PaginationFilter filter);
public Documento deleteDocumento(Documento documento);

}
