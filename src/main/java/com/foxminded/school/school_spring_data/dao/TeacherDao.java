package com.foxminded.school.school_spring_data.dao;

import com.foxminded.school.school_spring_data.entity.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherDao {

    Optional<List<Teacher>> getAll();

    Optional<Teacher> getById(int id);

    void create(Teacher course);

    void delete(int id);
}
