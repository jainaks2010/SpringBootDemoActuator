package com.demo.spring.boot.actuator.authentication;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component("CustomInfoProvider")
public class CustomInfoProvider implements InfoContributor{

	@Override
	public void contribute(Builder builder) {
		builder.withDetail("application-type", "Spring Boot Java App");
	}

}
