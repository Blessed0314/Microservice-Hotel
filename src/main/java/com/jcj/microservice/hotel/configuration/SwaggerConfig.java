package com.jcj.microservice.hotel.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "Microservice Hotel API",
                version = "1.0.0",
                description = "Documentation of Microservice Vuelo API",
                contact = @Contact(
                        name = "Christian Daniel Villegas, Juan Miguel Rojas, Jean Heyller Palomino",
                        email = "christian.villegas@correounivalle.edu.co, juan.noriega@correounivalle.edu.co, jean.palomino@correounivalle.edu.co"
                ),
                license = @License(
                        name = "Open Source"
                )
        ),
        servers = {
                @Server(
                        url = "http://microservice-vuelo:8091",
                        description = "Local server"
                )
        }
)
public class SwaggerConfig {
}
