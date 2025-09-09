package com.example.SpringSecurity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordHasher {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
        String pt = "admin123";
        String hashedpass = encoder.encode(pt);
        System.out.println(hashedpass + ";");
    }
}
