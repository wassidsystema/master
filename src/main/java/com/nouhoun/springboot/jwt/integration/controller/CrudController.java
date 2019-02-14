/** create by system gera-java version 1.0.0 22/11/2018 23:20 : 48*/

package com.nouhoun.springboot.jwt.integration.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.nouhoun.springboot.jwt.integration.data.DicionarioHelper;
import com.nouhoun.springboot.jwt.integration.domain.GroupMenu;
import com.nouhoun.springboot.jwt.integration.service.JPAProcedures;

/**
 * The Class DicionarioController.
 */
@Controller
public class CrudController {

	/** The groupmenu Service. */
	@Autowired
	public JPAProcedures jpaProcedures;


	/**
	 * Fetch groupmenu paged.
	 *
	 * @param request the request
	 * @return the groupmenu response
	 */
	@RequestMapping(value = "/crud/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Object[]> fetchGroupMenuPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<Object[]>(jpaProcedures.fetchPage(DicionarioHelper.fetchPage()), HttpStatus.OK);
	}

	/**
	 * Insert groupmenu.
	 *
	 * @param request the request
	 * @return the groupmenu response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/crud/insert", method = RequestMethod.POST,headers = {"content-type=application/json"}, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> insertGroupMenu(@RequestBody CrudRequest req, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<String>(jpaProcedures.insert(DicionarioHelper.insert(req)), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/crud/update", method = RequestMethod.POST)
	public ResponseEntity<String> updateGroupMenu(@RequestBody GroupMenu groupmenu, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<String>(jpaProcedures.update(DicionarioHelper.update()), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/crud/delete", method = RequestMethod.POST)
	public ResponseEntity<String> deleteGroupMenu(@RequestBody GroupMenu groupmenu, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<String>(jpaProcedures.delete(DicionarioHelper.delete()), HttpStatus.OK);
	}


}
