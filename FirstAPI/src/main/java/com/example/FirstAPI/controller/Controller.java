package com.example.FirstAPI.controller;

import com.example.FirstAPI.service.HService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    HService service;

    @GetMapping("/")
    public String greet(){
        return service.greet();
    }
    @GetMapping("/login")
    public String Login(){
        return service.login();
    }
}
