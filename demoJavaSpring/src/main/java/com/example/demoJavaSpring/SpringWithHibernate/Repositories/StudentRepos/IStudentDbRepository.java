package com.example.demoJavaSpring.SpringWithHibernate.Repositories.StudentRepos;

import com.example.demoJavaSpring.SpringWithHibernate.Models.StudentDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentDbRepository extends JpaRepository<StudentDB , Long> {
    StudentDB findByEmail(String email);

}
