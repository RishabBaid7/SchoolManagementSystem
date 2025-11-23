package com.example.demo.models.StudentInfo;

import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class StudentAcademicHistory {
    @Id
    @UuidGenerator
    private UUID id;

    @Column(nullable = false)
    private UUID studentId;
    
    private String year;

    private String details;
}