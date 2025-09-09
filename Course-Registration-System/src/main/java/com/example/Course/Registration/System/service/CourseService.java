package com.example.Course.Registration.System.service;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.repository.CourseRegistryRepo;
import com.example.Course.Registration.System.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo repo;

    @Autowired
    CourseRegistryRepo CourseRegistryRepo;

    public List<Course> getAllCourse() {
        return repo.findAll();
    }

    public List<CourseRegistry> enrolledStud() {
        return CourseRegistryRepo.findAll();
    }

    public void enrollstud(String name, String emailId, String courseName) {
        CourseRegistryRepo.save(new CourseRegistry(name, emailId, courseName));
    }
}
