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
import com.nouhoun.springboot.jwt.integration.domain.entidade.Arquivo;
import com.nouhoun.springboot.jwt.integration.service.entidade.ArquivoService;

/**
 * The Class ArquivoController.
 */
@Controller
@RequestMapping("/arquivo/api")
public class ArquivoController {
	/** The Constant DEFAULT_EXCEPTION_MSG. */
	private static final String DEFAULT_EXCEPTION_MSG = "sysmgmt.base.arquivocontrollerrest.defaultexception";

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(ArquivoController.class);

	/** The arquivo Service. */
	@Autowired
	private ArquivoService arquivoService;

//===================================### ARQUIVO ####======================================
	/**
	 * Refresh arquivos.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the arquivo response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/arquivo/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Arquivo>> refreshArquivoPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Arquivo>>(arquivoService.findArquivoAll(requestString), HttpStatus.OK);
	}

	/**
	 * Fetch arquivo paged.
	 *
	 * @param request the request
	 * @return the arquivo response
	 */
	@RequestMapping(value = "/arquivo/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Arquivo>> fetchArquivoPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Arquivo>>(arquivoService.findArquivoAll(requestString), HttpStatus.OK);
	}

	/**
	 * Insert arquivo.
	 *
	 * @param request the request
	 * @return the arquivo response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/arquivo/insert", method = RequestMethod.POST)
	public ResponseEntity<Arquivo> insertArquivo(@RequestBody String arquivos, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		Arquivo arquivo = mapper.readValue(arquivos, Arquivo.class);
		return new ResponseEntity<Arquivo>(arquivoService.saveArquivo(arquivo), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/arquivo/update", method = RequestMethod.POST)
	public ResponseEntity<Arquivo> updateArquivo(@RequestBody Arquivo arquivo, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Arquivo>(arquivoService.updateArquivo(arquivo), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/arquivo/delete", method = RequestMethod.POST)
	public ResponseEntity<Arquivo> deleteArquivo(@RequestBody Arquivo arquivo, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Arquivo>(arquivoService.deleteArquivo(arquivo), HttpStatus.OK);
	}

}
