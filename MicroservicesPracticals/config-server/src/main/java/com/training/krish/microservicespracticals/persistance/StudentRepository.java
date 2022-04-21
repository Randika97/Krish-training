package com.training.krish.microservicespracticals.persistance;

import com.training.krish.microservicespracticals.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
