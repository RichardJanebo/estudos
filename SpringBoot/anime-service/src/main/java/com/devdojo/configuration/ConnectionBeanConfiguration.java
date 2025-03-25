package com.devdojo.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConnectionBeanConfiguration {
    private final ConnectionConfigurationProperties properties;


    public ConnectionBeanConfiguration(ConnectionConfigurationProperties properties) {
        this.properties = properties;
    }


    @Bean
    public Connection conMysql() {
        return new Connection(properties.localhost(), properties.username(), properties.password());
    }

    @Bean
    public Connection conMongo() {
        return new Connection(properties.localhost(), properties.username(), properties.password());
    }

}
