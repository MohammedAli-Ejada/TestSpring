package com.example.demoJavaSpring.TestCourse2;

import java.util.List;

public interface IStudentRepository {
    List<Student> GetAll();

    Student getStudentById(int id);

    void Add(Student student);
}
