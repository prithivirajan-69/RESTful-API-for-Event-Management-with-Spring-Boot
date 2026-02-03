package com.chatapp.realtimechat.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Event Management API",
                version = "1.0",
                description = "REST API for managing events"
        )
)
public class OpenApiConfig {
}
