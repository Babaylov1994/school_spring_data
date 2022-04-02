package com.foxminded.school.school_spring_data.dao;

import com.foxminded.school.school_spring_data.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public Optional<List<Student>> getAll() {
        Query query = entityManager.createQuery("FROM Student");
        List<Student> studentList = query.getResultList();
        return Optional.ofNullable(studentList);
    }

    @Override
    public Optional<Student> getById(int id) {
        return Optional.ofNullable(entityManager.find(Student.class, id));
    }

    @Override
    public void create(Student course) {
        entityManager.merge(course);
    }

    @Override
    public void delete(int id) {
        Query query = entityManager.createQuery("FROM Student WHERE id_Student =:idStudent");
        query.setParameter("idStudent", id);
        query.executeUpdate();
    }
}
