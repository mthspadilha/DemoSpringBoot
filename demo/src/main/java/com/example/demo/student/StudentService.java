package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Matheus Padilha",
                        21,
                        LocalDate.of(1993, 8, 15),
                        "matheuspadilha.m@gmail.com"
                )
        );

    }
}
