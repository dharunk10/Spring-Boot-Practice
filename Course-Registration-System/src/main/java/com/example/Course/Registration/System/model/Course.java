package com.example.Course.Registration.System.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Course {
    @Id
    private String courseID;
    private String courseName;
    private String trainer;
    private int durtionInWeeks;

}
