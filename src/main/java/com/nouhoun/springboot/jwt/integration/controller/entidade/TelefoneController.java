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
import com.nouhoun.springboot.jwt.integration.domain.entidade.Telefone;
import com.nouhoun.springboot.jwt.integration.service.entidade.TelefoneService;

/**
 * The Class TelefoneController.
 */
@Controller
@RequestMapping("/telefone/api")
public class TelefoneController {
	/** The Constant DEFAULT_EXCEPTION_MSG. */
	private static final String DEFAULT_EXCEPTION_MSG = "sysmgmt.base.telefonecontrollerrest.defaultexception";

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(TelefoneController.class);

	/** The telefone Service. */
	@Autowired
	private TelefoneService telefoneService;

//===================================### TELEFONE ####======================================
	/**
	 * Refresh telefones.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the telefone response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/telefone/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Telefone>> refreshTelefonePaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Telefone>>(telefoneService.findTelefoneAll(requestString), HttpStatus.OK);
	}

	/**
	 * Fetch telefone paged.
	 *
	 * @param request the request
	 * @return the telefone response
	 */
	@RequestMapping(value = "/telefone/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Telefone>> fetchTelefonePaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Telefone>>(telefoneService.findTelefoneAll(requestString), HttpStatus.OK);
	}

	/**
	 * Insert telefone.
	 *
	 * @param request the request
	 * @return the telefone response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/telefone/insert", method = RequestMethod.POST)
	public ResponseEntity<Telefone> insertTelefone(@RequestBody String telefones, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		Telefone telefone = mapper.readValue(telefones, Telefone.class);
		return new ResponseEntity<Telefone>(telefoneService.saveTelefone(telefone), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/telefone/update", method = RequestMethod.POST)
	public ResponseEntity<Telefone> updateTelefone(@RequestBody Telefone telefone, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Telefone>(telefoneService.updateTelefone(telefone), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/telefone/delete", method = RequestMethod.POST)
	public ResponseEntity<Telefone> deleteTelefone(@RequestBody Telefone telefone, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Telefone>(telefoneService.deleteTelefone(telefone), HttpStatus.OK);
	}

}
