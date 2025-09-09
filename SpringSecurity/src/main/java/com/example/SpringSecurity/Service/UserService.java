package com.example.SpringSecurity.Service;

import com.example.SpringSecurity.Repo.UserDetailsRepo;
import com.example.SpringSecurity.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDetailsRepo repo;


    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);

    public void addUser(Users user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        repo.save(user);
    }
}
