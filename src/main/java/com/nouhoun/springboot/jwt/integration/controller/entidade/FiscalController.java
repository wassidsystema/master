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
import com.nouhoun.springboot.jwt.integration.domain.entidade.Cfop;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Cnae;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Regime;
import com.nouhoun.springboot.jwt.integration.service.entidade.CfopService;
import com.nouhoun.springboot.jwt.integration.service.entidade.CnaeService;
import com.nouhoun.springboot.jwt.integration.service.entidade.RegimeService;

/**
 * The Class FiscalController.
 */
@Controller
@RequestMapping("/fiscal/api")
public class FiscalController {
	/** The Constant DEFAULT_EXCEPTION_MSG. */
	private static final String DEFAULT_EXCEPTION_MSG = "sysmgmt.base.fiscalcontrollerrest.defaultexception";

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(FiscalController.class);

	/** The regime Service. */
	@Autowired
	private RegimeService regimeService;

	/** The cfop Service. */
	@Autowired
	private CfopService cfopService;

	/** The cnae Service. */
	@Autowired
	private CnaeService cnaeService;

//===================================### REGIME ####======================================
	/**
	 * Refresh regimes.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the regime response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/regime/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Regime>> refreshRegimePaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Regime>>(regimeService.findRegimeAll(requestString), HttpStatus.OK);
	}

	/**
	 * Fetch regime paged.
	 *
	 * @param request the request
	 * @return the regime response
	 */
	@RequestMapping(value = "/regime/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Regime>> fetchRegimePaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Regime>>(regimeService.findRegimeAll(requestString), HttpStatus.OK);
	}

	/**
	 * Insert regime.
	 *
	 * @param request the request
	 * @return the regime response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/regime/insert", method = RequestMethod.POST)
	public ResponseEntity<Regime> insertRegime(@RequestBody String regimes, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		Regime regime = mapper.readValue(regimes, Regime.class);
		return new ResponseEntity<Regime>(regimeService.saveRegime(regime), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/regime/update", method = RequestMethod.POST)
	public ResponseEntity<Regime> updateRegime(@RequestBody Regime regime, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Regime>(regimeService.updateRegime(regime), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/regime/delete", method = RequestMethod.POST)
	public ResponseEntity<Regime> deleteRegime(@RequestBody Regime regime, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Regime>(regimeService.deleteRegime(regime), HttpStatus.OK);
	}

//===================================### CFOP ####======================================
	/**
	 * Refresh cfops.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the cfop response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/cfop/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Cfop>> refreshCfopPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Cfop>>(cfopService.findCfopAll(requestString), HttpStatus.OK);
	}

	/**
	 * Fetch cfop paged.
	 *
	 * @param request the request
	 * @return the cfop response
	 */
	@RequestMapping(value = "/cfop/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Cfop>> fetchCfopPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Cfop>>(cfopService.findCfopAll(requestString), HttpStatus.OK);
	}

	/**
	 * Insert cfop.
	 *
	 * @param request the request
	 * @return the cfop response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/cfop/insert", method = RequestMethod.POST)
	public ResponseEntity<Cfop> insertCfop(@RequestBody String cfops, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		Cfop cfop = mapper.readValue(cfops, Cfop.class);
		return new ResponseEntity<Cfop>(cfopService.saveCfop(cfop), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/cfop/update", method = RequestMethod.POST)
	public ResponseEntity<Cfop> updateCfop(@RequestBody Cfop cfop, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Cfop>(cfopService.updateCfop(cfop), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/cfop/delete", method = RequestMethod.POST)
	public ResponseEntity<Cfop> deleteCfop(@RequestBody Cfop cfop, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Cfop>(cfopService.deleteCfop(cfop), HttpStatus.OK);
	}

//===================================### CNAE ####======================================
	/**
	 * Refresh cnaes.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the cnae response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/cnae/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Cnae>> refreshCnaePaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Cnae>>(cnaeService.findCnaeAll(requestString), HttpStatus.OK);
	}

	/**
	 * Fetch cnae paged.
	 *
	 * @param request the request
	 * @return the cnae response
	 */
	@RequestMapping(value = "/cnae/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Cnae>> fetchCnaePaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Cnae>>(cnaeService.findCnaeAll(requestString), HttpStatus.OK);
	}

	/**
	 * Insert cnae.
	 *
	 * @param request the request
	 * @return the cnae response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/cnae/insert", method = RequestMethod.POST)
	public ResponseEntity<Cnae> insertCnae(@RequestBody String cnaes, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		Cnae cnae = mapper.readValue(cnaes, Cnae.class);
		return new ResponseEntity<Cnae>(cnaeService.saveCnae(cnae), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/cnae/update", method = RequestMethod.POST)
	public ResponseEntity<Cnae> updateCnae(@RequestBody Cnae cnae, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Cnae>(cnaeService.updateCnae(cnae), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/cnae/delete", method = RequestMethod.POST)
	public ResponseEntity<Cnae> deleteCnae(@RequestBody Cnae cnae, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Cnae>(cnaeService.deleteCnae(cnae), HttpStatus.OK);
	}
}
