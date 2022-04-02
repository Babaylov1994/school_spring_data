package com.foxminded.school.school_spring_data.dao;

import com.foxminded.school.school_spring_data.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;

@Repository
public class CourseDaoImpl implements CourseDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public Optional<List<Course>> getAll() {
        Query query = entityManager.createQuery("FROM Course");
        List<Course> allCourses = query.getResultList();
        return Optional.ofNullable(allCourses);
    }

    @Override
    public Optional<Course> getById(int id) {
        return Optional.ofNullable(entityManager.find(Course.class, id));
    }

    @Override
    public void create(Course course) {
        entityManager.merge(course);
    }

    @Override
    public void delete(int id) {
        Query query = entityManager.createQuery("DELETE FROM Course WHERE id_course =:idCourse");
        query.setParameter("idCourse", id);
        query.executeUpdate();
    }
}
