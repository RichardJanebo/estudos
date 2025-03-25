package com.devdojo.controller;

import com.devdojo.configuration.Connection;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("connection")
public class ConnectionController {

    private final Connection conMysql;

    public ConnectionController(Connection conMysql) {
        this.conMysql = conMysql;
    }

    @GetMapping
    public ResponseEntity<String> getConnections() {
        return ResponseEntity.ok(conMysql.toString());
    }
}
