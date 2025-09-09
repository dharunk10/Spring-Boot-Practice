package com.example.SpringSecurity.model;

import org.springframework.web.bind.annotation.RestController;


public class Student {
    private int rno;
    private String name;
    private String dep;

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public Student(int rno, String name, String dep) {
        this.rno = rno;
        this.name = name;
        this.dep = dep;
    }

    public Student() {
    }
}
