package com.example.FirstSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpringBootApplication.class, args);
		Student s1 = context.getBean(Student.class);
		s1.writeexam();
	}

}
