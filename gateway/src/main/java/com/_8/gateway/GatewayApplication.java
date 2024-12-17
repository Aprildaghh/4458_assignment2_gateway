package com._8.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}


	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p
						.path("/api/v1/admin/**")
						.uri("http://localhost:8080/"))
				.route(p -> p
						.path("/api/v1/mobile/**")
						.uri("http://localhost:8080/"))
				.route(p -> p
						.path("/api/v1/4453/**")
						.uri("http://localhost:7070/"))
				.build();
	}

}
//