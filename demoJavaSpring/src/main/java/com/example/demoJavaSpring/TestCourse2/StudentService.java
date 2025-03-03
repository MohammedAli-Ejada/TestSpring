package com.example.demoJavaSpring.TestCourse2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {



    private final   IStudentRepository studentRepository;
    @Autowired
    public StudentService(@Qualifier("sss") IStudentRepository sstudentRepository) {
        this.studentRepository = sstudentRepository;
    }
    /*
    @Autowired
    public  StudentService(@Qualifier("sss")IStudentRepository studentRepository){
        this.studentRepository=studentRepository;
      ;  // Create BeanFactory
//        BeanFactory factory = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader((DefaultListableBeanFactory) factory);
//        reader.loadBeanDefinitions(new ClassPathResource("Beans.xml"));
//
//        this.studentRepository = (StudentRepository) factory.getBean("studentRepository");


    }*/

    public List<Student> GetAll() {
        return studentRepository.GetAll();
    }

    public Student getStudentById(int id) {
        return studentRepository.getStudentById(id);
    }

    public void Add(Student student){
        studentRepository.Add(student);
    }

}
