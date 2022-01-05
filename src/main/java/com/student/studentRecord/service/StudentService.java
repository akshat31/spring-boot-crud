package com.student.studentRecord.service;

import com.student.studentRecord.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentService extends JpaRepository<StudentModel, Integer> {
}
