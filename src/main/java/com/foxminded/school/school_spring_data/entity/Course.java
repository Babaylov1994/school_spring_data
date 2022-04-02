package com.foxminded.school.school_spring_data.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_course")
    private int idCourse;

    @Column(name = "course_name")
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "course_student",
        joinColumns = @JoinColumn(name = "id_course"),
        inverseJoinColumns = @JoinColumn(name = "id_student")
    )
    private List<Student> studentList;


    public Course() {
    }

    public Course(int idCourse, String name, List<Student> studentList) {
        this.idCourse = idCourse;
        this.name = name;
        this.studentList = studentList;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return idCourse == course.idCourse;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCourse);
    }

    @Override
    public String toString() {
        return "Course{" +
            "idCourse=" + idCourse +
            ", name='" + name + '\'' +
            '}';
    }
}
