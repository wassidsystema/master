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
import com.nouhoun.springboot.jwt.integration.domain.entidade.Status;
import com.nouhoun.springboot.jwt.integration.service.entidade.StatusService;

/**
 * The Class StatusController.
 */
@Controller
@RequestMapping("/status/api")
public class StatusController {
	/** The Constant DEFAULT_EXCEPTION_MSG. */
	private static final String DEFAULT_EXCEPTION_MSG = "sysmgmt.base.statuscontrollerrest.defaultexception";

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(StatusController.class);

	/** The status Service. */
	@Autowired
	private StatusService statusService;

//===================================### STATUS ####======================================
	/**
	 * Refresh statuss.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the status response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/status/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Status>> refreshStatusPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Status>>(statusService.findStatusAll(requestString), HttpStatus.OK);
	}

	/**
	 * Fetch status paged.
	 *
	 * @param request the request
	 * @return the status response
	 */
	@RequestMapping(value = "/status/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Status>> fetchStatusPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Status>>(statusService.findStatusAll(requestString), HttpStatus.OK);
	}

	/**
	 * Insert status.
	 *
	 * @param request the request
	 * @return the status response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/status/insert", method = RequestMethod.POST)
	public ResponseEntity<Status> insertStatus(@RequestBody String statuss, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		Status status = mapper.readValue(statuss, Status.class);
		return new ResponseEntity<Status>(statusService.saveStatus(status), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/status/update", method = RequestMethod.POST)
	public ResponseEntity<Status> updateStatus(@RequestBody Status status, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Status>(statusService.updateStatus(status), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/status/delete", method = RequestMethod.POST)
	public ResponseEntity<Status> deleteStatus(@RequestBody Status status, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Status>(statusService.deleteStatus(status), HttpStatus.OK);
	}

}
