package com.alejandro.apiRest.Settings;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebSettings {

    @Bean
    public OpenAPI customizedAPI(){
        return new OpenAPI().info(new Info()
                .title("API Rest for virtual shop")
                .version("1.0")
                .description("This API provides different endpoints that contain information" +
                        "\nabout different requests that users can make. For more details, it's " +
                        "\nrecommended to access each one of RestControllers, and test the given " +
                        "\nendpoints.")
                .termsOfService("https://swagger.io/terms/")
                .license(new License().name("Apache 2.0").url("https://springdoc.org/")));
    }
}
