package com.example.FirstSpringBoot;

import org.springframework.stereotype.Component;

@Component("lead")
public class Pencil implements Writer{
    public void write(){
        System.out.println("Pencil is writing");
    }

}
