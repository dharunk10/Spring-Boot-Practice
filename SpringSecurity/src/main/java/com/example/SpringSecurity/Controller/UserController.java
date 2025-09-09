package com.example.SpringSecurity.Controller;

import com.example.SpringSecurity.Service.UserService;
import com.example.SpringSecurity.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService service;

    @PostMapping("admin/add_user")
    public void addUser(@RequestBody Users user){
        service.addUser(user);
    }
}
