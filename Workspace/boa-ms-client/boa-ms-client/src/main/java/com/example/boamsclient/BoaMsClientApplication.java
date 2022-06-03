package com.example.boamsclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com")
@EnableFeignClients
public class BoaMsClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoaMsClientApplication.class, args);
	}

}
