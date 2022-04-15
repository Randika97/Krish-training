package com.training.krish.microservicespracticals.controllers;


import com.training.krish.microservicespracticals.model.Student;
import com.training.krish.microservicespracticals.service.StudentService;
import com.training.krish.microservicespracticals.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String greetingGet() {
        return "Hello Springboot";
    }

    @RequestMapping(value = "/home", method = RequestMethod.POST)
    public String greetingPost() {
        return "Hello Springboot";
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ResponseEntity<Student> fetchStudent(@RequestParam int id) {
        Student student = studentService.fetchStudentById(id);
        if (student == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok().body(student);
        }
    }
}
