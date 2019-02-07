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
import com.nouhoun.springboot.jwt.integration.domain.entidade.Endereco;
import com.nouhoun.springboot.jwt.integration.service.entidade.EnderecoService;


/**
 * The Class EnderecoController.
 */
@Controller
@RequestMapping("/endereco/api")
public class EnderecoController 
{
	/** The Constant DEFAULT_EXCEPTION_MSG. */
	private static final String DEFAULT_EXCEPTION_MSG = "sysmgmt.base.enderecocontrollerrest.defaultexception";

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(EnderecoController.class);

	/** The endereco Service. */
@Autowired
private EnderecoService enderecoService;


//===================================### ENDERECO ####======================================
/**
	 * Refresh enderecos.
	 *
	 * @param refreshInt the refresh int
	 * @param retList the ret list
	 * @param retPaged the ret paged
	 * @return the endereco response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/endereco/refresh", method = RequestMethod.GET)
	@ResponseBody
 public ResponseEntity<List<Endereco>> refreshEnderecoPaged(@RequestBody PaginationFilter requestString)
 {
     return new ResponseEntity<List<Endereco>>(enderecoService.findEnderecoAll(requestString), HttpStatus.OK);
 }

	/**
	 * Fetch endereco paged.
	 *
	 * @param request the request
	 * @return the endereco response
	 */
	@RequestMapping(value = "/endereco/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Endereco>> fetchEnderecoPaged(@RequestBody PaginationFilter requestString)
	 {
     return new ResponseEntity<List<Endereco>>(enderecoService.findEnderecoAll(requestString), HttpStatus.OK);
 }

	/**
	 * Insert endereco.
	 *
	 * @param request the request
	 * @return the endereco response
	 */
@CrossOrigin(origins = "*")
@RequestMapping(value = "/endereco/insert", method = RequestMethod.POST)
public ResponseEntity<Endereco> insertEndereco(@RequestBody String enderecos,
        HttpServletRequest request)
        throws JsonParseException, JsonMappingException, IOException {
    
     ObjectMapper mapper = new ObjectMapper();
     Endereco endereco = mapper.readValue(enderecos, Endereco.class);
    return new ResponseEntity<Endereco>(enderecoService.saveEndereco(endereco), HttpStatus.OK);
}
@CrossOrigin(origins = "*")
@RequestMapping(value = "/endereco/update", method = RequestMethod.POST)
public ResponseEntity<Endereco> updateEndereco(@RequestBody Endereco endereco,
        HttpServletRequest request)
        throws JsonParseException, JsonMappingException, IOException {
    
    return new ResponseEntity<Endereco>(enderecoService.updateEndereco(endereco), HttpStatus.OK);
}
@CrossOrigin(origins = "*")
@RequestMapping(value = "/endereco/delete", method = RequestMethod.POST)
public ResponseEntity<Endereco> deleteEndereco(@RequestBody Endereco endereco,
        HttpServletRequest request)
        throws JsonParseException, JsonMappingException, IOException {
    
    return new ResponseEntity<Endereco>(enderecoService.deleteEndereco(endereco), HttpStatus.OK);
}

}
