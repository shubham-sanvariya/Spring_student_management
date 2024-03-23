package com.shubh.student_management.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shubh.student_management.entity.Student;
import com.shubh.student_management.service.StudentService;

@RestController
@CrossOrigin()
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents(){
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @PostMapping("/add-student")
    public ResponseEntity<Student> addStudent(@RequestBody Student newStudent){
        Student student = new Student(newStudent.getFirstName(),
        newStudent.getLastName(),
        newStudent.getEmail());
        
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.addStudent(student));
    }

    @DeleteMapping("/delete-student/{studentId}")
    public void deleteStudentById(@PathVariable("studentId") Long studentId){
        studentService.deleteStudent(studentId);
    }
}
