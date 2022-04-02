package com.foxminded.school.school_spring_data.service;

import com.foxminded.school.school_spring_data.dao.StudentDao;
import com.foxminded.school.school_spring_data.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public Optional<List<Student>> getAll() {
        return studentDao.getAll();
    }

    @Override
    public Optional<Student> getById(int id) {
        return studentDao.getById(id);
    }

    @Override
    public void create(Student student) {
        studentDao.create(student);
    }

    @Override
    public void delete(int id) {
        studentDao.delete(id);
    }
}
