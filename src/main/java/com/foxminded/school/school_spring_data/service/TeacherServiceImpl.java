package com.foxminded.school.school_spring_data.service;

import com.foxminded.school.school_spring_data.dao.TeacherDao;
import com.foxminded.school.school_spring_data.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    @Override
    @Transactional
    public Optional<List<Teacher>> getAll() {
        return teacherDao.getAll();
    }

    @Override
    @Transactional
    public Optional<Teacher> getById(int id) {
        return teacherDao.getById(id);
    }

    @Override
    @Transactional
    public void create(Teacher teacher) {
        teacherDao.create(teacher);
    }

    @Override
    @Transactional
    public void delete(int id) {
        teacherDao.delete(id);
    }
}
