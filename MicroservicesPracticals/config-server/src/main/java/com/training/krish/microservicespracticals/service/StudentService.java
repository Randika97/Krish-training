package com.training.krish.microservicespracticals.service;

import com.training.krish.microservicespracticals.model.Student;

public interface StudentService {
    Student save(Student student);
    Student fetchStudentById(int student);

}
