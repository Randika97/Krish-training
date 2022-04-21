package com.training.krish.microservicespracticals.service.impl;


import com.training.krish.microservicespracticals.model.Student;
import com.training.krish.microservicespracticals.persistance.StudentRepository;
import com.training.krish.microservicespracticals.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public Student fetchStudentById(int id) {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()) {
            return student.get();
        }
        return null;
    }
}
