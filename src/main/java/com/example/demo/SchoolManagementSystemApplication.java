package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.models.Student;

@SpringBootApplication
public class SchoolManagementSystemApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SchoolManagementSystemApplication.class, args);
		System.out.println(new Student().toString());
	}

}
