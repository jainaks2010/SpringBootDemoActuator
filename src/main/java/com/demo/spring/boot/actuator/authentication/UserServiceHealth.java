package com.demo.spring.boot.actuator.authentication;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.demo.spring.boot.services.user.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Component
@RestControllerEndpoint(id="user-service")
public class UserServiceHealth {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/health")
	public Map<String,String> checkUserServiceHealth() throws JsonMappingException, JsonProcessingException {
		return userService.getUser(1);
	}

}
