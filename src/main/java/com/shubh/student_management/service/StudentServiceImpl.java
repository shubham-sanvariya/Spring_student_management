package com.shubh.student_management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shubh.student_management.entity.Student;
import com.shubh.student_management.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student addStudent(Student newStudent) {
        return studentRepository.save(newStudent);
    }

    public void deleteStudent(Long studentId) {

        studentRepository.deleteById(studentId);
    }
    
}
