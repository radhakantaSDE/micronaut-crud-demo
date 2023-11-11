package com.learn.app.dto;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.SerdeImport;

@SerdeImport
@Introspected
public class StudentDto {

    private Long id;
    private String name;
    private String studentId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
