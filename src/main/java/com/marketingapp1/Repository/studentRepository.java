package com.marketingapp1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketingapp1.entities.Student;

public interface studentRepository extends JpaRepository<Student, Long> {

}
