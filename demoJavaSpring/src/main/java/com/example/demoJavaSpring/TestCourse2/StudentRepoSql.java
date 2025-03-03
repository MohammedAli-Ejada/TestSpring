package com.example.demoJavaSpring.TestCourse2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Qualifier("vvv")
public class StudentRepoSql implements IStudentRepository{
    @Override
    public List<Student> GetAll() {
        return List.of();
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void Add(Student student) {

    }
}
