package com.learn.app.service;

import com.learn.app.dto.StudentDto;
import com.learn.app.model.Student;
import com.learn.app.repository.StudentRepository;
import com.learn.app.util.ModelMapper;
import jakarta.inject.Singleton;

@Singleton
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public String greet() {
        return "Hello Micronaut !!!";
    }

    @Override
    public String saveStudent(StudentDto studentDto) {

        Student newStudent = studentRepository.save(ModelMapper.toDbModel(studentDto));

        return newStudent.getId() != null? "Student saved successfully!!!" : "Failed to save student :(";
    }
}
