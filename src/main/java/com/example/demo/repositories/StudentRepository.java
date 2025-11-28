package com.example.demo.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.StudentInfo.Student;
import java.util.UUID;

public interface StudentRepository extends JpaRepository<Student, UUID> {
	
}
