package cl.graphql.example.persistence;

import cl.graphql.example.entities.Course;
import org.springframework.data.repository.CrudRepository;

public interface ICourseDAO extends CrudRepository<Course, Long> {
}
