package com.example.demoJavaSpring.SpringWithHibernate.Models.ManyToMany;

import jakarta.persistence.*;
@Entity
public class TeacherSubject {

    @SequenceGenerator(
            name = "TeacherSubject2Sequence",
            allocationSize = 1,
            sequenceName = "TeacherSubject2Sequence"
    )
    @GeneratedValue(
            generator = "TeacherSubject2Sequence",
            strategy = GenerationType.SEQUENCE
    )
    @Id
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "teacherId")
    private Teacher teacher;

    @ManyToOne()
    @JoinColumn(name = "subjectId")
    private Subject subject;

    public TeacherSubject(Subject subject, Teacher teacher, Long id) {
        this.subject = subject;
        this.teacher = teacher;
        this.id = id;
    }

    public TeacherSubject() {
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
