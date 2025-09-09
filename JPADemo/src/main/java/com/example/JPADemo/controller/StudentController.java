package com.example.JPADemo.controller;

import com.example.JPADemo.model.Student;
import com.example.JPADemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class StudentController {
    @Autowired
    StudentService service;

    @GetMapping("/students")
    public List<Student> getAllstud(){
        return service.getAllstud();
    }

    @GetMapping("students/{rno}")
    public ResponseEntity<Student>  getstudbyrno(@PathVariable int rno){
        Student s1 = service.getstudbyrno(rno);
        if(s1 == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(s1, HttpStatus.OK);
    }

    @GetMapping("students/dep/{dep}")
    public List<Student> findbydep(@PathVariable String dep){
        return service.findbydep(dep);
    }


    @PostMapping("/students")
    public String addstud(@RequestBody Student student){
         service.addstud(student);
         return "Added successfully";
    }

    @PostMapping("students/addall")
    public String addall(@RequestBody List<Student> student){
        service.addall(student);
        return "Added All";
    }

    @PostMapping("students/filter")
    public List<Student> findBygenAnddep(@Param("gender") String gender, @Param("dep") String dep){
        return service.findBygenAnddep(gender, dep);
    }

    @PutMapping("students")
    public String updatest(@RequestBody Student student){
        service.updatest(student);
        return "Updated successfully";
    }

    @DeleteMapping("students/{rno}")
    public String delbyid(@PathVariable int rno){
        service.delbyid(rno);
        return "Deleted the student whose rno is " + rno;
    }

    @DeleteMapping("students/clearall")
    public String delall(){
        service.delall();
        return "Deleted All records";
    }

}
