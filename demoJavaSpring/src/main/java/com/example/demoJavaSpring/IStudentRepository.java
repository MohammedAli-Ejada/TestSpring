package com.example.demoJavaSpring;

import java.util.List;

public interface IStudentRepository {
    List<Student> GetAll();

    Student getStudentById(int id);

    void Add(Student student);
}
