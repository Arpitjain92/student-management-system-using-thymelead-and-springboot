package com.arpit.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arpit.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
