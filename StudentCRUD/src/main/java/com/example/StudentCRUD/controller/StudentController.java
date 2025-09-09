package com.example.StudentCRUD.controller;

import com.example.StudentCRUD.model.Student;
import com.example.StudentCRUD.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService service;

    @GetMapping("/students")
    public List<Student> getstudents(){
        return service.getstud();
    }

    @GetMapping("students/{rno}")
    public Student getstrno(@PathVariable("rno") int rno){
        return service.getstrno(rno);
    }

    @PostMapping("students")
    public String addstud(@RequestBody Student student){
        service.addstud(student);
        return "Added Successfully";
    }

    @PutMapping("students")
    public String updstd(@RequestBody Student student){
       return service.updstd(student);
    }

    @DeleteMapping("students/{rno}")
    public String delstud(@PathVariable("rno") int rno){
        return service.delstud(rno);
    }
}
