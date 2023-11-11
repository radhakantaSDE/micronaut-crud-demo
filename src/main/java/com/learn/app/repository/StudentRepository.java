package com.learn.app.repository;

import com.learn.app.model.Student;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

@JdbcRepository(dialect = Dialect.MYSQL)
public interface StudentRepository extends CrudRepository<Student, Long> {

    long update(@Id Long id, String name, String studentId);
}
