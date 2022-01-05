package com.student.studentRecord.controller;

import com.student.studentRecord.model.StudentModel;
import com.student.studentRecord.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    StudentService studentService;

    // Read Data
    @GetMapping("/students")
    public List<StudentModel> getStudents () {
        return studentService.findAll();
    }

    // Create Data
    @PostMapping("/student")
    public StudentModel addStudents (@RequestBody StudentModel student) {
        studentService.save(student);
        return student;
    }

    // Delete Data
    @DeleteMapping("/student/{id}")
    public String deleteStudent (@PathVariable("id") int id) {
        StudentModel forDelete = studentService.getById(id);
        studentService.delete(forDelete);
        return "Successfully Deleted";
    }

    // Update Data
    @PutMapping("/student")
    public StudentModel updateStudent (@RequestBody StudentModel student) {
        studentService.save(student);
        return student;
    }

}
