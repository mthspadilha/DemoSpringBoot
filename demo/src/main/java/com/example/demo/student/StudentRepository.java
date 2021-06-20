package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Essa classe abre uma monte de metodos!
//findAll, findOne...
//Sem uma linha de código ou SQL
//Utilizar no Service, mas aqui habilita, com a interface
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
