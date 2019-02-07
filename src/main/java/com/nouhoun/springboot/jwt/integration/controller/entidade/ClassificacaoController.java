/** create by system gera-java version 1.0.0 17/12/2018 21:54 : 13*/

package com.nouhoun.springboot.jwt.integration.controller.entidade;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Classificacao;
import com.nouhoun.springboot.jwt.integration.service.entidade.ClassificacaoService;


/**
 * The Class ClassificacaoController.
 */
@Controller
@RequestMapping("/classificacao/api")
public class ClassificacaoController 
{
	/** The Constant DEFAULT_EXCEPTION_MSG. */
	private static final String DEFAULT_EXCEPTION_MSG = "sysmgmt.base.classificacaocontrollerrest.defaultexception";

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(ClassificacaoController.class);

	/** The classificacao Service. */
@Autowired
private ClassificacaoService classificacaoService;


//===================================### CLASSIFICACAO ####======================================
/**
	 * Refresh classificacaos.
	 *
	 * @param refreshInt the refresh int
	 * @param retList the ret list
	 * @param retPaged the ret paged
	 * @return the classificacao response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/classificacao/refresh", method = RequestMethod.GET)
	@ResponseBody
 public ResponseEntity<List<Classificacao>> refreshClassificacaoPaged(@RequestBody PaginationFilter requestString)
 {
     return new ResponseEntity<List<Classificacao>>(classificacaoService.findClassificacaoAll(requestString), HttpStatus.OK);
 }

	/**
	 * Fetch classificacao paged.
	 *
	 * @param request the request
	 * @return the classificacao response
	 */
	@RequestMapping(value = "/classificacao/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Classificacao>> fetchClassificacaoPaged(@RequestBody PaginationFilter requestString)
	 {
     return new ResponseEntity<List<Classificacao>>(classificacaoService.findClassificacaoAll(requestString), HttpStatus.OK);
 }

	/**
	 * Insert classificacao.
	 *
	 * @param request the request
	 * @return the classificacao response
	 */
@CrossOrigin(origins = "*")
@RequestMapping(value = "/classificacao/insert", method = RequestMethod.POST)
public ResponseEntity<Classificacao> insertClassificacao(@RequestBody String classificacaos,
        HttpServletRequest request)
        throws JsonParseException, JsonMappingException, IOException {
    
     ObjectMapper mapper = new ObjectMapper();
     Classificacao classificacao = mapper.readValue(classificacaos, Classificacao.class);
    return new ResponseEntity<Classificacao>(classificacaoService.saveClassificacao(classificacao), HttpStatus.OK);
}
@CrossOrigin(origins = "*")
@RequestMapping(value = "/classificacao/update", method = RequestMethod.POST)
public ResponseEntity<Classificacao> updateClassificacao(@RequestBody Classificacao classificacao,
        HttpServletRequest request)
        throws JsonParseException, JsonMappingException, IOException {
    
    return new ResponseEntity<Classificacao>(classificacaoService.updateClassificacao(classificacao), HttpStatus.OK);
}
@CrossOrigin(origins = "*")
@RequestMapping(value = "/classificacao/delete", method = RequestMethod.POST)
public ResponseEntity<Classificacao> deleteClassificacao(@RequestBody Classificacao classificacao,
        HttpServletRequest request)
        throws JsonParseException, JsonMappingException, IOException {
    
    return new ResponseEntity<Classificacao>(classificacaoService.deleteClassificacao(classificacao), HttpStatus.OK);
}

}
