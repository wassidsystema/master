/** create by system gera-java version 1.0.0 13/12/2018 22:13 : 24*/

package com.nouhoun.springboot.jwt.integration.controller.site;

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
import com.nouhoun.springboot.jwt.integration.domain.site.Preco;
import com.nouhoun.springboot.jwt.integration.service.site.PrecoService;


/**
 * The Class PrecoController.
 */
@Controller
@RequestMapping("/preco/api")
public class PrecoController 
{
	/** The Constant DEFAULT_EXCEPTION_MSG. */
	private static final String DEFAULT_EXCEPTION_MSG = "sysmgmt.base.precocontrollerrest.defaultexception";

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(PrecoController.class);

	/** The preco Service. */
@Autowired
private PrecoService precoService;


//===================================### PRECO ####======================================
/**
	 * Refresh precos.
	 *
	 * @param refreshInt the refresh int
	 * @param retList the ret list
	 * @param retPaged the ret paged
	 * @return the preco response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/preco/refresh", method = RequestMethod.GET)
	@ResponseBody
 public ResponseEntity<List<Preco>> refreshPrecoPaged(@RequestBody PaginationFilter requestString)
 {
     return new ResponseEntity<List<Preco>>(precoService.findPrecoAll(requestString), HttpStatus.OK);
 }

	/**
	 * Fetch preco paged.
	 *
	 * @param request the request
	 * @return the preco response
	 */
	@RequestMapping(value = "/preco/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Preco>> fetchPrecoPaged(@RequestBody PaginationFilter requestString)
	 {
     return new ResponseEntity<List<Preco>>(precoService.findPrecoAll(requestString), HttpStatus.OK);
 }

	/**
	 * Insert preco.
	 *
	 * @param request the request
	 * @return the preco response
	 */
@CrossOrigin(origins = "*")
@RequestMapping(value = "/preco/insert", method = RequestMethod.POST)
public ResponseEntity<Preco> insertPreco(@RequestBody String precos,
        HttpServletRequest request)
        throws JsonParseException, JsonMappingException, IOException {
    
     ObjectMapper mapper = new ObjectMapper();
     Preco preco = mapper.readValue(precos, Preco.class);
    return new ResponseEntity<Preco>(precoService.savePreco(preco), HttpStatus.OK);
}
@CrossOrigin(origins = "*")
@RequestMapping(value = "/preco/update", method = RequestMethod.POST)
public ResponseEntity<Preco> updatePreco(@RequestBody Preco preco,
        HttpServletRequest request)
        throws JsonParseException, JsonMappingException, IOException {
    
    return new ResponseEntity<Preco>(precoService.updatePreco(preco), HttpStatus.OK);
}
@CrossOrigin(origins = "*")
@RequestMapping(value = "/preco/delete", method = RequestMethod.POST)
public ResponseEntity<Preco> deletePreco(@RequestBody Preco preco,
        HttpServletRequest request)
        throws JsonParseException, JsonMappingException, IOException {
    
    return new ResponseEntity<Preco>(precoService.deletePreco(preco), HttpStatus.OK);
}

}
