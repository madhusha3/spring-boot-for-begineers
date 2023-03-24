package com.madhu.springdemo.service;

import com.madhu.springdemo.student.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

//Implement Business Logic in Service Layer
@Service
public class StudentService {
    public List<Student> findAllStudents(){
        return List.of(
            new Student(
                        "Ashneer",
                        "Grover",
                        LocalDate.now(),
                        "abcd@gmail.com",
                        34 ),
                new Student(
                        "Aman",
                        "Bansal",
                        LocalDate.now(),
                        "defg@gmail.com",
                        30 )
        );
}
}

