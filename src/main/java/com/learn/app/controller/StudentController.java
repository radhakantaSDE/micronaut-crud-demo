package com.learn.app.controller;

import com.learn.app.dto.StudentDto;
import com.learn.app.service.StudentService;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import java.util.Optional;

@Controller("/student-api/v1/")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Get("/greet")
    public Optional<String> show() {
        return Optional.of(studentService.greet());
    }

    @Post("/student")
    public Optional<String> saveStudent(@Body StudentDto student) {
        return Optional.of(studentService.saveStudent(student));
    }
}
