package com.example.demoJavaSpring.SpringWithHibernate.Models.ManyToMany;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {

    @SequenceGenerator(
            name = "Student2Sequence",
            allocationSize = 1,
            sequenceName = "Student2Sequence"
    )
    @GeneratedValue(
            generator = "Student2Sequence",
            strategy = GenerationType.SEQUENCE
    )
    @Id
    private Long id;
    private String Name ;
    @ManyToMany()
    @JoinTable(
            name = "StudentCourse",
            joinColumns = @JoinColumn(name = "studentId"),
            inverseJoinColumns = @JoinColumn(name = "courseId")
    )
    private List<Course> courses=new ArrayList<Course>();

    public Student(Long id, String name, List<Course> courses) {
        this.id = id;
        Name = name;
        this.courses = courses;
    }

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
