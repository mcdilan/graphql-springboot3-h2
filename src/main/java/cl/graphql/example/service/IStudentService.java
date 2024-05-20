package cl.graphql.example.service;

import cl.graphql.example.entities.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {

    Optional<Student> findById(Long id);

    List<Student> findAll();

    void createStudent(Student student);

    void deleteById(Long id);
}
