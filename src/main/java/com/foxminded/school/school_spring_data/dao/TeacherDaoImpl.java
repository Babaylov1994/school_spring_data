package com.foxminded.school.school_spring_data.dao;

import com.foxminded.school.school_spring_data.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;

@Repository
public class TeacherDaoImpl implements TeacherDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public Optional<List<Teacher>> getAll() {
        Query query = entityManager.createQuery("FROM Teacher");
        List<Teacher> teachers = query.getResultList();
        return Optional.ofNullable(teachers);
    }

    @Override
    public Optional<Teacher> getById(int id) {
        return Optional.ofNullable(entityManager.find(Teacher.class, id));
    }

    @Override
    public void create(Teacher course) {
        entityManager.merge(course);
    }

    @Override
    public void delete(int id) {
        Query query = entityManager.createQuery("FROM Teacher WHERE id_Teacher =:idTeacher");
        query.setParameter("idTeacher", id);
        query.executeUpdate();
    }
}
