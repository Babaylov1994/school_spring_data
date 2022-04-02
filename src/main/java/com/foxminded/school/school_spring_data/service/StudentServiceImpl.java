package com.foxminded.school.school_spring_data.service;

import com.foxminded.school.school_spring_data.dao.StudentDao;
import com.foxminded.school.school_spring_data.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    @Transactional
    public Optional<List<Student>> getAll() {
        return studentDao.getAll();
    }

    @Override
    @Transactional
    public Optional<Student> getById(int id) {
        return studentDao.getById(id);
    }

    @Override
    @Transactional
    public void create(Student student) {
        studentDao.create(student);
    }

    @Override
    @Transactional
    public void delete(int id) {
        studentDao.delete(id);
    }
}
