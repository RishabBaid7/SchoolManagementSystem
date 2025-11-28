package com.example.demo.models.Attendance;

import java.time.LocalDate;
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
@Table(name = "attendances")
public class Attendance {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    @Column(name = "student_id", nullable = false)
    private UUID studentId;

    @Column(name = "teacher_id", nullable = false)
    private UUID teacherId; //Marked by a specific teacher

    private LocalDate date; 

    private String status; // Present | Absent

    @Column(columnDefinition = "text")
    private String comment;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
