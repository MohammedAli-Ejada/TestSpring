package com.example.demoJavaSpring.SpringWithHibernate.Models.ManyToMany;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
public class Subject {
    @SequenceGenerator(
            name = "Subject2Sequence",
            allocationSize = 1,
            sequenceName = "Subject2Sequence"
    )
    @GeneratedValue(
            generator = "Subject2Sequence",
            strategy = GenerationType.SEQUENCE
    )
    @Id
    private Long id;
    private String Name ;
    @OneToMany(mappedBy = "subject", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TeacherSubject> teacherSubjects=new ArrayList<TeacherSubject>();

    public Subject() {
    }

    public Subject(Long id, String name, List<TeacherSubject> teacherSubjects) {
        this.id = id;
        Name = name;
        this.teacherSubjects = teacherSubjects;
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

    public List<TeacherSubject> getTeacherSubjects() {
        return teacherSubjects;
    }

    public void setTeacherSubjects(List<TeacherSubject> teacherSubjects) {
        this.teacherSubjects = teacherSubjects;
    }
}
