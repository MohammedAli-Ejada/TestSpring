package com.example.demoJavaSpring.SpringMVC_Demo;

import com.example.demoJavaSpring.TestCourse2.IStudentService;
import com.example.demoJavaSpring.TestCourse2.Student;
import com.example.demoJavaSpring.TestCourse2.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller("studentController1")
@RequestMapping("/s")
public class StudentController {
    IStudentService studentService;
    public StudentController(IStudentService iStudentService){
        this.studentService=iStudentService;
    }

    @GetMapping
    public String GetAll(Model model){
        model.addAttribute("students",studentService.GetAll());
        return "students-list";
    }
    @GetMapping("/{id}")
    public String getEmployeeById(@PathVariable int id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        return "student-details";
    }

    @GetMapping("/showAdd")
    public String ShowViewAdd(Model model){
        model.addAttribute("student",new Student());
        return "student-form";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Student student){
        studentService.Add(student);
        return "redirect:/s";
    }

    @GetMapping("/showEdit/{id}")
    public String ShowViewEdit(@PathVariable int id, Model model){

        model.addAttribute("student",studentService.getStudentById(id));
        return "student-form-edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Student student){
        studentService.Update(student.getId(), student);
        return "redirect:/s";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        studentService.Delete(id);
        return "redirect:/s";
    }
}
