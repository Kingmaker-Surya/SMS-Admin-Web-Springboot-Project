package com.sms.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.application.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
