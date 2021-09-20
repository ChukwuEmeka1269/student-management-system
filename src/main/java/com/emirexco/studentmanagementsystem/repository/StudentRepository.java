package com.emirexco.studentmanagementsystem.repository;

import com.emirexco.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
