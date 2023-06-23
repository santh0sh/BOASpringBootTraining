package com.example.springmvc;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan("com")
@EntityScan("com.model")
@EnableJpaRepositories("com.dao")
@EnableSwagger2
public class SpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);
	}
	@Bean
	public Docket swaggerDoc() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com"))
				.build()
				.apiInfo(apiDetails());
		
	}
	private ApiInfo apiDetails() {
		return new ApiInfo(
				
				"Bank of America API",
				"Sample API for end users",
				"1.2.4",
				"Only for boa customers",
				new springfox.documentation.service.Contact("Amarjeet", "http://www.asreet-tech.com", "amar@mail.com"),
				"API License",
				"https://www.boa.com",
				Collections.emptyList());
	}

}
