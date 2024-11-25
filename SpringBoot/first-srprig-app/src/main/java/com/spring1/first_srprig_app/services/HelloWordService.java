package com.spring1.first_srprig_app.services;

import org.springframework.stereotype.Service;

@Service
public class HelloWordService {
    public String helloWord(String name){
        return "Hello word " + name;
    }
}
