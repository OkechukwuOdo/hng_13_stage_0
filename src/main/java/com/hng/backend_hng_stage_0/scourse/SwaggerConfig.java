package com.hng.backend_hng_stage_0.scourse;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
@RequiredArgsConstructor
public class SwaggerConfig {
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Loyster Application API")
                        .description("Loyster offers an all-in-one digital wallet that allows users to link their existing financial\n" +
                                "institutions making it easier and faster to transact, all from a mobile app.\n" +
                                "In addition, it gives a smart payment terminal system that enables transport providers to\n" +
                                "collect payment quickly and safely.")
                        .version("v0.0.1")
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://springdoc.org"))
                        .contact(new Contact()
                                .email("")
                                .name("")
                                .url("")
                        )
                );
//                .components(new Components()
//                        .addSecuritySchemes("bearer",
//                                new SecurityScheme()
//                                        .type(SecurityScheme.Type.HTTP)
//                                        .scheme("bearer")
//                                        .bearerFormat("JWT"))
//                );



    }



}