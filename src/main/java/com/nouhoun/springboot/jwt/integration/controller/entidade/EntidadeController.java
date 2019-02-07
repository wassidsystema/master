/** create by system gera-java version 1.0.0 17/12/2018 21:54 : 13*/

package com.nouhoun.springboot.jwt.integration.controller.entidade;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import com.nouhoun.springboot.jwt.integration.domain.DTO.entidade.EmpresaDTO;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Entidade;
import com.nouhoun.springboot.jwt.integration.domain.security.User;
import com.nouhoun.springboot.jwt.integration.service.entidade.EntidadeService;

/**
 * The Class EmpresaController.
 */
@Controller
@RequestMapping("/entidade/api")
public class EntidadeController {
	/** The Constant DEFAULT_EXCEPTION_MSG. */
	private static final String DEFAULT_EXCEPTION_MSG = "sysmgmt.base.empresacontrollerrest.defaultexception";

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(EntidadeController.class);

	/** The entidade Service. */
	@Autowired
	private EntidadeService entidadeService;

//===================================### ENTIDADE ####======================================
	/**
	 * Refresh entidades.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the entidade response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/entidade/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Entidade>> refreshEntidadePaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Entidade>>(entidadeService.findEntidadeAll(requestString), HttpStatus.OK);
	}

	/**
	 * Fetch entidade paged.
	 *
	 * @param request the request
	 * @return the entidade response
	 */
	@RequestMapping(value = "/entidade/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Entidade>> fetchEntidadePaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Entidade>>(entidadeService.findEntidadeAll(requestString), HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/findEntidadeByUserId", method = RequestMethod.POST)
	public Entidade findUserByEmail(@RequestBody Integer id, HttpServletRequest request, HttpServletResponse response)
			throws JsonParseException, JsonMappingException, IOException {
		Entidade entidade =  entidadeService.findEntidadeByUserId(id);
	//	user.setInfoUser(getInfoUser(user));
		return entidade;
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/findEntidadeById", method = RequestMethod.POST, headers = {"content-type=application/json","content-type=application/xml"})
	public @ResponseBody Entidade findUserById(@RequestBody Integer id, HttpServletRequest request, HttpServletResponse response)
			throws JsonParseException, JsonMappingException, IOException {

		return entidadeService.findEntidadeById(id);
	}

	/**
	 * Insert entidade.
	 *
	 * @param request the request
	 * @return the entidade response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/entidade/insert", method = RequestMethod.POST)
	public ResponseEntity<Entidade> insertEntidade(@RequestBody String entidades, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		Entidade entidade = mapper.readValue(entidades, Entidade.class);
		System.out.println(entidade.getNome());
		return new ResponseEntity<Entidade>(entidadeService.saveEntidade(entidade), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/entidade/update", method = RequestMethod.POST)
	public ResponseEntity<Entidade> updateEntidade(@RequestBody Entidade entidade, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return null; //new ResponseEntity<Entidade>(entidadeService.updateEntidade(entidade), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/entidade/delete", method = RequestMethod.POST)
	public ResponseEntity<Entidade> deleteEntidade(@RequestBody Entidade entidade, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return null; // new ResponseEntity<Entidade>(entidadeService.deleteEntidade(entidade), HttpStatus.OK);
	}

}
