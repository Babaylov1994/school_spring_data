package com.foxminded.school.school_spring_data.dao;

import com.foxminded.school.school_spring_data.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

}
