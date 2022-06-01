package com.boa.boaspringmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com")
@EntityScan("com.boa.model")
@EnableJpaRepositories("com.boa.dao")
public class BoaSpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoaSpringMvcApplication.class, args);
	}

}
