package com.example.SpringSecurity.Service;

import com.example.SpringSecurity.Repo.UserDetailsRepo;
import com.example.SpringSecurity.model.UserPrincipal;
import com.example.SpringSecurity.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    UserDetailsRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = repo.getByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException("USername not found exception");
        }
        return new UserPrincipal(user);
    }
}
