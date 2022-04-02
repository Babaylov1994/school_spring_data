package com.foxminded.school.school_spring_data.service;

import com.foxminded.school.school_spring_data.dao.CourseDao;
import com.foxminded.school.school_spring_data.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Override
    public Optional<List<Course>> getAll() {
        return courseDao.getAll();
    }

    @Override
    public Optional<Course> getById(int id) {
        return courseDao.getById(id);
    }

    @Override
    public void create(Course course) {
        courseDao.create(course);
    }

    @Override
    public void delete(int id) {
        courseDao.delete(id);
    }
}
