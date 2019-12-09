package com.demo.spring.boot.services.user;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service("userService")
public class UserService {

	public Map<String,String> getUser(Integer userId) throws JsonMappingException, JsonProcessingException {
		String url = "https://jsonplaceholder.typicode.com/todos/"+userId;
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		ObjectMapper mapper = new ObjectMapper();
		Map<String, String> userDetails =mapper.readValue(response.getBody(), new TypeReference<Map<String, String>>() {});
		return userDetails;
		
	}
}
