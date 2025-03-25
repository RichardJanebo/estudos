package com.devdojo.configuration;


import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "database")
public record ConnectionConfigurationProperties(String localhost, String username, String password) {
}
