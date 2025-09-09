package com.example.SpringSecurity.Controller;

import com.example.SpringSecurity.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>();
    {
        students.add(new Student(1,"Dharun", "ece"));
        students.add(new Student(2,"Dinesh", "ece"));
    }



    @GetMapping("students")
    public List<Student> getStudents(){
        return students;
    }

    @GetMapping("csrf")
    public CsrfToken getCsrf(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }


    @PostMapping("admin/students")
    public void addStudent(@RequestBody Student student){
        students.add(student);
    }


}
