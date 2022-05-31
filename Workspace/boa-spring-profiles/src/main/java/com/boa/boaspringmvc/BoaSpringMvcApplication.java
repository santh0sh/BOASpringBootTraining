package com.boa.boaspringmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class BoaSpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoaSpringMvcApplication.class, args);
	}

}
