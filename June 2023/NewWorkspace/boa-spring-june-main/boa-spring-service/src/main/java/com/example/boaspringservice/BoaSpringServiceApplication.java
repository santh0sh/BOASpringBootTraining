package com.example.boaspringservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
@EnableEurekaClient
public class BoaSpringServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoaSpringServiceApplication.class, args);
	}

}