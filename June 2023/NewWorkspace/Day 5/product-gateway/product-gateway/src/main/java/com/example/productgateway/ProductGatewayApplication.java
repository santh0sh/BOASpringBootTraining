package com.example.productgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductGatewayApplication.class, args);
	}
	
	@Bean
	RouteLocator gatewayRoute(RouteLocatorBuilder builder) {
		return builder.routes().route("shoppingCartRoute", routSpec -> routSpec.path("/shoppingcart/**")
				.filters(f -> f.addResponseHeader("X-Response-Header", "SCS")).uri("lb://cart-service")

		).build();

	}

}
