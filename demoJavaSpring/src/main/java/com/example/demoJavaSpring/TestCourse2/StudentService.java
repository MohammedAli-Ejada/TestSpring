package com.example.demoJavaSpring.TestCourse2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService{



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

    @Override
    public List<Student> GetAll() {
        return studentRepository.GetAll();
    }
    @Override
    public Student getStudentById(int id) {
        return studentRepository.getStudentById(id);
    }
    @Override
    public void Add(Student student){
        studentRepository.Add(student);
    }
    @Override
    public void Update(int id, Student student) {
        studentRepository.Update(id,student);
    }
    @Override
    public void Delete(int Id) {
        studentRepository.Delete(Id);
    }

}
