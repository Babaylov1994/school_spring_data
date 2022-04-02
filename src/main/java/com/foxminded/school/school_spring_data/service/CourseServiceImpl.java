package com.foxminded.school.school_spring_data.service;

import com.foxminded.school.school_spring_data.dao.CourseDao;
import com.foxminded.school.school_spring_data.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Override
    @Transactional
    public Optional<List<Course>> getAll() {
        return Optional.ofNullable(courseDao.findAll());
    }

    @Override
    @Transactional
    public Optional<Course> getById(int id) {
        return courseDao.findById(id);
    }

    @Override
    @Transactional
    public void create(Course course) {
        courseDao.save(course);
    }

    @Override
    @Transactional
    public void delete(int id) {
        courseDao.deleteById(id);
    }
}
