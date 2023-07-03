package com.miu.waa.aluminimanagement.repository;

import com.miu.waa.aluminimanagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
