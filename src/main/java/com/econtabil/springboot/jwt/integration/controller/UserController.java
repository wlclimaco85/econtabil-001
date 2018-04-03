package com.nouhoun.springboot.jwt.integration.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nouhoun.springboot.jwt.api.APIResponse;
import com.nouhoun.springboot.jwt.integration.domain.Jogo;
import com.nouhoun.springboot.jwt.integration.domain.User;
import com.nouhoun.springboot.jwt.integration.domain.UserDTO;
import com.nouhoun.springboot.jwt.integration.service.JogoService;
import com.nouhoun.springboot.jwt.integration.service.UserService;


@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private JogoService jogoService;


	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/user/insert", method = RequestMethod.POST)
	public @ResponseBody APIResponse createNewMensagem(@Valid User user, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		List<String> erros = new ArrayList<String>();
		User userExists = userService.findUserByEmail(user.getEmail());
		if (userExists != null) {
			erros.add("There is already a user registered with the email provided");
		}

			userService.saveUser(user);
			modelAndView.addObject("successMessage", "User has been registered successfully");
			modelAndView.addObject("user", new User());
			modelAndView.setViewName("registration");


	HashMap<String, Object> authResp = new HashMap<String, Object>();
	Authentication auth = SecurityContextHolder.getContext().getAuthentication();

	Object token = auth.getCredentials();
	authResp.put("token", token);
	authResp.put("user", user);
	authResp.put("Error", erros);


    return APIResponse.toOkResponse(authResp);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/user/update", method = RequestMethod.POST)
	public @ResponseBody APIResponse updateMensagem(@Valid User user, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		List<String> erros = new ArrayList<String>();
		User userExists = userService.findUserByEmail(user.getEmail());
		if (userExists != null) {
			erros.add("There is already a user registered with the email provided");
		}

			userService.saveUser(user);
			modelAndView.addObject("successMessage", "User has been registered successfully");
			modelAndView.addObject("user", new User());
			modelAndView.setViewName("registration");


	HashMap<String, Object> authResp = new HashMap<String, Object>();
	Authentication auth = SecurityContextHolder.getContext().getAuthentication();

	Object token = auth.getCredentials();
	authResp.put("token", token);
	authResp.put("user", user);
	authResp.put("Error", erros);


    return APIResponse.toOkResponse(authResp);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/user/fetchByUser", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<List<UserDTO>> fetchByUser(@RequestBody String userString, HttpServletRequest request,
			HttpServletResponse response) throws JsonParseException, JsonMappingException, IOException {
		List<String> erros = new ArrayList<String>();
		ObjectMapper mapper = new ObjectMapper();
		User user = mapper.readValue(userString, User.class);
		User userExists = userService.findUserByEmail(user.getEmail());
		List<Jogo> jogos= jogoService.findJogoByUser(userExists);
		UserDTO dto =new UserDTO();
		dto.setId(userExists.getId());
		dto.setEmail(userExists.getEmail());
		dto.setPassword(userExists.getPassword());
		dto.setName(userExists.getName());
		dto.setLastName(userExists.getLastName());
		dto.setActive(userExists.getActive());
		dto.setRoles(userExists.getRoles());
		dto.setEnabled(userExists.getEnabled());
		dto.setJogos(jogos);
		
		return new ResponseEntity<List<UserDTO>>(Arrays.asList(dto), HttpStatus.OK);
	}

	private void createAuthResponse(User user, HashMap<String, Object> authResp,ArrayList<String> erros) {
        String token = "";
        		//Jwts.builder().setSubject(user.getEmail())
               // .claim("role", user.getRole().name()).setIssuedAt(new Date())
              // .signWith(SignatureAlgorithm.HS256, JWTTokenAuthFilter.JWT_KEY).compact();
        authResp.put("token", token);
        authResp.put("user", user);
        authResp.put("Error", erros);
    }


}
