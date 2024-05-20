package cl.graphql.example.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.graphql.example.entities.Student;
import cl.graphql.example.persistence.IStudentDAO;
import cl.graphql.example.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentDAO studentDAO;

    @Override
    @Transactional(readOnly = true)
    public Optional<Student> findById(Long id) {
        return studentDAO.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> findAll() {
        return (List<Student>) studentDAO.findAll();
    }

    @Override
    @Transactional
    public void createStudent(Student student) {
        studentDAO.save(student);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        studentDAO.deleteById(id);
    }
}
