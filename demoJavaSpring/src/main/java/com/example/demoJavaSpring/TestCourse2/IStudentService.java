package com.example.demoJavaSpring.TestCourse2;

import java.util.List;

public interface IStudentService {
    List<Student> GetAll();

    Student getStudentById(int id);

    void Add(Student student);
    void Update(int id, Student student);
    void Delete(int Id);
}
