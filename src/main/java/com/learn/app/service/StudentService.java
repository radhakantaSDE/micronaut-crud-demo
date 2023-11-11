package com.learn.app.service;

import com.learn.app.dto.StudentDto;
import com.learn.app.model.Student;

public interface StudentService {

    String greet();
    String saveStudent(StudentDto student);
}
