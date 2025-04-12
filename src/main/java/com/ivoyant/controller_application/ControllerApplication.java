package com.ivoyant.controller_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ControllerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ControllerApplication.class, args);
		System.out.println(context.getEnvironment());

	}
}
