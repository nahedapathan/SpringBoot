package com.nk.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nk.main.model.Student;

public interface StudentRepository  extends JpaRepository<Student, Integer>{

}
