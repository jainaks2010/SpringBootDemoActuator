package com.demo.spring.boot.actuator.authentication;

import java.util.Collections;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

public class CustomAuthenticationProvider implements AuthenticationProvider{

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String username = authentication.getName();
		String password = (String) authentication.getCredentials();
		if(authenticate(username, password)) {
			return new UsernamePasswordAuthenticationToken(username,password,Collections.emptyList());
		}else {
			throw new RuntimeException("Not able to authenticate");	
		}
		
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}
	
	private boolean authenticate(String username,String password) {
		//Write any third party authentication
		if(username.equals("admin2") && password.equals("password123")) {
			return true;
		}
		return false;
	}

}
