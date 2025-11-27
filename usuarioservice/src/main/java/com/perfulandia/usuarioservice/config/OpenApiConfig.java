package com.perfulandia.usuarioservice.config;

import io.swagger.v3.oas.models.*;
import io.swagger.v3.oas.models.info.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        //configuracion d swagger
        return new OpenAPI()
                .info(new Info()
                        .title("usuarioservice 😊")
                        .version("1.0")
                        .description("Microservicio de Usuario API")
                        .contact(new Contact()
                                .name("Génesis Montero")
                                .email("gen.montero@duocuc.cl")
                                .url("https://ev2-fullstackii-2025.onrender.com")
                        ));



    }
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**" )
                        .allowedOrigins("https://ev2-fullstackii-2025.onrender.com" )
                        .allowedMethods("GET", "POST", "PUT", "DELETE" )
                        .allowedHeaders("*" );//permite las solicitudes entrantes
            }
        };
    }
}
