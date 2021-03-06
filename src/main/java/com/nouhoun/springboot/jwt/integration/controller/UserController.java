package com.nouhoun.springboot.jwt.integration.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nouhoun.springboot.jwt.api.APIResponse;
import com.nouhoun.springboot.jwt.integration.domain.UserDTO;
import com.nouhoun.springboot.jwt.integration.domain.DTO.entidade.UserDTO2;
import com.nouhoun.springboot.jwt.integration.domain.security.Authority;
import com.nouhoun.springboot.jwt.integration.domain.security.User;
import com.nouhoun.springboot.jwt.integration.service.UserService;

@Controller
@RestController
@RequestMapping("/user")
public class UserController {

	private static Logger LOG = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;

	// @Autowired
	// private JogoService jogoService;
	public int getfifteen() {
		return 15;
	}
	
	@Autowired
	private PasswordEncoder passwordEncoder;

    /**
     * Register new user
     * POST body expected in the format - {"user":{"displayName":"Display Name", "email":"something@somewhere.com"}}
     *
     * @param userDTO
     * @return
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST, headers = {"content-type=application/json","content-type=application/xml"})
    public @ResponseBody APIResponse register(@RequestBody UserDTO userDTO,
                                              HttpServletRequest request) throws NoSuchPaddingException, UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException, InvalidKeySpecException {
        Validate.isTrue(StringUtils.isNotBlank(userDTO.getEmail()), "Email is blank");
        Validate.isTrue(StringUtils.isNotBlank(userDTO.getEncryptedPassword()), "Encrypted password is blank");
        Validate.isTrue(StringUtils.isNotBlank(userDTO.getName()), "Display name is blank");
      //  String password = decryptPassword(userDTO);

        LOG.info("Looking for user by email: "+userDTO.getEmail());
      //  if(userService.isEmailExists(userDTO.getEmail())) {
      //      return APIResponse.toErrorResponse("Email is taken");
      //  }
        
        LOG.info("Creating user: "+userDTO.getEmail());
        User user = new User();
        user.setEmail(userDTO.getEmail());
    //    user.setRoles(userDTO.getRoles());
        user.setUsername(userDTO.getName());
        user.setName(userDTO.getName());
   //     user.setPassword(userDTO.getPassword());
        user.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        user.setEnabled(true);
        List<Authority> roles = new ArrayList<Authority>();
        roles.add(new Authority(new Long(1)));
        roles.add(new Authority(new Long(2)));
        user.setAuthorities(roles);
        user.setLastPasswordResetDate(new Date(System.currentTimeMillis() + 1000 * 1000));
        userService.saveUser(user, request);

        HashMap<String, Object> authResp = new HashMap<>();

        return APIResponse.toOkResponse(authResp);
    }

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/findUserByEmail", method = RequestMethod.POST, headers = {"content-type=application/json"}, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<User> findUserByEmail(@RequestBody UserDTO2 email)
			throws JsonParseException, JsonMappingException, IOException {
	//	ObjectMapper mapper = new ObjectMapper();
	//	UserDTO users = mapper.readValue(email, UserDTO.class);
		User user =  userService.findUserByEmail(email.getUsername());
	//	user.setInfoUser(getInfoUser(user));
		HttpStatus status = HttpStatus.CREATED;
		return new ResponseEntity(user, status);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/fetchByUser", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<List<UserDTO>> fetchByUser(@RequestBody String userString,
			HttpServletRequest request, HttpServletResponse response)
			throws JsonParseException, JsonMappingException, IOException {
		List<String> erros = new ArrayList<String>();
		ObjectMapper mapper = new ObjectMapper();
		User user = mapper.readValue(userString, User.class);
		User userExists = userService.findUserByEmail(user.getEmail());
		// List<Jogo> jogos= jogoService.findJogoByUser(userExists);
		UserDTO dto = new UserDTO();
		dto.setId(userExists.getId().intValue());
		dto.setEmail(userExists.getEmail());
		dto.setPassword(userExists.getPassword());
		dto.setName(userExists.getUsername());
		//dto.setActive(userExists.getActive());
	//	dto.setRoles(userExists.getRoles());
		dto.setEnabled(userExists.getEnabled());
		// dto.setJogos(jogos);

		return new ResponseEntity<List<UserDTO>>(Arrays.asList(dto), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/user/fetchAll", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<List<User>> fetchByAllUser(@RequestBody String userString,
			HttpServletRequest request, HttpServletResponse response)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<List<User>>(userService.findAllUser(), HttpStatus.OK);
	}


}
