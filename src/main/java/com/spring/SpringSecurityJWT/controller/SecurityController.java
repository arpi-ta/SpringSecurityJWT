package com.spring.SpringSecurityJWT.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @RequestMapping("/welcome")
    public String getName(){
        return "Hi!";
    }
}
