package com.example.demo.models.StudentInfo;

import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "student_parent_map")
public class StudentParentMap {
    @Id
    @UuidGenerator
    private UUID id;
    
    @Column(name = "student_id", nullable = false, columnDefinition = "UUID")
    private UUID studentId;

    @Column(name = "parent_id", nullable = false, columnDefinition = "UUID")
    private UUID parentId;

    private String relation;
}
