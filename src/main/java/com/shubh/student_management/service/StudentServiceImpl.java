package com.shubh.student_management.service;

import java.util.List;

import com.shubh.student_management.entity.Student;
import com.shubh.student_management.repository.StudentRepository;

public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    
}
