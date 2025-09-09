package com.example.GetPost.controller;

import com.example.GetPost.model.Student;
import com.example.GetPost.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500/")
public class StudentController {
    @Autowired
    StudentService service;

    @GetMapping("students")
    public List<Student> getstud(){
         return service.getstud();
    }

    @PostMapping("students")
    public void addstudents(@RequestParam("rno") int rno, @RequestParam("name") String name, @RequestParam("dep") String dep){
        service.addstudents(rno, name, dep);
    }
}
