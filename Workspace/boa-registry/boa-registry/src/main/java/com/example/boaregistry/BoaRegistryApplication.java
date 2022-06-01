package com.example.boaregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BoaRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoaRegistryApplication.class, args);
	}

}
