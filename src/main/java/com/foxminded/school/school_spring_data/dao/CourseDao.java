package com.foxminded.school.school_spring_data.dao;

import com.foxminded.school.school_spring_data.entity.Course;

import java.util.List;
import java.util.Optional;

public interface CourseDao {

    Optional<List<Course>> getAll();

    Optional<Course> getById(int id);

    void create(Course course);

    void delete(int id);
}
