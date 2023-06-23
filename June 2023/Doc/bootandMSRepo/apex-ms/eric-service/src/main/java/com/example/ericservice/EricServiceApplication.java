package com.example.ericservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com")
public class EricServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EricServiceApplication.class, args);
	}

}
