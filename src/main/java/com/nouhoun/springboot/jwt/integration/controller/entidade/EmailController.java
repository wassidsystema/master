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
import com.nouhoun.springboot.jwt.integration.domain.entidade.Email;
import com.nouhoun.springboot.jwt.integration.service.entidade.EmailService;

/**
 * The Class EmailController.
 */
@Controller
@RequestMapping("/email/api")
public class EmailController {
	/** The Constant DEFAULT_EXCEPTION_MSG. */
	private static final String DEFAULT_EXCEPTION_MSG = "sysmgmt.base.emailcontrollerrest.defaultexception";

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(EmailController.class);

	/** The email Service. */
	@Autowired
	private EmailService emailService;

//===================================### EMAIL ####======================================
	/**
	 * Refresh emails.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the email response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/email/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Email>> refreshEmailPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Email>>(emailService.findEmailAll(requestString), HttpStatus.OK);
	}

	/**
	 * Fetch email paged.
	 *
	 * @param request the request
	 * @return the email response
	 */
	@RequestMapping(value = "/email/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Email>> fetchEmailPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Email>>(emailService.findEmailAll(requestString), HttpStatus.OK);
	}

	/**
	 * Insert email.
	 *
	 * @param request the request
	 * @return the email response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/email/insert", method = RequestMethod.POST)
	public ResponseEntity<Email> insertEmail(@RequestBody String emails, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		Email email = mapper.readValue(emails, Email.class);
		return new ResponseEntity<Email>(emailService.saveEmail(email), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/email/update", method = RequestMethod.POST)
	public ResponseEntity<Email> updateEmail(@RequestBody Email email, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Email>(emailService.updateEmail(email), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/email/delete", method = RequestMethod.POST)
	public ResponseEntity<Email> deleteEmail(@RequestBody Email email, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Email>(emailService.deleteEmail(email), HttpStatus.OK);
	}

}
