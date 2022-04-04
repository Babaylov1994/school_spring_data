package com.foxminded.school.school_spring_data.service;

import com.foxminded.school.school_spring_data.entity.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {

    Optional<List<Course>> getAll();

    Optional<Course> getById(int id);

    void create(Course course);

    void delete(int id);
}
