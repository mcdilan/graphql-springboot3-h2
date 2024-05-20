package cl.graphql.example.persistence;

import cl.graphql.example.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentDAO extends CrudRepository<Student, Long> {
}
