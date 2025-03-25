package com.devdojo.configuration;

import lombok.Getter;
import lombok.ToString;


@ToString
@Getter
public class Connection {
    private final String host;
    private final String username;
    private final String password;

    public Connection(String host, String username, String password) {
        this.host = host;
        this.username = username;
        this.password = password;
    }


}
