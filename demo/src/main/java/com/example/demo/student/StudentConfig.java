package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
            Student Matheus = new Student(
                    1L,
                    "Matheus Padilha",
                    27,
                    LocalDate.of(1993, 8, 15),
                    "matheuspadilha.m@gmail.com"
            );

            Student Renata = new Student(
                    "Renata Padilha",
                    21,
                    LocalDate.of(1999, 1, 30),
                    "renata.padilham@gmail.com"
            );

            repository.saveAll(
                    List.of(Matheus, Renata)
            );

        };
    }
}
