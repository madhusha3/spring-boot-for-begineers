package com.madhu.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    //To make this Method findAllStudnets() as endpoint url - annotate it with GetMapping
    @GetMapping
    public List<String> findAllStudents(){
        return List.of(
                "Madhu",
                "Hello World"
        );

    }
}
