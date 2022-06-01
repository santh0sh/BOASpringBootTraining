package com.boa.boaspringmvc;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan("com")
@EnableSwagger2
public class BoaSpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoaSpringMvcApplication.class, args);
	}

	public Docket swaggerConfig() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com"))
				.build()
				.apiInfo(apiInfo());
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfo(
				"BOA",
				"Spring Boot Training",
				"1.0",
				"Free For Internal Use",
				new springfox.documentation.service.Contact("Sandy", "http://www.sandy.blog.com", "sandy@boa.com"),
				"API Licence",
				"http://www.boa.com",
				Collections.emptyList());
	}
}
