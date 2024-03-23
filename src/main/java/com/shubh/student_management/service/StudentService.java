package com.shubh.student_management.service;

import java.util.List;

import com.shubh.student_management.entity.Student;

public interface StudentService {
    List<Student> getAllStudents();

    Student addStudent(Student newStudent);

    void deleteStudent(Long studentId);
}
