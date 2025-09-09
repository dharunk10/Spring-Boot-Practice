package com.example.FirstSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class Student {

    Writer writer;
    @Autowired
    public Student(@Qualifier("lead") Writer writer) {
        this.writer = writer;
    }

    public void setPen(Writer writer) {
        this.writer = writer;
    }

    public void writeexam(){
        writer.write();
    }
    public void show(){
        System.out.println("Hello World"    );
    }

}
