package com.example.demoJavaSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    //@Autowired
    private  StudentService studentService;
    @Autowired
    public StudentController(StudentService sstudentServic){
        this.studentService=sstudentServic;
    }

//    public StudentController(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        studentService=(StudentService) context.getBean("studentService");
//
//    }
    @RequestMapping(method = RequestMethod.GET)
    public List<Student> GetAll() {
        return studentService.GetAll();
    }

    @RequestMapping( value = "{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id) {
        return studentService.getStudentById(id);
    }

    @RequestMapping(method = RequestMethod.POST ,consumes = MediaType.APPLICATION_JSON_VALUE)
    public void Add(@RequestBody Student student){
        studentService.Add(student);
    }
}
