package com.example.SpringSecurity.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/")
    public String hello(HttpServletRequest request){
        return "Hello World " + request.getSession().getId();
    }

    @GetMapping("public/welcome")
    public String welcome(){
        return "HIi Users";
    }

    @GetMapping("public/About")
    public String about(){
        return "You Can know about us";
    }


}
