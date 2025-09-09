package com.example.JPADemo.service;

import com.example.JPADemo.model.Student;
import com.example.JPADemo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {
    @Autowired
    StudentRepo repo;

    public List<Student> getAllstud() {
        return repo.findAll();
    }

    public void addstud(Student student) {
        repo.save(student);
    }

    public Student getstudbyrno(int rno) {
        return repo.findById(rno).orElse(null);
    }

    public void updatest(Student student) {
        repo.save(student);
    }

    public void delbyid(int rno) {
        repo.deleteById(rno);
    }

    public void delall() {
        repo.deleteAll();
    }

    public List<Student> findbydep(String dep) {
        return repo.findBydep(dep);
    }

    public void addall(List<Student> student) {
        repo.saveAll(student);
    }

    public List<Student> findBygenAnddep(String gender, String dep) {
        return repo.findBygenAnddep(gender, dep);
    }
}
