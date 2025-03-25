package com.devdojo.user_service.configuration;

import org.springframework.stereotype.Component;

@Component
public class ConnectionBean {
    private final ConnectionProperties connectionProperties;

    public ConnectionBean(ConnectionProperties connectionProperties){
        this.connectionProperties =  connectionProperties;
    }
    public Connection connection(){
        return new Connection(connectionProperties.url(), connectionProperties.username(), connectionProperties.password());
    }
}
