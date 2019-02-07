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
import com.nouhoun.springboot.jwt.integration.domain.entidade.Notes;
import com.nouhoun.springboot.jwt.integration.service.entidade.NotesService;

/**
 * The Class NotesController.
 */
@Controller
@RequestMapping("/notes/api")
public class NotesController {
	/** The Constant DEFAULT_EXCEPTION_MSG. */
	private static final String DEFAULT_EXCEPTION_MSG = "sysmgmt.base.notescontrollerrest.defaultexception";

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(NotesController.class);

	/** The notes Service. */
	@Autowired
	private NotesService notesService;

//===================================### NOTES ####======================================
	/**
	 * Refresh notess.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the notes response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/notes/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Notes>> refreshNotesPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Notes>>(notesService.findNotesAll(requestString), HttpStatus.OK);
	}

	/**
	 * Fetch notes paged.
	 *
	 * @param request the request
	 * @return the notes response
	 */
	@RequestMapping(value = "/notes/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Notes>> fetchNotesPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Notes>>(notesService.findNotesAll(requestString), HttpStatus.OK);
	}

	/**
	 * Insert notes.
	 *
	 * @param request the request
	 * @return the notes response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/notes/insert", method = RequestMethod.POST)
	public ResponseEntity<Notes> insertNotes(@RequestBody String notess, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		Notes notes = mapper.readValue(notess, Notes.class);
		return new ResponseEntity<Notes>(notesService.saveNotes(notes), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/notes/update", method = RequestMethod.POST)
	public ResponseEntity<Notes> updateNotes(@RequestBody Notes notes, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Notes>(notesService.updateNotes(notes), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/notes/delete", method = RequestMethod.POST)
	public ResponseEntity<Notes> deleteNotes(@RequestBody Notes notes, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Notes>(notesService.deleteNotes(notes), HttpStatus.OK);
	}

}
