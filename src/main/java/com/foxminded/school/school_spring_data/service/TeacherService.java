package com.foxminded.school.school_spring_data.service;

import com.foxminded.school.school_spring_data.entity.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherService {

    Optional<List<Teacher>> getAll();

    Optional<Teacher> getById(int id);

    void create(Teacher teacher);

    void delete(int id);
}
