package com.example.StudentCRUD.service;

import ch.qos.logback.core.net.SocketConnector;
import com.example.StudentCRUD.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1,"Dharun", "ECE"),
                    new Student(2, "Joshuva", "CSE")
            )
    );


    public List<Student> getstud() {
        return students;
    };

    public Student getstrno(int rno) {
        int res = 0;
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getRno() == rno){
                res = i;
                break;
            }
        }
        return students.get(res);
    }

    public void addstud(Student student) {
        students.add(student);
    }

    public String updstd(Student student) {
        int ind = 0;
        boolean flag = false;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getRno() == student.getRno()){
                ind = i;
                flag = true;
                break;
            }
        }
        if(!flag) return "No Student Exist";
        students.set(ind, student);
        return "Updated Successfully";
    }

    public String delstud(int rno) {
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getRno() == rno){
                students.remove(i);
                return "Deleted Successfully";
            }
        }
        return "Student not exist";
    }
}
