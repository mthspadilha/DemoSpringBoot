package com.example.demo.student;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//Essa classe abre uma monte de metodos!
//findAll, findOne...
//Sem uma linha de código ou SQL
//Utilizar no Service, mas aqui habilita, com a interface
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    //SELECT * FROM STUDENT WHERE EMAIL = ?
    @Query("SELECT s FROM Student s WHERE s.email=?1")
    Optional<Student> findStudentByEmail(String email);
}
