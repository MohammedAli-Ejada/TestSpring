package com.example.demoJavaSpring.TestCourse2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Qualifier("sss")
public class StudentRepository implements IStudentRepository {

    private List<Student> students;

    public StudentRepository() {
        students = new ArrayList<>();

        students.add(createStudent(1, "Alice Johnson", "Mathematics"));
        students.add(createStudent(2, "Bob Smith", "Computer Science"));
        students.add(createStudent(3, "Charlie Brown", "Physics"));
        students.add(createStudent(4, "David Lee", "Biology"));
        students.add(createStudent(5, "Emma Davis", "Chemistry"));
        students.add(createStudent(6, "Frank White", "History"));
        students.add(createStudent(7, "Grace Hall", "Engineering"));
        students.add(createStudent(8, "Hannah Scott", "Psychology"));
        students.add(createStudent(9, "Ian Turner", "Economics"));
        students.add(createStudent(10, "Jack Wilson", "Literature"));
    }

    private Student createStudent(int id, String name, String course) {
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setCourseName(course);
        return student;
    }

    @Override
    public List<Student> GetAll() {
        return students;
    }

    @Override
    public Student getStudentById(int id) {
        return students.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void Add(Student student){
        students.add(student);
    }

    @Override
    public void Update(int id, Student student) {
        Student student1=getStudentById(id);
        student1.setName(student.getName());
        student1.setCourseName(student.getCourseName());
    }

    @Override
    public void Delete(int Id) {
        students.removeIf(s->s.getId()==Id);
    }


}
