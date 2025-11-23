package com.example.demo.models.StudentInfo;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
import org.hibernate.annotations.UuidGenerator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "students")   
public class Student {
    @Id
    @UuidGenerator
    private UUID id;
    
    private UUID userId;

    private String name;

    private LocalDate dob;

    private String gender;

    @Column(name = "blood_group")
    private String bloodGroup;

    private String contact;

    @Column(columnDefinition = "TEXT")
    private String address;

    @Column(name = "enrollment_class")
    private String enrollmentClass;

    private String section;

    @Column(name = "roll_number")
    private Integer rollNumber;

    @Column(name = "emergency_contact")
    private String emergencyContact;

    @Column(name = "created_at")
    private LocalDateTime createdAt; 
}
