package com.example.demoJavaSpring.SpringWithHibernate.Services.StudentServices;

import com.example.demoJavaSpring.SpringWithHibernate.Models.StudentDB;
import com.example.demoJavaSpring.SpringWithHibernate.Repositories.StudentRepos.IStudentDbRepository;
import com.example.demoJavaSpring.SpringWithHibernate.Services.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentDbService implements IService<StudentDB , Long> {

    private IStudentDbRepository studentDbRepository;

    public StudentDbService(IStudentDbRepository studentDbRepository) {
        this.studentDbRepository = studentDbRepository;
    }

    @Override
    public List<StudentDB> getAll() {
        return studentDbRepository.findAll();
    }

    @Override
    public StudentDB getById(Long Id) {
        StudentDB studentDB=studentDbRepository.findById(Id)
                .orElseThrow(() -> new RuntimeException("Student not found with ID: " + Id));
        return studentDB;

    }

    @Override
    public StudentDB add(StudentDB entity) {
        return studentDbRepository.save(entity);
    }

    @Override
    public void delete(Long aLong) {
        if(!studentDbRepository.existsById(aLong))
        {
            throw new RuntimeException("Student not found with ID: " + aLong);
        }
        studentDbRepository.deleteById(aLong);
    }

    @Override
    public StudentDB update(Long aLong, StudentDB newEntity) {
        if(!studentDbRepository.existsById(aLong))
        {
            throw new RuntimeException("Student not found with ID: " + aLong);
        }

        StudentDB studentDB=getById(aLong);
        studentDB.setFirstName(newEntity.getFirstName());
        studentDB.setLastName(newEntity.getLastName());
        studentDB.setEmail(newEntity.getEmail());
        studentDB.setAge(newEntity.getAge());
        studentDbRepository.save(studentDB);
        return studentDB;
    }
}
