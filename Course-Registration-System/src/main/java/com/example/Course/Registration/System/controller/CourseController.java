package com.example.Course.Registration.System.controller;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CourseController {

    @Autowired
    CourseService service;

    @GetMapping("course")
    public List<Course> getAllCourse(){
        return service.getAllCourse();
    }

    @GetMapping("course/enrolled")
    public List<CourseRegistry> enrolledStud(){
        return service.enrolledStud();
    }

    @PostMapping("course/register")
    public String enrollStud(@RequestParam("name") String name,
                             @RequestParam("emailId") String emailId,
                             @RequestParam("courseName") String courseName){
        service.enrollstud(name, emailId, courseName);
        return "Congratulations !! " + name + " For enrolling " + courseName;
    }

}
