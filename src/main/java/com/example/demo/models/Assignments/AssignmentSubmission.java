package com.example.demo.models.Assignments;

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
@Table(name = "assignment_submissions")
public class AssignmentSubmission {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;
    
    @Column(name = "assignment_id", nullable = false)
    private UUID assignmentId;

    @Column(name = "student_id", nullable = false)
    private UUID studentId;

    private String submittedFile;

    @Column(name = "submitted_at")
    private LocalDateTime submittedAt = LocalDateTime.now();

    private Float marks;

    @Column(columnDefinition = "text")
    private String teacherRemark;
}
