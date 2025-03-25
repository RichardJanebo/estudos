package com.devdojo.user_service.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "database")
public record ConnectionProperties (String url, String username,String password){}
