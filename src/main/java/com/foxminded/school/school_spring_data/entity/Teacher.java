package com.foxminded.school.school_spring_data.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_teacher")
    private int idTeacher;

    @Column(name = "first_name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_teacher")
    private List<Course> course;

    public Teacher() {
    }

    public Teacher(int idTeacher, String name, String lastName, List<Course> course) {
        this.idTeacher = idTeacher;
        this.name = name;
        this.lastName = lastName;
        this.course = course;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return idTeacher == teacher.idTeacher;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTeacher);
    }

    @Override
    public String toString() {
        return "Teacher{" +
            "idTeacher=" + idTeacher +
            ", name='" + name + '\'' +
            ", lastName='" + lastName + '\'' +
            '}';
    }
}
