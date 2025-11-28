package com.example.demo.models.StudentInfo;
import java.util.UUID;
import org.hibernate.annotations.UuidGenerator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "academic_history")
@Data
public class AcademicHistory {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    @Column(name = "student_id", nullable = false)
    private UUID studentId;

    private String year;

    @Column(columnDefinition = "text")
    private String details;
}
