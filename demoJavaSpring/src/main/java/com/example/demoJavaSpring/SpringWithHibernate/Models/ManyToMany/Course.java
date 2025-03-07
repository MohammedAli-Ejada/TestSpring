package com.example.demoJavaSpring.SpringWithHibernate.Models.ManyToMany;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {
    @SequenceGenerator(
            name = "CourseSequence",
            allocationSize = 1,
            sequenceName = "CourseSequence"
    )
    @GeneratedValue(
            generator = "CourseSequence",
            strategy = GenerationType.SEQUENCE
    )
    @Id
    private Long id;
    private String Name ;
    @ManyToMany(mappedBy = "courses")
    private List<Student> students=new ArrayList<Student>();

    public Course(Long id, String name, List<Student> students) {
        this.id = id;
        Name = name;
        this.students = students;
    }

    public Course() {
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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
