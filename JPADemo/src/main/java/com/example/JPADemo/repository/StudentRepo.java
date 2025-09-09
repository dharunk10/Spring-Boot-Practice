package com.example.JPADemo.repository;

import com.example.JPADemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {



    List<Student> findBydep(String dep);

    @Query(nativeQuery = true,
            value = "SELECT * FROM student WHERE gender = ?1 AND dep = ?2"
    )
    List<Student> findBygenAnddep(@Param("gender") String gender, @Param("dep") String dep);

}
