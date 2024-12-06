package com.tka.student_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tka.student_api.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
