package com.foxminded.school.school_spring_data.dao;

import com.foxminded.school.school_spring_data.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentDao {

    Optional<List<Student>> getAll();

    Optional<Student> getById(int id);

    void create(Student course);

    void delete(int id);
}
