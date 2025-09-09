package com.example.FirstSpringBoot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component @Primary
public class Pen implements Writer{
    public void write(){
        System.out.println("Writing Pen");
    }
}
