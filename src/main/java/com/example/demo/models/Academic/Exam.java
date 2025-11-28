package com.example.demo.models.Academic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "exams")
public class Exam {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String name; // Midterm, Final, etc.

    @Column(name = "class")
    private String className; //10, 12 etc.

    private String section; //A, B, C etc.

    @Column(name = "scheduled_date")
    private LocalDate scheduledDate;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
