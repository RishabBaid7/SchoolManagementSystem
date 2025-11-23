package com.example.demo.models.Learning;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "learning_materials") 
public class LearningMaterial {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    @Column(name = "teacher_id", nullable = false)
    private UUID teacherId;

    @Column(name = "subject_id", nullable = false)
    private UUID subjectId;

    private String title;

    @Column(columnDefinition = "text")
    private String description;

    @Column(name = "file_url")
    private String fileUrl;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}   
