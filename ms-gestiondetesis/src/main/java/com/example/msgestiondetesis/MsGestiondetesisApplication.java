package com.example.msgestiondetesis;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication

public class MsGestiondetesisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsGestiondetesisApplication.class, args);
    }
    @Bean
    public OpenAPI CustumOpenAPI(){
        return new OpenAPI().info(new Info()
                .title("OPEN API MICROSERVICIO Gestiondetesis")
                .version("0.0.1")
                .description("servicio web Gestiondetesis")
                .termsOfService("http://swagger.io/terms")
                .license(new License().name("Apache 2.0").url("http://springdoc.org"))
        );
    }
}
