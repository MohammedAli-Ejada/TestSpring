package com.example.demoJavaSpring.SpringWithHibernate.Controllers;

import com.example.demoJavaSpring.SpringWithHibernate.DTOs.StudentDto;
import com.example.demoJavaSpring.SpringWithHibernate.Models.StudentDB;
import com.example.demoJavaSpring.SpringWithHibernate.Services.StudentServices.StudentDbService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dbStudent")
public class StudentDbController {

    private StudentDbService studentService;

    public StudentDbController(StudentDbService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<StudentDB> GetAll(){
        return  studentService.getAll();
    }

    @GetMapping("/{id}")
    public StudentDB GetById(@PathVariable Long id){
      return  studentService.getById(id);
    };

    @PostMapping(value = "/add",consumes = MediaType.APPLICATION_JSON_VALUE)
    public StudentDB Add(@RequestBody StudentDto student){
        StudentDB studentDB=new StudentDB(student.getFirstName(),student.getLastName(),student.getEmail(),student.getAge());
        studentService.add(studentDB);

        return studentDB;
    }

    @DeleteMapping("/{id}")
    public String Delete(@PathVariable Long id){
        studentService.delete(id);
        return "deleted Successfully";
    }

    @PutMapping(value = "/{id}" ,consumes = MediaType.APPLICATION_JSON_VALUE)
    public StudentDB Edit(@PathVariable Long id , @RequestBody StudentDto student){
        StudentDB studentDB=new StudentDB(student.getFirstName(),student.getLastName(),student.getEmail(),student.getAge());

        studentService.update(id,studentDB);
        return studentDB;
    }
}
