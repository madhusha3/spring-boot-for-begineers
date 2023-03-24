package com.madhu.springdemo.controller;

import com.madhu.springdemo.service.StudentService;
import com.madhu.springdemo.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

//    //To make this Method findAllStudnets() as endpoint url - annotate it with GetMapping
//    //This is Sample code
//    @GetMapping
//    public List<String> findAllStudents(){
//        return List.of(
//                "Madhu",
//                "Hello World"
//        );

/*  After creating Student POJO Class ->
    1st: Without using Spring Bean - we are creating Objects of StudentService inside StudentController
    To use the method inside the Service layer - create a Variable of Type Student Service
    using new Operator means it is tightly coupled - Spring DI and IoC is not used */

//    private StudentService studentService = new StudentService(); //creating an Object of StudentService
//    @GetMapping
//    public List<Student> findAllStudents()
//    {
//        return studentService.findAllStudents();
//    }

    //2nd Using Spring Bean to inject Object of StudentService.java class into StudentController.java

    //1st way is to Use @Autowired
//    @Autowired
//    private StudentService studentService; //creating an Object of StudentService

    //2nd way is to create a Constructor and use Autowired - Constructor Injection Recommended Approach
    private StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> findAllStudents()
    {
        return studentService.findAllStudents();
    }
}
