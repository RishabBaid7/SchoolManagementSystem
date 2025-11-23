package com.example.demo.models.Academic;

import java.time.LocalDateTime;
import java.util.UUID;

import com.example.demo.models.StudentInfo.Student;
import com.example.demo.models.User.Teacher;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "student_scores")
public class StudentScore {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne(optional = false)
    @JoinColumn(name = "exam_id")
    private Exam exam;

    @ManyToOne(optional = false)
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @ManyToOne(optional = false)
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    private Float marks;

    private String remarks;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}

/*
| id (UUID) | student_id | exam_id | subject_id | teacher_id | marks | remarks          | created_at       |
| --------- | ---------- | ------- | ---------- | ---------- | ----- | ---------------- | ---------------- |
| 91df…     | S1         | E1      | SUB1       | T1         | 85    | Good improvement | 2025-01-10 10:23 |
 */