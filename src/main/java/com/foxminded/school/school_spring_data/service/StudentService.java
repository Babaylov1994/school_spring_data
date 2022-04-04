package com.foxminded.school.school_spring_data.service;

import com.foxminded.school.school_spring_data.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    Optional<List<Student>> getAll();

    Optional<Student> getById(int id);

    void create(Student student);

    void delete(int id);
}
