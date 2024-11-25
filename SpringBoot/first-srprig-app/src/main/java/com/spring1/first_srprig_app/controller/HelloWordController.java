package com.spring1.first_srprig_app.controller;

import org.springframework.web.bind.annotation.RestController;

import com.spring1.first_srprig_app.domain.User;
import com.spring1.first_srprig_app.services.HelloWordService;

import lombok.Getter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/hello-word")
public class HelloWordController {
    @Autowired
    private HelloWordService helloWordService;


    @GetMapping
    public String helloWord(){
        return helloWordService.helloWord("Richard");
    }


    @PostMapping()
    public String helloWordPost(@RequestBody User body){
        return "Hello Word " + body.getEmail();
    }
    
}
