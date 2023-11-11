package com.learn.app.util;

import com.learn.app.dto.StudentDto;
import com.learn.app.model.Student;

public class ModelMapper {
    private ModelMapper() {}

    public static Student toDbModel(StudentDto studentDto) {

        return new Student(null, studentDto.getName(), studentDto.getStudentId());
    }
}
