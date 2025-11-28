package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.models.StudentInfo.Student;
import com.example.demo.repositories.StudentRepository;

@Service
public class StudentService {
    private final StudentRepository studentRepo;

    public StudentService(StudentRepository studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Student createStudent(Student student) {
        return studentRepo.save(student);
    }
}
