package com.ticket.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfg {
	
	@Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Train Ticket Booking API")
                .version("1.0")
                .description("Train Ticket Booking API implemented using Spring Boot RESTful service"));
    }

}
