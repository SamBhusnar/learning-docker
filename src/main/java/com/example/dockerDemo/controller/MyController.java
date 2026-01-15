package com.example.dockerDemo.controller;

import com.example.dockerDemo.entity.Student;
import com.example.dockerDemo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private StudentRepo repo;

    @GetMapping("/hello")
    public String hello(){
        return  "<h1>Hello from spring application</h1>";
    }
    @GetMapping("/students")
    public List<Student> studentList(){
        return repo.findAll();
    }

}
