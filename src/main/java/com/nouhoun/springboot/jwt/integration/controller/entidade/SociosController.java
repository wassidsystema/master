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
import com.nouhoun.springboot.jwt.integration.domain.entidade.Socio;
import com.nouhoun.springboot.jwt.integration.service.entidade.SocioService;

/**
 * The Class SociosController.
 */
@Controller
@RequestMapping("/socios/api")
public class SociosController {
	/** The Constant DEFAULT_EXCEPTION_MSG. */
	private static final String DEFAULT_EXCEPTION_MSG = "sysmgmt.base.socioscontrollerrest.defaultexception";

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(SociosController.class);

	/** The socio Service. */
	@Autowired
	private SocioService socioService;

//===================================### SOCIO ####======================================
	/**
	 * Refresh socios.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the socio response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/socio/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Socio>> refreshSocioPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Socio>>(socioService.findSocioAll(requestString), HttpStatus.OK);
	}

	/**
	 * Fetch socio paged.
	 *
	 * @param request the request
	 * @return the socio response
	 */
	@RequestMapping(value = "/socio/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Socio>> fetchSocioPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Socio>>(socioService.findSocioAll(requestString), HttpStatus.OK);
	}

	/**
	 * Insert socio.
	 *
	 * @param request the request
	 * @return the socio response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/socio/insert", method = RequestMethod.POST)
	public ResponseEntity<Socio> insertSocio(@RequestBody String socios, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		Socio socio = mapper.readValue(socios, Socio.class);
		return new ResponseEntity<Socio>(socioService.saveSocio(socio), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/socio/update", method = RequestMethod.POST)
	public ResponseEntity<Socio> updateSocio(@RequestBody Socio socio, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Socio>(socioService.updateSocio(socio), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/socio/delete", method = RequestMethod.POST)
	public ResponseEntity<Socio> deleteSocio(@RequestBody Socio socio, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Socio>(socioService.deleteSocio(socio), HttpStatus.OK);
	}

}
