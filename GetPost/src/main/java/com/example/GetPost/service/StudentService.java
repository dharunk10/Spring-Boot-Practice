package com.example.GetPost.service;

import com.example.GetPost.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> students = new ArrayList<>(
            Arrays.asList(new Student(1, "Dharun", "Ece"),
                    new Student(2, "Dinesh", "Ece"),
                    new Student(3, "Gokul", "Ece"))
    );

    public List<Student> getstud() {
        return students;
    }

    public void addstudents(int rno, String name, String dep) {
        students.add(new Student(rno, name, dep));
    }
}
