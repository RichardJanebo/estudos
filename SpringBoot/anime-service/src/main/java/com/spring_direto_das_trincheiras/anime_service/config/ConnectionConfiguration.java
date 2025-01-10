package com.spring_direto_das_trincheiras.anime_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import external.depemdency.Connection;

@Configuration
public class ConnectionConfiguration {
    @Bean
    public Connection connection(){
        return new Connection("localhost","Richard","goku");
    }
}
