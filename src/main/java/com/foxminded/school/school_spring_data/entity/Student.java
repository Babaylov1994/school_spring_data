package com.foxminded.school.school_spring_data.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_student")
    private int idStudent;

    @Column(name = "first_name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "course_student",
        joinColumns = @JoinColumn(name = "id_student"),
        inverseJoinColumns = @JoinColumn(name = "id_course")
    )
    private List<Course> courses;

    public Student() {
    }

    public Student(int idStudent, String name, String lastName, List<Course> courses) {
        this.idStudent = idStudent;
        this.name = name;
        this.lastName = lastName;
        this.courses = courses;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
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

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return idStudent == student.idStudent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idStudent);
    }

    @Override
    public String toString() {
        return "Student{" +
            "idStudent=" + idStudent +
            ", name='" + name + '\'' +
            ", lastName='" + lastName + '\'' +
            '}';
    }
}
