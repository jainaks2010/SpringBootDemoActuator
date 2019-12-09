package com.demo.spring.boot.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.demo.spring.boot.actuator.authentication","com.demo.spring.boot.services.user"})
public class SpringBootDemoActuatorApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoActuatorApplication.class, args);
	}

}
