package com.example.SpringSecurity.Repo;

import com.example.SpringSecurity.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface UserDetailsRepo extends JpaRepository<Users, Integer> {
    Users getByUsername(String username);
}
