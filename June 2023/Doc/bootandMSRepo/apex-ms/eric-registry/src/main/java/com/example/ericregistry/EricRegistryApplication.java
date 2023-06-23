package com.example.ericregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EricRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EricRegistryApplication.class, args);
	}

}
