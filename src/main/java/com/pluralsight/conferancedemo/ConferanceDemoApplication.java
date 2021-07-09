package com.pluralsight.conferancedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.pluralsight.conferancedemo.controllers")
public class ConferanceDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(ConferanceDemoApplication.class, args);
	}

}
