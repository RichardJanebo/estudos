package com.devdojo.user_service.configuration;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Connection {
    private String url;
    private String userName;
    private String password;

    public Connection(String url, String userName, String password) {
        this.url = url;
        this.userName = userName;
        this.password = password;
    }


}
