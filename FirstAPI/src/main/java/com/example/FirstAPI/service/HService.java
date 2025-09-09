package com.example.FirstAPI.service;

import org.springframework.stereotype.Service;

@Service
public class HService {

    public String greet(){
        return "HEllo World";
    }

    public String login(){
        return "Logged in";
    }

}
