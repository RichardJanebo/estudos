package com.spring_direto_das_trincheiras.anime_service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @GetMapping("login")
    public String getLogin(){
      
        return "login";
    }
    
}