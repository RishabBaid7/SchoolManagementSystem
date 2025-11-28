package com.example.demo.models.Academic;

import java.time.LocalDateTime;
import java.util.UUID;

import com.example.demo.models.StudentInfo.Student;

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
@Table(name = "report_cards") 
public class ReportCard {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "student_id")
    private Student student; // One student can have multiple report cards

    @ManyToOne(optional = false)
    @JoinColumn(name = "exam_id")
    private Exam exam; 

    @Column(name = "overall_grade")
    private String overallGrade;

    @Column(name = "performance_summary")
    private String performanceSummary;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}

/*
| id (UUID)     | student_id (UUID) | exam_id (UUID)      | overall_grade | performance_summary               | created_at          |
| ------------- | ----------------- | ------------------- | ------------- | --------------------------------- | ------------------- |
| `rc-001-uuid` | `stu-101-uuid`    | `exam-midterm-uuid` | A             | Excellent performance overall.    | 2025-02-01 10:30:00 |
| `rc-002-uuid` | `stu-102-uuid`    | `exam-midterm-uuid` | B+            | Good progress but needs revision. | 2025-02-01 10:35:00 |
one student can't have multiple report cards with same exam
 */
