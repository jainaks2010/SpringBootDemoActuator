package com.demo.spring.boot.actuator.authentication;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class CustomAuthenticationConfiguration extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		AuthenticationProvider authenticationProvider = new CustomAuthenticationProvider();
		auth.authenticationProvider(authenticationProvider);
	}

}
